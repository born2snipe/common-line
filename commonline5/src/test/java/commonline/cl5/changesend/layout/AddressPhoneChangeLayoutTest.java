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


public class AddressPhoneChangeLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new AddressPhoneChangeLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 44;
    }

    protected String recordCode() {
        return "@105";
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
        assertText("11", "Borrower Address Indicator", 44, 1);
        assertText("12", "Borrower Street Address 1 (line 1)", 45, 35);
        assertText("13", "Borrower Street Address 2 (line 2)", 80, 35);
        assertText("14", "Borrower City", 115, 24);
        assertText("15", "Borrower State", 139, 2);
        assertText("16", "Borrower Country", 141, 25);
        assertText("17", "Borrower Zip Code/Foreign Postal Code", 166, 14);
        assertText("18", "Borrower Address Validity Indicator", 180, 1);
        assertInteger("19", "Borrower Address Effective Date (CCYYMMDD)", 181, 8);
        assertText("20", "Borrower Home Telephone Number", 189, 10);
        assertText("21", "Borrower Home Foreign Telephone Number Prefix", 199, 10);
        assertText("22", "Borrower Home Telephone Number Validity Indicator", 209, 1);
        assertInteger("23", "Borrower Home Telephone Number Effective Date (CCYYMMDD)", 210, 8);
        assertText("24", "Borrower Work Telephone Number", 218, 10);
        assertText("25", "Borrower Work Telephone Number Foreign Prefix", 228, 10);
        assertText("26", "Borrower Work Telephone Number Validity Indicator", 238, 1);
        assertInteger("27", "Borrower Work Telephone Number Effective Date (CCYYMMDD)", 239, 8);
        assertText("28", "Other Telephone Number", 247, 10);
        assertText("29", "Other Telephone Number Foreign Prefix", 257, 10);
        assertText("30", "Other Telephone Number Validity Indicator", 267, 1);
        assertInteger("31", "Other Telephone Number Effective Date (CCYYMMDD)", 268, 8);
        assertText("32", "Lender ID", 276, 6);
        assertText("33", "Lender Non-ED Branch ID", 282, 4);
        assertText("34", "Filler", 286, 48);
        assertText("35", "School Use Only5", 334, 23);
        assertText("36", "Lender Use Only", 357, 20);
        assertText("37", "Guarantor Use Only", 377, 23);
        assertText("38", "Filler", 400, 33);
        assertText("39", "Submittal As-Of-Date5 (CCYYMMDD)", 433, 8);
        assertText("40", "Filler", 441, 9);
        assertText("41", "Filler", 450, 9);
        assertText("42", "Record Status6", 459, 1);
        assertInteger("43", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 460, 20);
        assertText("44", "Record Terminator", 480, 1);
    }
}
