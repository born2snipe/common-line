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
package commonline.cl4.disbursement.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class DisbursementDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new DisbursementDetailRecordLayout();
    }

    protected int recordLength() {
        return 560;
    }

    protected int fieldCount() {
        return 61;
    }

    protected String recordCode() {
        return "@1";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Record Type Indicator Code", 3, 1);
        assertText("3", "CommonLine Unique Identifier", 4, 17);
        assertInteger("4", "CommonLine Loan Sequence Number", 21, 2);
        assertText("5", "Borrower Last Name", 23, 35);
        assertText("6", "Borrower First Name", 58, 12);
        assertText("7", "Borrower Middle Initial", 70, 1);
        assertInteger("8", "Borrower SSN", 71, 9);
        assertText("9", "Borrower Address (line 1)", 80, 30);
        assertText("10", "Borrower Address (line 2)", 110, 30);
        assertText("11", "Borrower City", 140, 24);
        assertText("12", "Filler", 164, 6);
        assertText("13", "Borrower State", 170, 2);
        assertInteger("14", "Borrower Zip Code", 172, 5);
        assertInteger("15", "Borrower Zip Code Suffix", 177, 4);
        assertInteger("16", "Date Address Last Updated (CCYYMMDD)", 181, 8);
        assertText("17", "EFT Authorization Code", 189, 1);
        assertText("18", "PLUS/Alternative Student Last Name", 190, 35);
        assertText("19", "PLUS/Alternative Student First Name", 225, 12);
        assertText("20", "PLUS/Alternative Student Middle Initial", 237, 1);
        assertInteger("21", "PLUS/Alternative Student SSN", 238, 9);
        assertInteger("22", "School ID", 247, 8);
        assertText("23", "School Designated Branch/Division Code", 255, 2);
        assertText("24", "School Use Only", 257, 23);
        assertInteger("25", "Loan Period Begin Date (CCYYMMDD)", 280, 8);
        assertInteger("26", "Loan Period End Date (CCYYMMDD)", 288, 8);
        assertText("27", "Loan Type Code", 296, 2);
        assertText("28", "Alternative Loan Program Type Code", 298, 3);
        assertText("29", "Lender ID", 301, 6);
        assertText("30", "Lender Branch ID", 307, 4);
        assertText("31", "Lender Use Only", 311, 20);
        assertText("32", "Borrower Confirmation Indicator", 331, 1);
        assertText("33", "Filler", 332, 2);
        assertInteger("34", "Funds Release Date(CCYYMMDD)", 334, 8);
        assertInteger("35", "Disbursement Number", 342, 1);
        assertInteger("36", "Total Number of Scheduled Disbursements", 343, 1);
        assertText("37", "Guarantor ID", 344, 3);
        assertText("38", "Guarantor Use Only", 347, 23);
        assertInteger("39", "Guarantee Date (CCYYMMDD)", 370, 8);
        assertInteger("40", "Guarantee Amount", 378, 5);
        assertDecimal("41", "Gross Disbursement Amount", 383, 7);
        assertDecimal("42", "Origination Fee", 390, 7);
        assertDecimal("43", "Guarantee Fee", 397, 7);
        assertDecimal("44", "Net Disbursement Amount", 404, 7);
        assertText("45", "Funds Distribution Method Code", 411, 1);
        assertText("46", "Check Number", 412, 15);
        assertText("47", "Late Disbursement Indicator Code", 427, 1);
        assertText("48", "Previously Reported Indicator Code", 428, 1);
        assertText("49", "Error Message Code 1", 429, 3);
        assertText("50", "Error Message Code 2", 432, 3);
        assertText("51", "Error Message Code 3", 435, 3);
        assertText("52", "Error Message Code 4", 438, 3);
        assertText("53", "Error Message Code 5", 441, 3);
        assertDecimal("54", "Fees Paid", 444, 7);
        assertText("55", "Lender Name", 451, 15);
        assertDecimal("56", "Net Cancellation Amount", 466, 7);
        assertText("57", "DUNS School ID", 473, 9);
        assertText("58", "DUNS Lender ID", 482, 9);
        assertText("59", "DUNS Guarantor ID", 491, 9);
        assertText("60", "Filler", 500, 60);
        assertText("61", "Record Terminator", 560, 1);
    }
}
