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
package commonline.file.parser;

import commonline.cl4.appsend.parser.AppSendParser;
import commonline.cl4.changesend.parser.ChangeSendParser;
import commonline.cl4.disbursement.parser.DisbursementParser;
import commonline.cl4.response.parser.ResponseParser;
import commonline.file.FileInfo;
import commonline.file.FileType;
import commonline.file.FileVersion;
import junit.framework.TestCase;


public class ParserRegistryTest extends TestCase {
    public void test_get() {
        ParserRegistry registry = new ParserRegistry();

        assertTrue(registry.get(new FileInfo(FileVersion.CL4, FileType.APP_SEND)) instanceof AppSendParser);
        assertTrue(registry.get(new FileInfo(FileVersion.CL4, FileType.CHANGE_SEND)) instanceof ChangeSendParser);
        assertTrue(registry.get(new FileInfo(FileVersion.CL4, FileType.DISBURSEMENT_ACKNOWLEDGEMENT)) instanceof DisbursementParser);
        assertTrue(registry.get(new FileInfo(FileVersion.CL4, FileType.DISBURSEMENT_ROSTER)) instanceof DisbursementParser);
        assertTrue(registry.get(new FileInfo(FileVersion.CL4, FileType.RESPONSE)) instanceof ResponseParser);
        assertTrue(registry.get(new FileInfo(FileVersion.CL5, FileType.APP_SEND)) instanceof commonline.cl5.appsend.parser.AppSendParser);
        assertTrue(registry.get(new FileInfo(FileVersion.CL5, FileType.CHANGE_SEND)) instanceof commonline.cl5.changesend.parser.ChangeSendParser);
        assertNull(registry.get(new FileInfo(FileVersion.CL5, FileType.DISBURSEMENT_ACKNOWLEDGEMENT)));
        assertNull(registry.get(new FileInfo(FileVersion.CL5, FileType.DISBURSEMENT_ROSTER)));
        assertNull(registry.get(new FileInfo(FileVersion.CL5, FileType.RESPONSE)));
    }
}
