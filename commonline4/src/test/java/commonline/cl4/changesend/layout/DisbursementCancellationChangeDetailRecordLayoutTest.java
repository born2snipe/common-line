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

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class DisbursementCancellationChangeDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {

    protected RecordLayout createRecordLayout() {
        return new DisbursementCancellationChangeDetailRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 45;
    }

    protected String recordCode() {
        return "@109";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type", 3, 2);
        assertInteger("3", "Borrower SSN", 5, 9);
        assertInteger("4", "School ID", 14, 8);
        assertText("5", "Filler", 22, 3);
        assertText("6", "School Non-ED Branch ID", 25, 4);
        assertText("7", "Recipient ID", 29, 8);
        assertText("8", "Filler", 37, 3);
        assertText("9", "Recipient Non-ED Branch ID", 40, 4);
        assertText("10", "Unique Loan Identifier", 44, 16);
        assertInteger("11", "Guarantee Date (CCYYMMDD)", 60, 8);
        assertText("12", "Loan Type Code", 68, 2);
        assertText("13", "Alternative Loan Program Type Code", 70, 3);
        assertInteger("14", "First Disbursement Date(CCYYMMDD)", 73, 8);
        assertText("15", "Lender ID", 81, 6);
        assertText("16", "Servicer Code", 87, 6);
        assertInteger("17", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertInteger("18", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("19", "School Designated Branch/Division Code", 109, 2);
        assertInteger("20", "PLUS/Alternative Student SSN", 111, 9);
        assertText("21", "CommonLine Unique Identifier", 120, 17);
        assertInteger("22", "CommonLine Loan Sequence Number", 137, 2);
        assertText("23", "Disbursement Number", 139, 1);
        assertInteger("24", "Disbursement Number", 140, 1);
        assertInteger("25", "Disbursement Date (CCYYMMDD)", 141, 8);
        assertInteger("26", "Cancellation Date (CCYYMMDD)", 149, 8);
        assertDecimal("27", "Cancellation Amount", 157, 8);
        assertText("28", "Disbursement Hold/Release Indicator Code", 165, 1);
        assertInteger("29", "Revised Disbursement Date(CCYYMMDD)", 166, 8);
        assertDecimal("30", "Revised Disbursement Amount", 174, 8);
        assertText("31", "Reinstatement Indicator Code", 182, 1);
        assertText("32", "Record Status", 183, 1);
        assertText("33", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 184, 20);
        assertText("34", "DUNS School ID", 204, 9);
        assertText("35", "DUNS Recipient ID", 213, 9);
        assertText("36", "DUNS Lender ID", 222, 9);
        assertText("37", "DUNS Servicer Code", 231, 9);
        assertText("38", "Lender Non-ED Branch ID", 240, 4);
        assertInteger("39", "Submittal As-Of Date", 244, 9);
        assertText("40", "Filler", 253, 82);
        assertText("41", "School Use Only", 335, 23);
        assertText("42", "Lender Use Only", 358, 20);
        assertText("43", "Guarantor Use Only", 378, 23);
        assertText("44", "Filler", 401, 80);
        assertText("45", "Record Terminator", 481, 1);
    }
}
