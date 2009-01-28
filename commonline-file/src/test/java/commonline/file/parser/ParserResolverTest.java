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
import commonline.file.FileType;
import commonline.file.FileVersion;
import junit.framework.TestCase;


public class ParserResolverTest extends TestCase {

    public void test_resolve_ParserResolved() {
        ParserResolver resolver = new ParserResolver();

        assertTrue(resolver.resolver(FileType.RESPONSE, FileVersion.CL4) instanceof ResponseParser);
        assertTrue(resolver.resolver(FileType.APP_SEND, FileVersion.CL4) instanceof AppSendParser);
        assertTrue(resolver.resolver(FileType.CHANGE_SEND, FileVersion.CL4) instanceof ChangeSendParser);
        assertTrue(resolver.resolver(FileType.DISBURSEMENT_ACKNOWLEDGEMENT, FileVersion.CL4) instanceof DisbursementParser);
        assertTrue(resolver.resolver(FileType.DISBURSEMENT_ROSTER, FileVersion.CL4) instanceof DisbursementParser);
    }

    public void test_resolve_ParserUnResolved() {
        ParserResolver resolver = new ParserResolver();

        assertNull(resolver.resolver(FileType.RESPONSE, null));
    }
}
