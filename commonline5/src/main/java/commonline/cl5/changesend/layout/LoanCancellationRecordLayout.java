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
package commonline.cl5.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class LoanCancellationRecordLayout extends AbstractCommonLineRecordLayout {
    public LoanCancellationRecordLayout() {
        super("@108");
    }

    protected void defineFields() {
        field("2", "Record Type", "9(2)");
        field("3", "Borrower SSN", "9(9)");
        field("4", "School ID", "9(8)");
        field("5", "Change Type Code", "X(1)");
        field("6", "Filler", "X(2)");
        field("7", "School Non-ED Branch ID", "X(4)");
        field("8", "Recipient ID", "X(8)");
        field("9", "Guarantor ID", "X(3)");
        field("10", "Recipient Non-ED Branch ID", "X(4)");
        field("11", "Unique Loan Identifier", "X(16)");
        field("12", "Guarantee Date (CCYYMMDD)", "X(8)");
        field("13", "Loan Type Code", "X(2)");
        field("14", "Alternative Loan Program Type Code", "X(3)");
        field("15", "First Disbursement Date5 (CCYYMMDD)", "X(8)");
        field("16", "Lender ID", "X(6)");
        field("17", "Servicer Code5", "X(6)");
        field("18", "Loan Period Begin Date (CCYYMMDD)", "X(8)");
        field("19", "Loan Period End Date (CCYYMMDD)", "X(8)");
        field("20", "Filler", "X(2)");
        field("21", "PLUS/Alternative Student SSN", "9(9)");
        field("22", "CommonLine Unique Identifier", "X(17)");
        field("23", "CommonLine Loan Sequence Number", "9(2)");
        field("24", "Cancellation Date (CCYYMMDD)", "9(8)");
        field("25", "Filler", "X(29)");
        field("26", "Filler", "X(9)");
        field("27", "Filler", "X(9)");
        field("28", "Filler", "X(9)");
        field("29", "Filler", "X(9)");
        field("30", "Lender Non-ED Branch ID", "X(4)");
        field("31", "Filler", "X(118)");
        field("32", "School Use Only", "X(23)");
        field("33", "Lender Use Only", "X(20)");
        field("34", "Guarantor Use Only", "X(23)");
        field("35", "Filler", "X(59)");
        field("36", "Record Status", "X(1)");
        field("37", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", "9(20)");
        recordTerminator("38");
    }
}
