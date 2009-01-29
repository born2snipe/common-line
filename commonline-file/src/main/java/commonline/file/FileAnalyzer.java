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
package commonline.file;

import commonline.cl4.appsend.parser.AppSendParser;
import commonline.cl4.changesend.parser.ChangeSendParser;
import commonline.cl4.disbursement.parser.DisbursementParser;
import commonline.cl4.response.parser.ResponseParser;
import flapjack.io.LineRecordReader;
import flapjack.parser.ParseResult;
import flapjack.parser.RecordParser;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileAnalyzer {
    private HeaderLocator headerLocator;
    private Map parsers = new LinkedHashMap();
    private Map fileInfos = new LinkedHashMap();

    public FileAnalyzer() {
        this(new CommonlineHeaderLocator());
    }

    protected FileAnalyzer(HeaderLocator headerLocator) {
        this.headerLocator = headerLocator;
        initializeParsers();
    }

    // TODO -- this seems messy to have to put this here and in the ParserResolver
    private void initializeParsers() {
        registerParser(new FileInfo(FileVersion.CL4, FileType.CHANGE_SEND), new ChangeSendParser());
        registerParser(new FileInfo(FileVersion.CL4, FileType.APP_SEND), new AppSendParser());
        registerParser(new FileInfo(FileVersion.CL4, FileType.RESPONSE), new ResponseParser());
        registerParser(new FileInfo(FileVersion.CL4, FileType.DISBURSEMENT_ROSTER), new DisbursementParser());
        registerParser(new FileInfo(FileVersion.CL4, FileType.DISBURSEMENT_ACKNOWLEDGEMENT), new DisbursementParser());
    }

    protected void registerParser(FileInfo info, RecordParser parser) {
        parsers.put(info, parser);
        fileInfos.put(parser, info);
    }

    public FileInfo analyze(InputStream input) throws IllegalArgumentException {
        String headerRecord = headerLocator.locate(input);
        if (headerRecord == null) {
            throw new IllegalArgumentException("Could not locate header");
        }
        Iterator it = parsers.values().iterator();
        while (it.hasNext()) {
            LineRecordReader reader = new LineRecordReader(new ByteArrayInputStream(headerRecord.getBytes()));
            RecordParser parser = (RecordParser) it.next();
            try {
                ParseResult result = parser.parse(reader);
                if (result.getRecords().size() > 0) {
                    return (FileInfo) fileInfos.get(parser);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public FileInfo analyze(File file) throws IllegalArgumentException {
        try {
            return analyze(new FileInputStream(file));
        } catch (IllegalArgumentException err) {
            throw new IllegalArgumentException("Could not locate header record in file=" + file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected void setParsers(Map parsers) {
        this.parsers.clear();
        this.fileInfos.clear();
        Iterator it = parsers.keySet().iterator();
        while (it.hasNext()) {
            FileInfo info = (FileInfo) it.next();
            registerParser(info, (RecordParser) parsers.get(info));
        }
    }
}
