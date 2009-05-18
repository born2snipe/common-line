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


public class LoanPeriodGradeLevelAnticipatedCompletionDateChangedRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new LoanPeriodGradeLevelAnticipatedCompletionDateChangedRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 43;
    }

    protected String recordCode() {
        return "@107";
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
        assertText("15", "First Disbursement Date (CCYYMMDD)", 73, 8);
        assertText("16", "Lender ID", 81, 6);
        assertText("17", "Servicer Code", 87, 6);
        assertText("18", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertText("19", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("20", "Filler", 109, 2);
        assertInteger("21", "PLUS/Alternative Student SSN", 111, 9);
        assertText("22", "CommonLine Unique Identifier", 120, 17);
        assertInteger("23", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("24", "Revised Loan Period Begin Date (CCYYMMDD)", 139, 8);
        assertInteger("25", "Revised Loan Period End Date (CCYYMMDD)", 147, 8);
        assertText("26", "Revised Grade Level Code", 155, 1);
        assertInteger("27", "Change Certification Date (CCYYMMDD)", 156, 8);
        assertText("28", "Filler", 164, 1);
        assertInteger("29", "Corrected Anticipated Completion Date (CCYYMMDD)", 165, 8);
        assertText("30", "Filler", 173, 21);
        assertText("31", "Filler", 194, 9);
        assertText("32", "Filler", 203, 9);
        assertText("33", "Filler", 212, 9);
        assertText("34", "Filler", 221, 9);
        assertText("35", "Lender Non-ED Branch ID", 230, 4);
        assertText("36", "Filler", 234, 100);
        assertText("37", "School Use Only", 334, 23);
        assertText("38", "Lender Use Only", 357, 20);
        assertText("39", "Guarantor Use Only", 377, 23);
        assertText("40", "Filler", 400, 59);
        assertText("41", "Record Status", 459, 1);
        assertInteger("42", "Date/Time Stamp (CCYYMMDDHHSSNNNNNN)", 460, 20);
        assertText("43", "Record Terminator", 480, 1);
    }
}
