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


public class SubUnsubReallocationLoanDecreaseRecordLayout extends AbstractCommonLineRecordLayout {
    public SubUnsubReallocationLoanDecreaseRecordLayout() {
        super("@113");
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
        field("15", "First Disbursement Date (CCYYMMDD)", "X(8)");
        field("16", "Lender ID", "X(6)");
        field("17", "Servicer Code", "X(6)");
        field("18", "Loan Period Begin Date (CCYYMMDD)", "X(8)");
        field("19", "Loan Period End Date (CCYYMMDD)", "X(8)");
        field("20", "Filler", "X(2)");
        field("21", "Filler", "X(9)");
        field("22", "CommonLine Unique Identifier", "X(17)");
        field("23", "CommonLine Loan Sequence Number", "9(2)");
        field("24", "Decreased Loan Amount", "9(6)");
        field("25", "Revised Certification Amount", "9(6)");
        field("26", "Cost of Attendance", "X(5)");
        field("27", "Expected Family Contribution Amount", "X(5)");
        field("28", "Estimated Financial Aid Amount", "X(5)");
        field("29", "Disbursement Date 1, 5, 9, 13, or 17 (CCYYMMDD)", "9(8)");
        field("30", "Disbursement Amount 1, 5, 9, 13, or 17", "9(6)v99");
        field("31", "Disbursement Date 2, 6, 10, 14, or 18 (CCYYMMDD)", "9(8)");
        field("32", "Disbursement Amount 2, 6, 10, 14, or 18", "9(6)v99");
        field("33", "Disbursement Date 3, 7, 11, 15, or 19 (CCYYMMDD)", "9(8)");
        field("34", "Disbursement Amount 3, 7, 11, 15, or 19", "9(6)v99");
        field("35", "Disbursement Date 4, 8, 12, 16, or 20 (CCYYMMDD)", "9(8)");
        field("36", "Disbursement Amount 4, 8, 12, 16, or 20", "9(6)v99");
        field("37", "Filler", "X(1)");
        field("38", "Change Certification Date (CCYYMMDD)", "9(8)");
        field("39", "Filler", "X(20)");
        field("40", "Filler", "X(9)");
        field("41", "Filler", "X(9)");
        field("42", "Filler", "X(9)");
        field("43", "Filler", "X(9)");
        field("44", "Lender Non-ED Branch ID", "X(4)");
        field("45", "Submittal As-Of Date", "X(8)");
        field("46", "Disbursement Identification Number 1, 5, 9, 13, or 17", "9(2)");
        field("47", "Disbursement Identification Number 2, 6, 10, 14, or 18", "9(2)");
        field("48", "Disbursement Identification Number 3, 7, 11, 15, 19", "9(2)");
        field("49", "Disbursement Identification Number 4, 8, 12, 16, or 20", "9(2)");
        field("50", "Filler", "X(19)");
        field("51", "School Use Only", "X(23)");
        field("52", "Lender Use Only", "X(20)");
        field("53", "Guarantor Use Only", "X(23)");
        field("54", "Filler", "X(59)");
        field("55", "Record Status6", "X(1)");
        field("56", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", "9(20)");
        recordTerminator("57");
    }
}
