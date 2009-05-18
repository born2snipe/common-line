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


public class LoanCancellationRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new LoanCancellationRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 38;
    }

    protected String recordCode() {
        return "@108";
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
        assertText("17", "Servicer Code5", 87, 6);
        assertText("18", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertText("19", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("20", "Filler", 109, 2);
        assertInteger("21", "PLUS/Alternative Student SSN", 111, 9);
        assertText("22", "CommonLine Unique Identifier", 120, 17);
        assertInteger("23", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("24", "Cancellation Date (CCYYMMDD)", 139, 8);
        assertText("25", "Filler", 147, 29);
        assertText("26", "Filler", 176, 9);
        assertText("27", "Filler", 185, 9);
        assertText("28", "Filler", 194, 9);
        assertText("29", "Filler", 203, 9);
        assertText("30", "Lender Non-ED Branch ID", 212, 4);
        assertText("31", "Filler", 216, 118);
        assertText("32", "School Use Only", 334, 23);
        assertText("33", "Lender Use Only", 357, 20);
        assertText("34", "Guarantor Use Only", 377, 23);
        assertText("35", "Filler", 400, 59);
        assertText("36", "Record Status", 459, 1);
        assertInteger("37", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("38", "Record Terminator", 480, 1);
    }
}
