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


public class LoanPeriodChangeRecordLayoutTest extends AbstractRecordLayoutTestCase {

    protected RecordLayout createRecordLayout() {
        return new LoanPeriodChangeRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 41;
    }

    protected String recordCode() {
        return "@107";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type R", 3, 2);
        assertInteger("3", "Borrower SSN R", 5, 9);
        assertInteger("4", "School ID R", 14, 8);
        assertText("5", "Filler", 22, 3);
        assertText("6", "School Non-ED Branch ID", 25, 4);
        assertText("7", "Recipient ID R", 29, 8);
        assertText("8", "Filler", 37, 3);
        assertText("9", "Recipient Non-ED Branch ID R1", 40, 4);
        assertText("10", "Unique Loan Identifier", 44, 16);
        assertInteger("11", "Guarantee Date (CCYYMMDD)", 60, 8);
        assertText("12", "Loan Type Code R", 68, 2);
        assertText("13", "Alternative Loan Program Type Code R1", 70, 3);
        assertInteger("14", "First Disbursement Date(CCYYMMDD)", 73, 8);
        assertText("15", "Lender ID R", 81, 6);
        assertText("16", "Servicer Code", 87, 6);
        assertInteger("17", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertInteger("18", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("19", "School Designated Branch/Division Code", 109, 2);
        assertInteger("20", "PLUS/Alternative Student SSN", 111, 9);
        assertText("21", "CommonLine Unique Identifier R", 120, 17);
        assertInteger("22", "CommonLine Loan Sequence Number R1", 137, 2);
        assertInteger("23", "Revised Loan Period Begin Date(CCYYMMDD)", 139, 8);
        assertInteger("24", "Revised Loan Period End Date(CCYYMMDD)", 147, 8);
        assertText("25", "Grade Level Code R", 155, 1);
        assertInteger("26", "Change Certification Date(CCYYMMDD)", 156, 8);
        assertText("27", "Filler", 164, 1);
        assertInteger("28", "Anticipated Completion Date(CCYYMMDD)", 165, 8);
        assertText("29", "Record Status", 173, 1);
        assertText("30", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 174, 20);
        assertText("31", "DUNS School ID O", 194, 9);
        assertText("32", "DUNS Recipient ID O", 203, 9);
        assertText("33", "DUNS Lender ID O", 212, 9);
        assertText("34", "DUNS Servicer Code", 221, 9);
        assertText("35", "Lender Non-ED Branch ID", 230, 4);
        assertText("36", "Filler", 234, 100);
        assertText("37", "School Use Only O", 334, 23);
        assertText("38", "Lender Use Only O", 357, 20);
        assertText("39", "Guarantor Use Only O", 377, 23);
        assertText("40", "Filler", 400, 80);
        assertText("41", "Record Terminator", 480, 1);

    }
}
