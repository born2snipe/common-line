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
package commonline.cl4.changesend.parser;

import commonline.cl4.changesend.layout.*;
import commonline.core.parser.CommonLineRecordLayoutResolver;
import flapjack.parser.RecordLayoutResolver;
import junit.framework.TestCase;

import java.util.Iterator;


public class ChangeSendParserTest extends TestCase {
    private ChangeSendParser parser;

    protected void setUp() throws Exception {
        super.setUp();
        parser = new ChangeSendParser();
    }

    public void test_recordLayouts() {
        ChangeSendRecordLayoutResolver resolver = (ChangeSendRecordLayoutResolver) parser.getRecordLayoutResolver();

        assertEquals(14, resolver.getRecordLayouts().size());

        assertContainsRecordLayout(BorrowerDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(DisbursementCancellationChangeDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(DisbursementNotificationChangeRecordLayout.class, resolver);
        assertContainsRecordLayout(EmailInformationRecordLayout.class, resolver);
        assertContainsRecordLayout(HeaderRecordLayout.class, resolver);
        assertContainsRecordLayout(LoanCancellationReinstatementRecordLayout.class, resolver);
        assertContainsRecordLayout(LoanIncreaseRecordLayout.class, resolver);
        assertContainsRecordLayout(LoanPeriodChangeRecordLayout.class, resolver);
        assertContainsRecordLayout(SchoolRefundCorrectionRecordLayout.class, resolver);
        assertContainsRecordLayout(SchoolRefundRecordLayout.class, resolver);
        assertContainsRecordLayout(SubUnsubReallocationLoanDecreaseRecordLayout.class, resolver);
        assertContainsRecordLayout(SubUnsubReallocationLoanIncreaseRecordLayout.class, resolver);
        assertContainsRecordLayout(TrailerRecordLayout.class, resolver);
        assertContainsRecordLayout(UniqueSupplementRecordLayout.class, resolver);
    }

    public void test_recordLayoutResolver() {
        RecordLayoutResolver recordLayoutResolver = parser.getRecordLayoutResolver();
        assertNotNull(recordLayoutResolver);
        assertTrue(recordLayoutResolver instanceof ChangeSendRecordLayoutResolver);
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
