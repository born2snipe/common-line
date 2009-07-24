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

import flapjack.util.StringUtil;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class RecordLengthFileAnalyzerTest extends TestCase {
    private RecordLengthFileAnalyzer analyzer;

    protected void setUp() throws Exception {
        super.setUp();
        analyzer = new RecordLengthFileAnalyzer();
    }
    
    public void test_ToShortOfLine() {
        assertNull(analyzer.analyze(createRecord(10)));
    }

    public void test_CL4_Response() {
        assertInfo(FileType.RESPONSE, FileVersion.CL4, analyzer.analyze(createRecord(1040)));
    }
    
    public void test_CL5_Response() {
        assertInfo(FileType.RESPONSE, FileVersion.CL5, analyzer.analyze(createRecord(1200)));
    }

    public void test_CL4_Disbursement() {
        assertInfo(FileType.DISBURSEMENT_ROSTER, FileVersion.CL4, analyzer.analyze(createRecord(560)));
    }
    
    public void test_CL5_ChangeSend() {
        assertInfo(FileType.CHANGE_SEND, FileVersion.CL5, analyzer.analyze(createRecord(480)));
    }

    public void test_CL4_AppSend() {
        assertInfo(FileType.APP_SEND, FileVersion.CL4, analyzer.analyze(createRecord(880)));
    }
    
    public void test_CL5_AppSend() {
        assertInfo(FileType.APP_SEND, FileVersion.CL5, analyzer.analyze(createRecord(960)));
    }

    private void assertInfo(FileType expectedType, FileVersion expectedVersion, FileInfo info) {
        assertNotNull(info);
        assertEquals(expectedType, info.getType());
        assertEquals(expectedVersion, info.getVersion());
    }

    private InputStream createRecord(int length) {
        return new ByteArrayInputStream(StringUtil.leftPad("X", length, 'X').getBytes());
    }


}
