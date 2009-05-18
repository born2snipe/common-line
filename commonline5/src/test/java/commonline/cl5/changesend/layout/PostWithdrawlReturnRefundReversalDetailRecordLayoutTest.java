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


public class PostWithdrawlReturnRefundReversalDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new PostWithdrawlReturnRefundReversalDetailRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 63;
    }

    protected String recordCode() {
        return "@129";
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
        assertInteger("27", "Previously Reported Return to Lender Date", 157, 8);
        assertDecimal("28", "Previously Reported Return to Lender Amount", 165, 8);
        assertText("29", "Disbursement Date (CCYYMMDD)", 173, 8);
        assertText("30", "Disbursement Amount", 181, 8);
        assertText("31", "Filler", 189, 2);
        assertText("32", "Previously Reported Return to Lender Date", 191, 8);
        assertText("33", "Previously Reported Return to Lender Amount", 199, 8);
        assertText("34", "Disbursement Date (CCYYMMDD)", 207, 8);
        assertText("35", "Disbursement Amount", 215, 8);
        assertText("36", "Filler", 223, 2);
        assertText("37", "Previously Reported Return to Lender Date", 225, 8);
        assertText("38", "Previously Reported Return to Lender Amount", 233, 8);
        assertText("39", "Disbursement Date (CCYYMMDD)", 241, 8);
        assertText("40", "Disbursement Amount", 249, 8);
        assertText("41", "Filler", 257, 2);
        assertText("42", "Previously Reported Return to Lender Date", 259, 8);
        assertText("43", "Previously Reported Return to Lender Amount", 267, 8);
        assertText("44", "Net Amount Disbursed to Date", 275, 8);
        assertText("45", "Filler", 283, 23);
        assertInteger("46", "Disbursement Identification Number", 306, 2);
        assertText("47", "Disbursement Identification Number", 308, 2);
        assertText("48", "Disbursement Identification Number", 310, 2);
        assertText("49", "Disbursement Identification Number", 312, 2);
        assertInteger("50", "Filler", 314, 19);
        assertText("51", "School Use Only", 333, 23);
        assertText("52", "Lender Use Only", 356, 20);
        assertText("53", "Guarantor Use Only", 376, 23);
        assertText("54", "Filler", 399, 2);
        assertText("55", "Filler", 401, 9);
        assertText("56", "Filler", 410, 9);
        assertText("57", "Filler", 419, 9);
        assertText("58", "Filler", 428, 9);
        assertText("59", "Lender Non-ED Branch ID", 437, 4);
        assertText("60", "Filler", 441, 18);
        assertText("61", "Record Status", 459, 1);
        assertInteger("62", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("63", "Record Terminator", 480, 1);
    }
}
