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


public class EmailInformationRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new EmailInformationRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 23;
    }

    protected String recordCode() {
        return "@119";
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
        assertText("10", "E-mail Address", 44, 256);
        assertText("11", "E-mail Address Validity Indicator", 300, 1);
        assertInteger("12", "E-mail Address Effective Date(CCYYMMDD)", 301, 8);
        assertText("13", "Record Status", 309, 1);
        assertText("14", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 310, 20);
        assertText("15", "DUNS School ID", 330, 9);
        assertText("16", "DUNS Recipient ID", 339, 9);
        assertText("17", "Servicer Code", 348, 6);
        assertText("18", "DUNS Servicer Code", 354, 9);
        assertText("19", "Filler", 363, 51);
        assertText("20", "School Use Only", 414, 23);
        assertText("21", "Lender Use Only", 437, 20);
        assertText("22", "Guarantor Use Only", 457, 23);
        assertText("23", "Record Terminator", 480, 1);
    }
}
