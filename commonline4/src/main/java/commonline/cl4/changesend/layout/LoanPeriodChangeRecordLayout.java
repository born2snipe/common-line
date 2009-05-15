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

/**
 * NCHELP CommonLine Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * LOAN PERIOD CHANGE (@1-07) DETAIL RECORD(S)
 */
public class LoanPeriodChangeRecordLayout extends AbstractCommonLineRecordLayout {
    public LoanPeriodChangeRecordLayout() {
        super("@107");
    }

    protected void defineFields() {
        field("2", "Record Type R", "9(2)");
        field("3", "Borrower SSN R", "9(9)");
        field("4", "School ID R", "9(8)");
        field("5", "Filler", "X(3)");
        field("6", "School Non-ED Branch ID", "X(4)");
        field("7", "Recipient ID R", "X(8)");
        field("8", "Filler", "X(3)");
        field("9", "Recipient Non-ED Branch ID R1", "X(4)");
        field("10", "Unique Loan Identifier", "X(16)");
        field("11", "Guarantee Date (CCYYMMDD)", "9(8)");
        field("12", "Loan Type Code R", "X(2)");
        field("13", "Alternative Loan Program Type Code R1", "X(3)");
        field("14", "First Disbursement Date(CCYYMMDD)", "9(8)");
        field("15", "Lender ID R", "X(6)");
        field("16", "Servicer Code", "X(6)");
        field("17", "Loan Period Begin Date (CCYYMMDD)", "9(8)");
        field("18", "Loan Period End Date (CCYYMMDD)", "9(8)");
        field("19", "School Designated Branch/Division Code", "X(2)");
        field("20", "PLUS/Alternative Student SSN", "9(9)");
        field("21", "CommonLine Unique Identifier R", "X(17)");
        field("22", "CommonLine Loan Sequence Number R1", "9(2)");
        field("23", "Revised Loan Period Begin Date(CCYYMMDD)", "9(8)");
        field("24", "Revised Loan Period End Date(CCYYMMDD)", "9(8)");
        field("25", "Grade Level Code R", "X(1)");
        field("26", "Change Certification Date(CCYYMMDD)", "9(8)");
        field("27", "Filler", "X(1)");
        field("28", "Anticipated Completion Date(CCYYMMDD)", "9(8)");
        field("29", "Record Status", "X(1)");
        field("30", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(20)");
        field("31", "DUNS School ID O", "X(9)");
        field("32", "DUNS Recipient ID O", "X(9)");
        field("33", "DUNS Lender ID O", "X(9)");
        field("34", "DUNS Servicer Code", "X(9)");
        field("35", "Lender Non-ED Branch ID", "X(4)");
        field("36", "Filler", "X(100)");
        field("37", "School Use Only O", "X(23)");
        field("38", "Lender Use Only O", "X(20)");
        field("39", "Guarantor Use Only O", "X(23)");
        field("40", "Filler", "X(80)");
        recordTerminator("41");
    }

}
