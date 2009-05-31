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

import commonline.file.parser.ParserRegistry;
import flapjack.io.RecordReader;
import flapjack.parser.BadRecord;
import flapjack.parser.ParseResult;
import flapjack.parser.RecordParser;
import org.jmock.Mock;
import org.jmock.cglib.MockObjectTestCase;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;


public class FileAnalyzerTest extends MockObjectTestCase {
    private static final ByteArrayInputStream INPUT = new ByteArrayInputStream(new byte[0]);
    private static final String HEADER = "HEADER";
    private Mock headerLocator;
    private FileAnalyzer analyzer;
    private Mock appSendParser;
    private Mock changeSendParser;
    private Mock parserRegistry;

    protected void setUp() throws Exception {
        super.setUp();
        headerLocator = mock(HeaderLocator.class);
        appSendParser = mock(RecordParser.class, "appSend");
        changeSendParser = mock(RecordParser.class, "changeSend");
        parserRegistry = mock(ParserRegistry.class);

        Map parsers = new LinkedHashMap();
        parsers.put(new FileInfo(FileVersion.CL4, FileType.APP_SEND), appSendParser.proxy());
        parsers.put(new FileInfo(FileVersion.CL4, FileType.CHANGE_SEND), changeSendParser.proxy());

        analyzer = new ShuntFileAnalyzer((HeaderLocator) headerLocator.proxy());
        analyzer.setParserRegistry((ParserRegistry) parserRegistry.proxy());
    }

    public void test_analyze_HeaderNotFound() {
        headerLocator.expects(once()).method("locate").with(eq(INPUT)).will(returnValue(null));

        try {
            analyzer.analyze(INPUT);
            fail();
        } catch (IllegalArgumentException err) {
            assertEquals("Could not locate header", err.getMessage());
        }
    }

    public void test_analyze_HeaderFound_ParsedByAllParsers_WithoutSuccess() {
        headerLocator.expects(once()).method("locate").with(eq(INPUT)).will(returnValue(HEADER));

        parserRegistry.expects(once()).method("parsers").will(returnValue(Arrays.asList(new Object[]{appSendParser.proxy(), changeSendParser.proxy()})));

        appSendParser.expects(once()).method("parse").with(isA(RecordReader.class)).will(returnValue(createBadResult()));
        changeSendParser.expects(once()).method("parse").with(isA(RecordReader.class)).will(returnValue(createBadResult()));

        assertNull(analyzer.analyze(INPUT));
    }

    public void test_analyze_HeaderFound_ParsedByAnotherParser() {
        headerLocator.expects(once()).method("locate").with(eq(INPUT)).will(returnValue(HEADER));

        parserRegistry.expects(once()).method("parsers").will(returnValue(Arrays.asList(new Object[]{appSendParser.proxy(), changeSendParser.proxy()})));

        appSendParser.expects(once()).method("parse").with(isA(RecordReader.class)).will(returnValue(createBadResult()));
        changeSendParser.expects(once()).method("parse").with(isA(RecordReader.class)).will(returnValue(createGoodResult(new FileInfo(FileVersion.CL4, FileType.CHANGE_SEND))));

        FileInfo fileInfo = analyzer.analyze(INPUT);

        assertNotNull(fileInfo);
        assertEquals(FileVersion.CL4, fileInfo.getVersion());
        assertEquals(FileType.CHANGE_SEND, fileInfo.getType());
    }

    public void test_analyze_HeaderFound_ParserByFirstParser() {
        headerLocator.expects(once()).method("locate").with(eq(INPUT)).will(returnValue(HEADER));

        parserRegistry.expects(once()).method("parsers").will(returnValue(Arrays.asList(new Object[]{appSendParser.proxy()})));

        appSendParser.expects(once()).method("parse").with(isA(RecordReader.class)).will(returnValue(createGoodResult(new FileInfo(FileVersion.CL4, FileType.APP_SEND))));

        FileInfo fileInfo = analyzer.analyze(INPUT);

        assertNotNull(fileInfo);
        assertEquals(FileVersion.CL4, fileInfo.getVersion());
        assertEquals(FileType.APP_SEND, fileInfo.getType());
    }

    public void test_analyze_HeaderFound_ParserThrowsIOException() {
        headerLocator.expects(once()).method("locate").with(eq(INPUT)).will(returnValue(HEADER));

        parserRegistry.expects(once()).method("parsers").will(returnValue(Arrays.asList(new Object[]{appSendParser.proxy()})));

        IOException error = new IOException();
        appSendParser.expects(once()).method("parse").with(isA(RecordReader.class)).will(throwException(error));

        try {
            analyzer.analyze(INPUT);
            fail();
        } catch (RuntimeException err) {
            assertSame(error, err.getCause());
        }
    }

    private ParseResult createGoodResult(FileInfo fileInfo) {
        ParseResult result = new ParseResult();
        result.addRecord(fileInfo);
        return result;
    }

    private ParseResult createBadResult() {
        ParseResult badResult = new ParseResult();
        badResult.addPartialRecord(new BadRecord(new byte[0]));
        return badResult;
    }


    private static final class ShuntFileAnalyzer extends FileAnalyzer {
        private ShuntFileAnalyzer(HeaderLocator headerLocator) {
            super(headerLocator);
        }

        protected void applyToParser(RecordParser parser) {

        }
    }

}
