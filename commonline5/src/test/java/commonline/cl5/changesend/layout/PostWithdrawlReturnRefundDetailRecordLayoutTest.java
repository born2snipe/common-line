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


public class PostWithdrawlReturnRefundDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new PostWithdrawlReturnRefundDetailRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 64;
    }

    protected String recordCode() {
        return "@128";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type", 3, 2);
        assertInteger("3", "Borrower SSN", 5, 9);
        assertInteger("4", "School ID", 14, 8);
        assertText("5", "Change Type Code", 22, 1);
        assertText("6", "Filler", 23, 2);
        assertText("7", "School Non-ED Branch ID", 25, 4);
        assertText("8", "Recipient ID5", 29, 8);
        assertText("9", "Guarantor ID", 37, 3);
        assertText("10", "Recipient Non-ED Branch ID", 40, 4);
        assertText("11", "Unique Loan Identifier", 44, 16);
        assertText("12", "Guarantee Date (CCYYMMDD)", 60, 8);
        assertText("13", "Loan Type Code", 68, 2);
        assertText("14", "Alternative Loan Program Type Code", 70, 3);
        assertText("15", "First Disbursement Date (CCYYMMDD)", 73, 8);
        assertText("16", "Lender ID", 81, 6);
        assertText("17", "Servicer Code", 87, 6);
        assertText("18", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertText("19", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("20", "Filler", 109, 2);
        assertInteger("21", "PLUS/Alternative Student SSN", 111, 9);
        assertText("22", "CommonLine Unique Identifier", 120, 17);
        assertInteger("23", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("24", "Disbursement Date (CCYYMMDD)", 139, 8);
        assertDecimal("25", "Disbursement Amount", 147, 8);
        assertText("26", "Filler", 155, 2);
        assertInteger("27", "Return to Lender Date", 157, 8);
        assertDecimal("28", "Return to Lender Amount", 165, 8);
        assertText("29", "Disbursement Date (CCYYMMDD)", 173, 8);
        assertText("30", "Disbursement Amount", 181, 8);
        assertText("31", "Filler", 189, 2);
        assertText("32", "Return to Lender Date", 191, 8);
        assertText("33", "Return to Lender Amount", 199, 8);
        assertText("34", "Disbursement Date (CCYYMMDD)", 207, 8);
        assertText("35", "Disbursement Amount", 215, 8);
        assertText("36", "Filler", 223, 2);
        assertText("37", "Return to Lender Date", 225, 8);
        assertText("38", "Return to Lender Amount", 233, 8);
        assertText("39", "Disbursement Date (CCYYMMDD)", 241, 8);
        assertText("40", "Disbursement Amount", 249, 8);
        assertText("41", "Filler", 257, 2);
        assertText("42", "Return to Lender Date5", 259, 8);
        assertText("43", "Return to Lender Amount5", 267, 8);
        assertText("44", "Net Amount Disbursed to Date5", 275, 8);
        assertText("45", "Filler", 283, 23);
        assertText("46", "Funds Return Method Code", 306, 1);
        assertInteger("47", "Disbursement Identification Number", 307, 2);
        assertText("48", "Disbursement Identification Number", 309, 2);
        assertText("49", "Disbursement Identification Number", 311, 2);
        assertText("50", "Disbursement Identification Number", 313, 2);
        assertInteger("51", "Filler", 315, 19);
        assertText("52", "School Use Only", 334, 23);
        assertText("53", "Lender Use Only", 357, 20);
        assertText("54", "Guarantor Use Only", 377, 23);
        assertText("55", "Filler", 400, 2);
        assertText("56", "Filler", 402, 9);
        assertText("57", "Filler", 411, 9);
        assertText("58", "Filler", 420, 9);
        assertText("59", "Filler", 429, 9);
        assertText("60", "Lender Non-ED Branch ID", 438, 4);
        assertText("61", "Filler", 442, 17);
        assertText("62", "Record Status", 459, 1);
        assertInteger("63", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("64", "Record Terminator", 480, 1);
    }
}
