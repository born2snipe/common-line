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
import commonline.core.parser.AbstractCommonLineRecordParser;

import java.util.List;


public class ChangeSendParser extends AbstractCommonLineRecordParser {
    protected void initializeRecordLayouts(List recordLayouts) {
        recordLayouts.add(new AddressPhoneChangeRecordLayout());
        recordLayouts.add(new BorrowerDetailRecordLayout());
        recordLayouts.add(new DisbursementCancellationChangeDetailRecordLayout());
        recordLayouts.add(new DisbursementNotificationChangeRecordLayout());
        recordLayouts.add(new EmailInformationRecordLayout());
        recordLayouts.add(new HeaderRecordLayout());
        recordLayouts.add(new LoanCancellationRecordLayout());
        recordLayouts.add(new LoanIncreaseRecordLayout());
        recordLayouts.add(new LoanPeriodGradeLevelAnticipatedCompletionDateChangedRecordLayout());
        recordLayouts.add(new PostWithdrawlReturnRefundDetailRecordLayout());
        recordLayouts.add(new PostWithdrawlReturnRefundReversalDetailRecordLayout());
        recordLayouts.add(new SubUnsubReallocationLoanDecreaseRecordLayout());
        recordLayouts.add(new SubUnsubReallocationLoanIncreaseRecordLayout());
        recordLayouts.add(new TrailerRecordLayout());
        recordLayouts.add(new UniqueSupplementRecordLayout());
    }
}
