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
package commonline.cl4.response.parser;

import commonline.cl4.response.layout.*;
import commonline.core.parser.CommonLineRecordLayoutResolver;
import junit.framework.TestCase;

import java.util.Iterator;

import flapjack.parser.RecordLayoutResolver;


public class ResponseParserTest extends TestCase {

    public void test_verifyRecordLayouts() {
        ResponseParser parser = new ResponseParser();

        RecordLayoutResolver recordLayoutResolver = parser.getRecordLayoutResolver();
        assertNotNull(recordLayoutResolver);
        assertTrue(recordLayoutResolver instanceof CommonLineRecordLayoutResolver);

        CommonLineRecordLayoutResolver resolver = (CommonLineRecordLayoutResolver) recordLayoutResolver;
        assertContainsRecordLayout(AlternativeLoanRecordLayout.class, resolver);
        assertContainsRecordLayout(SupplementalBorrowerInformationRecordLayout.class, resolver);
        assertContainsRecordLayout(HeaderRecordLayout.class, resolver);
        assertContainsRecordLayout(TrailerRecordLayout.class, resolver);
        assertContainsRecordLayout(UniqueSupplementDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(SpecialMessagesRecordLayout.class, resolver);
        assertContainsRecordLayout(ResponseRecordLayout.class, resolver);
        assertContainsRecordLayout(ReferenceResponseRecordLayout.class, resolver);
        assertEquals(8, resolver.getRecordLayouts().size());
    }

    private void assertContainsRecordLayout(Class clazz, CommonLineRecordLayoutResolver resolver) {
        Iterator it = resolver.getRecordLayouts().iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj.getClass().equals(clazz)) {
                assertTrue(true);
                return;
            }
        }
        assertTrue("Could not find RecordLayout " + clazz.getName(), false);
    }
}
