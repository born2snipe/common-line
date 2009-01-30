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
package commonline.query.gui.action;

import commonline.core.layout.CommonlineFieldDefinition;
import commonline.file.FileAnalyzer;
import commonline.file.FileInfo;
import commonline.file.parser.ParserResolver;
import commonline.query.gui.ConsoleManager;
import commonline.query.gui.ErrorHandlerManager;
import commonline.query.model.CommonLineRecord;
import commonline.query.model.CommonlineRecordFactory;
import flapjack.annotation.parser.ByteMapRecordFieldParser;
import flapjack.annotation.parser.MappedFieldIdGenerator;
import flapjack.io.LineRecordReader;
import flapjack.layout.FieldDefinition;
import flapjack.model.SameRecordFactoryResolver;
import flapjack.parser.ParseResult;
import flapjack.parser.RecordParserImpl;
import flapjack.parser.BadRecord;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;


public class OpenAction extends AbtractMacableAction {
    private JFileChooser fileChooser;
    private JFrame parent;
    private FileAnalyzer fileAnalyzer = new FileAnalyzer();
    private ParserResolver parserResolver = new ParserResolver();
    private ByteMapRecordFieldParser fieldParser;
    private SameRecordFactoryResolver recordFactoryResolver;

    public OpenAction(boolean isMac, JFrame parent) {
        super("Open...", "Open up commonline files to query", KeyEvent.VK_O, isMac);
        this.parent = parent;
        fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fieldParser = new ByteMapRecordFieldParser();
        fieldParser.setFieldIdGenerator(new MappedFieldIdGenerator() {
            public String generate(FieldDefinition fieldDef) {
                CommonlineFieldDefinition commonlineFieldDefinition = (CommonlineFieldDefinition) fieldDef;
                return commonlineFieldDefinition.getId();
            }
        });
        recordFactoryResolver = new SameRecordFactoryResolver(CommonlineRecordFactory.class);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(parent)) {
            ConsoleManager consoleManager = ConsoleManager.instance();
            consoleManager.clear();
            for (File file : fileChooser.getSelectedFiles()) {
                try {
                    long start = System.currentTimeMillis();
                    // TODO - the parsing needs to get off the EventDispatch thread...or everything below this line
                    consoleManager.println("Analyzing file..." + file.getName());
                    FileInfo fileInfo = fileAnalyzer.analyze(file);
                    consoleManager.println("File Info: " + fileInfo.toString());
                    consoleManager.println("Parsing...");
                    RecordParserImpl parser = (RecordParserImpl) parserResolver.resolver(fileInfo.getType(), fileInfo.getVersion());
                    parser.setRecordFactoryResolver(recordFactoryResolver);
                    parser.setRecordFieldParser(fieldParser);
                    ParseResult result = parser.parse(new LineRecordReader(new FileInputStream(file)));
                    consoleManager.println("\n=======================");
                    consoleManager.println("Results for " + file.getName());
                    consoleManager.println("=======================");
                    consoleManager.println("Good Records:" + result.getRecords().size());
                    consoleManager.println("Partial Records:" + result.getPartialRecords().size());
                    consoleManager.println("Unresolvable Records:" + result.getUnresolvedRecords().size());
                    consoleManager.println("Unparseable Records:" + result.getUnparseableRecords().size());
                    consoleManager.println(((System.currentTimeMillis() - start) / 1000.0d) + " seconds");
                    consoleManager.println("=======================\n");

                    for (Object obj : result.getUnresolvedRecords()) {
                        BadRecord record = (BadRecord) obj;
                        System.out.println(new String(record.getContents()));
                    }
                } catch (Exception err) {
                    ErrorHandlerManager.instance().handle(err);
                }
            }
        }
    }

}
