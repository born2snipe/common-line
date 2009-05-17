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


public class DisbursementCancellationChangeDetailLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new DisbursementCancellationChangeDetailLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 46;
    }

    protected String recordCode() {
        return "@109";
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
        assertText("10", "Recipient Non-ED Branch ID5", 40, 4);
        assertText("11", "Unique Loan Identifier5", 44, 16);
        assertText("12", "Guarantee Date5 (CCYYMMDD)", 60, 8);
        assertText("13", "Loan Type Code", 68, 2);
        assertText("14", "Alternative Loan Program Type Code", 70, 3);
        assertText("15", "First Disbursement Date5 (CCYYMMDD)", 73, 8);
        assertText("16", "Lender ID", 81, 6);
        assertText("17", "Servicer Code5", 87, 6);
        assertText("18", "Loan Period Begin Date5 (CCYYMMDD)", 93, 8);
        assertText("19", "Loan Period End Date5 (CCYYMMDD)", 101, 8);
        assertText("20", "Filler", 109, 2);
        assertInteger("21", "PLUS/ Alternative Student SSN", 111, 9);
        assertText("22", "CommonLine Unique Identifier", 120, 17);
        assertInteger("23", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("24", "Disbursement Identification Number", 139, 2);
        assertInteger("25", "Disbursement Date (CCYYMMDD)", 141, 8);
        assertInteger("26", "Cancellation Date (CCYYMMDD)", 149, 8);
        assertDecimal("27", "Cancellation Amount", 157, 8);
        assertText("28", "Disbursement Hold/Release Indicator Code", 165, 1);
        assertInteger("29", "Revised Disbursement Date (CCYYMMDD)", 166, 8);
        assertDecimal("30", "Revised Disbursement Amount", 174, 8);
        assertText("31", "Reinstatement Indicator Code5", 182, 1);
        assertText("32", "Filler", 183, 21);
        assertText("33", "Filler", 204, 9);
        assertText("34", "Filler", 213, 9);
        assertText("35", "Filler", 222, 9);
        assertText("36", "Filler", 231, 9);
        assertText("37", "Lender Non-ED Branch ID", 240, 4);
        assertText("38", "Submittal As-Of Date5", 244, 8);
        assertText("39", "Filler", 252, 82);
        assertText("40", "School Use Only", 334, 23);
        assertText("41", "Lender Use Only", 357, 20);
        assertText("42", "Guarantor Use Only", 377, 23);
        assertText("43", "Filler", 400, 59);
        assertText("44", "Record Status6", 459, 1);
        assertInteger("45", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("46", "Record Terminator", 480, 1);
    }
}
