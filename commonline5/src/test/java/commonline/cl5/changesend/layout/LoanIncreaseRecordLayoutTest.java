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

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class LoanIncreaseRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new LoanIncreaseRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 57;
    }

    protected String recordCode() {
        return "@124";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type", 3, 2);
        assertInteger("3", "Borrower SSN", 5, 9);
        assertInteger("4", "School ID", 14, 8);
        assertText("5", "Change Type Code", 22, 1);
        assertText("6", "Filler", 23, 2);
        assertText("7", "School Non-ED Branch ID", 25, 4);
        assertText("8", "Recipient ID", 29, 8);
        assertText("9", "Guarantor ID", 37, 3);
        assertText("10", "Recipient Non-ED Branch ID", 40, 4);
        assertText("11", "Unique Loan Identifier", 44, 16);
        assertText("12", "Guarantee Date (CCYYMMDD)", 60, 8);
        assertText("13", "Loan Type Code", 68, 2);
        assertText("14", "Alternative Loan Program Type Code", 70, 3);
        assertText("15", "First Disbursement Date5 (CCYYMMDD)", 73, 8);
        assertText("16", "Lender ID", 81, 6);
        assertText("17", "Servicer Code", 87, 6);
        assertText("18", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertText("19", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("20", "Filler", 109, 2);
        assertInteger("21", "PLUS/Alternative Student SSN", 111, 9);
        assertText("22", "CommonLine Unique Identifier", 120, 17);
        assertInteger("23", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("24", "Increased Loan Amount", 139, 6);
        assertInteger("25", "Revised Certification Amount", 145, 6);
        assertText("26", "Cost of Attendance", 151, 5);
        assertText("27", "Expected Family Contribution Amount", 156, 5);
        assertText("28", "Estimated Financial Aid Amount5", 161, 5);
        assertInteger("29", "Disbursement Date 1, 5, 9, 13, or 17 (CCYYMMDD)", 166, 8);
        assertDecimal("30", "Disbursement Amount 1, 5, 9, 13, or 17", 174, 8);
        assertInteger("31", "Disbursement Date 2, 6, 10, 14, or 18 (CCYYMMDD)", 182, 8);
        assertDecimal("32", "Disbursement Amount 2, 6, 10, 14, or 18", 190, 8);
        assertInteger("33", "Disbursement Date 3, 7, 11, 15, or 19 (CCYYMMDD)", 198, 8);
        assertDecimal("34", "Disbursement Amount 3, 7, 11, 15, or 19", 206, 8);
        assertInteger("35", "Disbursement Date 4, 8, 12, 16, or 20 (CCYYMMDD)", 214, 8);
        assertDecimal("36", "Disbursement Amount 4, 8, 12, 16, or 20", 222, 8);
        assertText("37", "Filler", 230, 1);
        assertInteger("38", "Change Certification Date (CCYYMMDD)", 231, 8);
        assertText("39", "Filler", 239, 20);
        assertText("40", "Filler", 259, 9);
        assertText("41", "Filler", 268, 9);
        assertText("42", "Filler", 277, 9);
        assertText("43", "Filler", 286, 9);
        assertText("44", "Lender Non-ED Branch ID", 295, 4);
        assertText("45", "Submittal As-Of Date", 299, 8);
        assertInteger("46", "Disbursement Identification Number 1, 5, 9, 13, or 17", 307, 2);
        assertInteger("47", "Disbursement Identification Number 2, 6, 10, 14, or 18", 309, 2);
        assertInteger("48", "Disbursement Identification Number 3, 7, 11, 15, 19", 311, 2);
        assertInteger("49", "Disbursement Identification Number 4, 8, 12, 16, or 20", 313, 2);
        assertText("50", "Filler", 315, 19);
        assertText("51", "School Use Only", 334, 23);
        assertText("52", "Lender Use Only", 357, 20);
        assertText("53", "Guarantor Use Only", 377, 23);
        assertText("54", "Filler", 400, 59);
        assertText("55", "Record Status6", 459, 1);
        assertInteger("56", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("57", "Record Terminator", 480, 1);
    }
}
