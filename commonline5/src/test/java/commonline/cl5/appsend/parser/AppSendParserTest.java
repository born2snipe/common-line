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
package commonline.cl5.appsend.parser;

import commonline.cl5.appsend.layout.*;
import commonline.core.parser.CommonLineRecordLayoutResolver;
import commonline.test.parser.ParserTestCase;


public class AppSendParserTest extends ParserTestCase {
    public void test() {
        AppSendParser parser = new AppSendParser();
        CommonLineRecordLayoutResolver resolver = (CommonLineRecordLayoutResolver) parser.getRecordLayoutResolver();

        assertContainsRecordLayout(AlternativeLoanDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(ApplicationSendDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(HeaderRecordLayout.class, resolver);
        assertContainsRecordLayout(ReferenceDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(SupplementalBorrowerInformationRecordLayout.class, resolver);
        assertContainsRecordLayout(TrailerRecordLayout.class, resolver);
        assertContainsRecordLayout(UniqueSupplementDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(SupplementalDisbursementSendDetailRecordLayout.class, resolver);

        assertEquals(8, resolver.getRecordLayouts().size());
    }
}
