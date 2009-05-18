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
package commonline.cl5.changesend.parser;

import commonline.cl5.changesend.layout.*;
import commonline.core.parser.CommonLineRecordLayoutResolver;
import commonline.test.parser.ParserTestCase;


public class ChangeSendParserTest extends ParserTestCase {
    public void test() {
        ChangeSendParser parser = new ChangeSendParser();
        CommonLineRecordLayoutResolver resolver = (CommonLineRecordLayoutResolver) parser.getRecordLayoutResolver();

        assertContainsRecordLayout(AddressPhoneChangeRecordLayout.class, resolver);
        assertContainsRecordLayout(BorrowerDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(DisbursementCancellationChangeDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(DisbursementNotificationChangeRecordLayout.class, resolver);
        assertContainsRecordLayout(EmailInformationRecordLayout.class, resolver);
        assertContainsRecordLayout(HeaderRecordLayout.class, resolver);
        assertContainsRecordLayout(LoanCancellationRecordLayout.class, resolver);
        assertContainsRecordLayout(LoanIncreaseRecordLayout.class, resolver);
        assertContainsRecordLayout(LoanPeriodGradeLevelAnticipatedCompletionDateChangedRecordLayout.class, resolver);
        assertContainsRecordLayout(PostWithdrawlReturnRefundDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(PostWithdrawlReturnRefundReversalDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(SubUnsubReallocationLoanDecreaseRecordLayout.class, resolver);
        assertContainsRecordLayout(SubUnsubReallocationLoanIncreaseRecordLayout.class, resolver);
        assertContainsRecordLayout(TrailerRecordLayout.class, resolver);
        assertContainsRecordLayout(UniqueSupplementRecordLayout.class, resolver);

        assertEquals(15, resolver.getRecordLayouts().size());
    }
}
