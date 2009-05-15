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


public class SchoolRefundCorrectionRecordLayout extends AbstractCommonLineRecordLayout {
    public SchoolRefundCorrectionRecordLayout() {
        super("@112");
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
        field("13", "Alternative Loan Program Type Code", "X(3)");
        field("14", "First Disbursement Date(CCYYMMDD)", "9(8)");
        field("15", "Lender ID", "X(6)");
        field("16", "Servicer Code", "X(6)");
        field("17", "Loan Period Begin Date (CCYYMMDD)", "9(8)");
        field("18", "Loan Period End Date (CCYYMMDD)", "9(8)");
        field("19", "School Designated Branch/Division Code", "X(2)");
        field("20", "PLUS/Alternative Student SSN", "9(9)");
        field("21", "CommonLine Unique Identifier", "X(17)");
        field("22", "CommonLine Loan Sequence Number", "9(2)");
        field("23", "Last School Refund Date (CCYYMMDD)", "9(8)");
        field("24", "Cumulative School Refund Amount", "9(6)V99");
        field("25", "Revised School Refund Date", "9(8)");
        field("26", "Revised School Refund Amount", "9(6)V99");
        field("27", "Record Status", "X(1)");
        field("28", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(20)");
        field("29", "DUNS School ID", "X(9)");
        field("30", "DUNS Recipient ID", "X(9)");
        field("31", "DUNS Lender ID", "X(9)");
        field("32", "DUNS Servicer Code", "X(9)");
        field("33", "Filler", "X(186)");
        field("34", "School Use Only", "X(23)");
        field("35", "Lender Use Only", "X(20)");
        field("36", "Guarantor Use Only", "X(23)");
        recordTerminator("37");
    }

}
