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


public class BorrowerDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new BorrowerDetailRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 25;
    }

    protected String recordCode() {
        return "@102";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type", 3, 2);
        assertInteger("3", "Borrower SSN", 5, 9);
        assertText("4", "Source ID", 14, 8);
        assertText("5", "Filler", 22, 3);
        assertText("6", "Source Non-ED Branch ID5", 25, 4);
        assertText("7", "Recipient ID", 29, 8);
        assertText("8", "Filler", 37, 3);
        assertText("9", "Recipient Non-ED Branch ID", 40, 4);
        assertText("10", "Filler", 44, 12);
        assertText("11", "Borrower Last Name", 56, 35);
        assertText("12", "Borrower First Name", 91, 12);
        assertText("13", "Borrower Middle Initial", 103, 1);
        assertInteger("14", "Borrower Date of Birth (CCYYMMDD)", 104, 8);
        assertText("15", "Filler", 112, 21);
        assertText("16", "Filler", 133, 9);
        assertText("17", "Filler", 142, 9);
        assertText("18", "Filler", 151, 183);
        assertText("19", "School Use Only", 334, 23);
        assertText("20", "Lender Use Only", 357, 20);
        assertText("21", "Guarantor Use Only", 377, 23);
        assertText("22", "Filler", 400, 59);
        assertText("23", "Record Status5", 459, 1);
        assertInteger("24", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("25", "Record Terminator", 480, 1);
    }
}
