/**
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package commonline.query.gui;

import commonline.core.layout.CommonlineFieldDefinition;
import commonline.file.FileAnalyzer;
import commonline.file.FileInfo;
import commonline.file.parser.ParserResolver;
import commonline.query.model.CommonLineRecord;
import commonline.query.model.CommonlineRecordFactory;
import flapjack.io.LineRecordReader;
import flapjack.layout.FieldDefinition;
import flapjack.model.SameRecordFactoryResolver;
import flapjack.parser.ByteMapRecordFieldParser;
import flapjack.parser.MappedFieldIdGenerator;
import flapjack.parser.ParseResult;
import flapjack.parser.RecordParserImpl;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


public class LoadFilesWorker extends SwingWorker<Void, Void> {
    private FileAnalyzer fileAnalyzer = new FileAnalyzer();
    private ParserResolver parserResolver = new ParserResolver();
    private ByteMapRecordFieldParser fieldParser;
    private SameRecordFactoryResolver recordFactoryResolver;
    private List<File> files = new ArrayList<File>();
    private CommonlineRecordRepository repository;

    public LoadFilesWorker(List<File> files, CommonlineRecordRepository repository) {
        this.files.addAll(files);
        fieldParser = new ByteMapRecordFieldParser();
        fieldParser.setFieldIdGenerator(new MappedFieldIdGenerator() {
            public String generate(FieldDefinition fieldDef) {
                CommonlineFieldDefinition commonlineFieldDefinition = (CommonlineFieldDefinition) fieldDef;
                return commonlineFieldDefinition.getId();
            }
        });
        recordFactoryResolver = new SameRecordFactoryResolver(CommonlineRecordFactory.class);
        this.repository = repository;
    }

    protected Void doInBackground() throws Exception {
        ConsoleManager consoleManager = ConsoleManager.instance();
        consoleManager.clear();
        long start = System.currentTimeMillis();
        for (File file : files) {
            try {
                consoleManager.println("Analyzing file..." + file.getName());
                FileInfo fileInfo = fileAnalyzer.analyze(file);
                if (fileInfo == null) {
                    consoleManager.println(file.getName() + " is NOT a commonline file!\n");
                    continue;
                }
                consoleManager.println("File Info: " + fileInfo.toString());
                consoleManager.println("Parsing...");
                RecordParserImpl parser = (RecordParserImpl) parserResolver.resolver(fileInfo.getType(), fileInfo.getVersion());
                parser.setRecordFactoryResolver(recordFactoryResolver);
                ParseResult result = parser.parse(new LineRecordReader(new FileInputStream(file)));
                consoleManager.println("\n=======================");
                consoleManager.println("Results for " + file.getName());
                consoleManager.println("=======================");
                consoleManager.println("Records:" + result.getRecords().size());
                consoleManager.println("Partial Records:" + result.getPartialRecords().size());
                consoleManager.println("Unresolvable Records:" + result.getUnresolvedRecords().size());
                consoleManager.println("Unparseable Records:" + result.getUnparseableRecords().size());
                consoleManager.println("=======================\n");

                for (Object o : result.getRecords()) {
                    CommonLineRecord record = (CommonLineRecord) o;
                    repository.save(record, fileInfo.getVersion());
                }

            } catch (Exception err) {
                err.printStackTrace();
                ErrorHandlerManager.instance().handle(err);
            }
        }

        consoleManager.println("\nCompleted loading files in " + ((System.currentTimeMillis() - start) / 1000.0d) + " seconds");
        return null;
    }

}
