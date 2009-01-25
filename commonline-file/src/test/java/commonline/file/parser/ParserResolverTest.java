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

import commonline.cl4.response.parser.ResponseParser;
import commonline.file.FileType;
import commonline.file.FileVersion;
import flapjack.parser.RecordParser;
import junit.framework.TestCase;


public class ParserResolverTest extends TestCase {

    public void test_resolve_ParserResolved() {
        ParserResolver resolver = new ParserResolver();

        RecordParser parser = resolver.resolver(FileType.RESPONSE, FileVersion.CL4);

        assertNotNull(parser);
        assertTrue(parser instanceof ResponseParser);
    }

    public void test_resolve_ParserUnResolved() {
        ParserResolver resolver = new ParserResolver();

        assertNull(resolver.resolver(FileType.RESPONSE, null));
    }
}
