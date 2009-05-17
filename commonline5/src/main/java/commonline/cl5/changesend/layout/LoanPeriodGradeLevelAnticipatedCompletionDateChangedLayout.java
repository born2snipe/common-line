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


public class LoanPeriodGradeLevelAnticipatedCompletionDateChangedLayout extends AbstractCommonLineRecordLayout {
    public LoanPeriodGradeLevelAnticipatedCompletionDateChangedLayout() {
        super("@107");
    }

    protected void defineFields() {
        field("2", "Record Type", "9(2)");
        field("3", "Borrower SSN", "9(9)");
        field("4", "School ID", "9(8)");
        field("5", "Change Type Code", "X(1)");
        field("6", "Filler", "X(2)");
        field("7", "School Non-ED Branch ID", "X(4)");
        field("8", "Recipient ID5", "X(8)");
        field("9", "Guarantor ID", "X(3)");
        field("10", "Recipient Non-ED Branch ID5", "X(4)");
        field("11", "Unique Loan Identifier5", "X(16)");
        field("12", "Guarantee Date5 (CCYYMMDD)", "X(8)");
        field("13", "Loan Type Code", "X(2)");
        field("14", "Alternative Loan Program Type Code", "X(3)");
        field("15", "First Disbursement Date (CCYYMMDD)", "X(8)");
        field("16", "Lender ID", "X(6)");
        field("17", "Servicer Code", "X(6)");
        field("18", "Loan Period Begin Date (CCYYMMDD)", "X(8)");
        field("19", "Loan Period End Date (CCYYMMDD)", "X(8)");
        field("20", "Filler", "X(2)");
        field("21", "PLUS/Alternative Student SSN", "9(9)");
        field("22", "CommonLine Unique Identifier", "X(17)");
        field("23", "CommonLine Loan Sequence Number", "9(2)");
        field("24", "Revised Loan Period Begin Date (CCYYMMDD)", "9(8)");
        field("25", "Revised Loan Period End Date (CCYYMMDD)", "9(8)");
        field("26", "Revised Grade Level Code", "X(1)");
        field("27", "Change Certification Date (CCYYMMDD)", "9(8)");
        field("28", "Filler", "X(1)");
        field("29", "Corrected Anticipated Completion Date (CCYYMMDD)", "9(8)");
        field("30", "Filler", "X(21)");
        field("31", "Filler", "X(9)");
        field("32", "Filler", "X(9)");
        field("33", "Filler", "X(9)");
        field("34", "Filler", "X(9)");
        field("35", "Lender Non-ED Branch ID", "X(4)");
        field("36", "Filler", "X(100)");
        field("37", "School Use Only", "X(23)");
        field("38", "Lender Use Only", "X(20)");
        field("39", "Guarantor Use Only", "X(23)");
        field("40", "Filler", "X(59)");
        field("41", "Record Status", "X(1)");
        field("42", "Date/Time Stamp (CCYYMMDDHHSSNNNNNN)", "9(20)");
        recordTerminator("43");
    }
}
