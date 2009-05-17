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


public class DisbursementNotificationChangeRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new DisbursementNotificationChangeRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 51;
    }

    protected String recordCode() {
        return "@110";
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
        assertText("15", "First Disbursement Date (CCYYMMDD)", 73, 8);
        assertText("16", "Lender ID", 81, 6);
        assertText("17", "Servicer Code", 87, 6);
        assertText("18", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertText("19", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("20", "Filler", 109, 2);
        assertInteger("21", "PLUS/Alternative Student SSN", 111, 9);
        assertText("22", "CommonLine Unique Identifier", 120, 17);
        assertInteger("23", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("24", "Disbursement Identification Number", 139, 2);
        assertText("25", "Disbursement Identification Number Date (CCYYMMDD)", 141, 8);
        assertInteger("26", "Disbursement Date (CCYYMMDD)", 149, 8);
        assertText("27", "Gross Disbursement Amount", 157, 8);
        assertInteger("28", "Cancellation Date (CCYYMMDD)", 165, 8);
        assertDecimal("29", "Cancellation Amount", 173, 8);
        assertText("30", "Disbursement Consummation Indicator Code", 181, 1);
        assertDecimal("31", "Actual Returned Amount", 182, 8);
        assertText("32", "Funds Return Method Code", 190, 1);
        assertText("33", "Funds Reissue Indicator Code", 191, 1);
        assertInteger("34", "Revised Disbursement Date (CCYYMMDD)", 192, 8);
        assertDecimal("35", "Revised Disbursement Amount", 200, 8);
        assertText("36", "Reinstatement Indicator Code", 208, 1);
        assertText("37", "Filler", 209, 21);
        assertText("38", "Filler", 230, 9);
        assertText("39", "Filler", 239, 9);
        assertText("40", "Filler", 248, 9);
        assertText("41", "Filler", 257, 9);
        assertText("42", "Lender Non-Ed Branch ID", 266, 4);
        assertText("43", "Submittal As-Of Date", 270, 8);
        assertText("44", "Filler", 278, 56);
        assertText("45", "School Use Only", 334, 23);
        assertText("46", "Lender Use Only", 357, 20);
        assertText("47", "Guarantor Use Only", 377, 23);
        assertText("48", "Filler", 400, 59);
        assertText("49", "Record Status", 459, 1);
        assertInteger("50", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("51", "Record Terminator", 480, 1);
    }
}
