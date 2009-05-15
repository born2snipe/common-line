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
package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class SubUnsubReallocationLoanIncreaseRecordLayout extends AbstractCommonLineRecordLayout {
    public SubUnsubReallocationLoanIncreaseRecordLayout() {
        super("@114");
    }

    protected void defineFields() {
        field("2", "Record Type", "9(2)");
        field("3", "Borrower SSN", "9(9)");
        field("4", "School ID", "9(8)");
        field("5", "Filler", "X(3)");
        field("6", "School Non-ED Branch ID", "X(4)");
        field("7", "Recipient ID", "X(8)");
        field("8", "Filler", "X(3)");
        field("9", "Recipient Non-ED Branch ID", "X(4)");
        field("10", "Unique Loan Identifier", "X(16)");
        field("11", "Guarantee Date (CCYYMMDD)", "9(8)");
        field("12", "Loan Type Code", "X(2)");
        field("13", "Filler", "X(3)");
        field("14", "First Disbursement Date(CCYYMMDD)", "9(8)");
        field("15", "Lender ID", "X(6)");
        field("16", "Servicer Code", "X(6)");
        field("17", "Loan Period Begin Date (CCYYMMDD)", "9(8)");
        field("18", "Loan Period End Date (CCYYMMDD)", "9(8)");
        field("19", "School Designated Branch / Division Code", "X(2)");
        field("20", "Filler", "X(9)");
        field("21", "CommonLine Unique Identifier", "X(17)");
        field("22", "CommonLine Loan Sequence Number", "9(2)");
        field("23", "Increased Loan Amount", "9(6)");
        field("24", "Revised Certification Amount", "9(6)");
        field("25", "Cost of Attendance", "9(5)");
        field("26", "Expected Family Contribution Amount", "9(5)");
        field("27", "Estimated Financial Aid Amount", "9(5)");
        field("28", "Disbursement Date 1 (CCYYMMDD)", "9(8)");
        field("29", "Disbursement Amount 1", "9(6)V99");
        field("30", "Disbursement Date 2 (CCYYMMDD)", "9(8)");
        field("31", "Disbursement Amount 2", "9(6)V99");
        field("32", "Disbursement Date 3 (CCYYMMDD)", "9(8)");
        field("33", "Disbursement Amount 3", "9(6)V99");
        field("34", "Disbursement Date 4 (CCYYMMDD)", "9(8)");
        field("35", "Disbursement Amount 4", "9(6)V99");
        field("36", "Record Status", "X(1)");
        field("37", "Change Certification Date(CCYYMMDD)", "9(8)");
        field("38", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(20)");
        field("39", "DUNS School ID", "X(9)");
        field("40", "DUNS Recipient ID", "X(9)");
        field("41", "DUNS Lender ID", "X(9)");
        field("42", "DUNS Servicer Code", "X(9)");
        field("43", "Lender Non-ED branch ID", "X(4)");
        field("44", "Submittal As-Of Date", "9(8)");
        field("45", "Disbursement Identification Number 1", "9(2)");
        field("46", "Disbursement Identification Number 2", "9(2)");
        field("47", "Disbursement Identification Number 3", "9(2)");
        field("48", "Disbursement Identification Number 4", "9(2)");
        field("49", "Filler", "X(19)");
        field("50", "School Use Only", "X(23)");
        field("51", "Lender Use Only", "X(20)");
        field("52", "Guarantor Use Only", "X(23)");
        field("53", "Filler", "X(80)");
        recordTerminator("54");
    }

}
