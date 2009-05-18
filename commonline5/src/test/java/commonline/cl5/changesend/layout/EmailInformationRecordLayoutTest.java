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


public class EmailInformationRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new EmailInformationRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 28;
    }

    protected String recordCode() {
        return "@119";
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
        assertText("10", "Recipient Non-ED Branch ID5", 40, 4);
        assertText("11", "E-mail Address", 44, 256);
        assertText("12", "E-mail Address Validity Indicator", 300, 1);
        assertInteger("13", "E-mail Address Effective Date (CCYYMMDD)", 301, 8);
        assertText("14", "Filler", 309, 25);
        assertText("15", "School Use Only", 334, 23);
        assertText("16", "Lender Use Only", 357, 20);
        assertText("17", "Guarantor Use Only", 377, 23);
        assertText("18", "Lender ID", 400, 6);
        assertText("19", "Lender Non-ED Branch ID", 406, 4);
        assertText("20", "Filler", 410, 8);
        assertText("21", "Servicer Code", 418, 6);
        assertText("22", "Filler", 424, 9);
        assertText("23", "Submittal As-Of Date", 433, 8);
        assertText("24", "Filler", 441, 9);
        assertText("25", "Filler", 450, 9);
        assertText("26", "Record Status", 459, 1);
        assertInteger("27", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("28", "Record Terminator", 480, 1);
    }
}
