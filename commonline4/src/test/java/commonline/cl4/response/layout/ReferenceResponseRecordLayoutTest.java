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
package commonline.cl4.response.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class ReferenceResponseRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new ReferenceResponseRecordLayout();
    }

    protected int recordLength() {
        return 1040;
    }

    protected int fieldCount() {
        return 61;
    }

    protected String recordCode() {
        return "@5";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Reference Layout Owner Code", 3, 4);
        assertText("3", "Reference Layout Identifier Code", 7, 2);
        assertText("4", "Reference 1 Last Name", 9, 35);
        assertText("5", "Reference 1 First Name", 44, 12);
        assertText("6", "Reference 1 Middle Initial", 56, 1);
        assertInteger("7", "Reference 1 SSN", 57, 9);
        assertText("8", "Reference 1 Relationship Code", 66, 1);
        assertText("9", "Reference 1 Address (line 1)", 67, 30);
        assertText("10", "Reference 1 Address (line 2)", 97, 30);
        assertText("11", "Reference 1 City", 127, 24);
        assertText("12", "Filler", 151, 5);
        assertText("13", "Reference 1 State", 156, 2);
        assertInteger("14", "Reference 1 Zip Code", 158, 5);
        assertInteger("15", "Reference 1 Zip Code Suffix", 163, 4);
        assertText("16", "Reference 1 Telephone Number", 167, 10);
        assertText("17", "Reference 2 Last Name", 177, 35);
        assertText("18", "Reference 2 First Name", 212, 12);
        assertText("19", "Reference 2 Middle Initial", 224, 1);
        assertInteger("20", "Reference 2 SSN", 225, 9);
        assertText("21", "Reference 2 Relationship Code", 234, 1);
        assertText("22", "Reference 2 Address (line 1)", 235, 30);
        assertText("23", "Reference 2 Address (line 2)", 265, 30);
        assertText("24", "Reference 2 City", 295, 24);
        assertText("25", "Filler", 319, 5);
        assertText("26", "Reference 2 State", 324, 2);
        assertInteger("27", "Reference 2 Zip Code", 326, 5);
        assertInteger("28", "Reference 2 Zip Code Suffix", 331, 4);
        assertText("29", "Reference 2 Telephone  Number", 335, 10);
        assertText("30", "Borrower Employer Name", 345, 20);
        assertText("31", "Borrower Employer Address (line 1)", 365, 30);
        assertText("32", "Borrower Employer Address (line 2)", 395, 30);
        assertText("33", "Borrower Employer City", 425, 24);
        assertText("34", "Filler", 449, 6);
        assertText("35", "Borrower Employer State", 455, 2);
        assertInteger("36", "Borrower Employer Zip Code", 457, 5);
        assertInteger("37", "Borrower Employer Zip Code Suffix", 462, 4);
        assertText("38", "Borrower Employer Telephone Number", 466, 10);
        assertText("39", "Reference 1 Foreign Postal Code", 476, 14);
        assertText("40", "Reference 2 Foreign Postal Code", 490, 14);
        assertText("41", "Borrower/Cosigner Credit Information Indicator", 504, 1);
        assertInteger("42", "Borrower/Cosigner Monthly Housing Payment", 505, 5);
        assertText("43", "Borrower/Cosigner Owner/Rent Indicator", 510, 1);
        assertText("44", "Borrower/Cosigner Previous Address Line 1", 511, 30);
        assertText("45", "Borrower/Cosigner Previous Address Line 2", 541, 30);
        assertText("46", "Borrower/Cosigner Previous City", 571, 24);
        assertText("47", "Borrower/Cosigner Previous State", 595, 2);
        assertInteger("48", "Borrower/Cosigner Previous Zip", 597, 5);
        assertInteger("49", "Borrower/Cosigner Previous Zip Suffix", 602, 4);
        assertText("50", "Borrower/Cosigner Self- employed Indicator", 606, 1);
        assertText("51", "Borrower/Cosigner Employer/Company Name", 607, 30);
        assertText("52", "Borrower/Cosigner Position Description", 637, 26);
        assertInteger("53", "Borrower/Cosigner Years at Employer", 663, 2);
        assertText("54", "Filler", 665, 5);
        assertText("55", "Borrower/Cosigner Previous Employer", 670, 30);
        assertText("56", "Borrower/Cosigner Previous Position Description", 700, 30);
        assertText("57", "Borrower/Cosigner Previous Employer Phone", 730, 10);
        assertText("58", "Filler", 740, 5);
        assertText("59", "Borrower/Cosigner Source of Other Income", 745, 15);
        assertText("60", "Filler", 760, 280);
        assertText("61", "Record Terminator", 1040, 1);
    }
}
