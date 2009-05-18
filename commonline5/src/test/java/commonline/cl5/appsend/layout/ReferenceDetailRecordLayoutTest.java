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
package commonline.cl5.appsend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;

public class ReferenceDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new ReferenceDetailRecordLayout();
    }

    protected int recordLength() {
        return 960;
    }

    protected int fieldCount() {
        return 68;
    }

    protected String recordCode() {
        return "@5";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Reference/Cosigner Layout Owner Code", 3, 4);
        assertText("3", "Reference/Cosigner Layout Identifier Code", 7, 2);
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
        assertText("29", "Reference 2 Telephone Number", 335, 10);
        assertText("30", "Borrower/Cosigner Employer Name", 345, 20);
        assertText("31", "Borrower/Cosigner Employer Address (line 1)", 365, 30);
        assertText("32", "Borrower/Cosigner Employer Address (line 2)", 395, 30);
        assertText("33", "Borrower/Cosigner Employer City", 425, 24);
        assertText("34", "Filler", 449, 6);
        assertText("35", "Borrower/Cosigner Employer State", 455, 2);
        assertInteger("36", "Borrower/Cosigner Employer Zip Code", 457, 5);
        assertInteger("37", "Borrower/Cosigner Employer Zip Code Suffix", 462, 4);
        assertText("38", "Borrower/Cosigner Employer Telephone Number", 466, 10);
        assertText("39", "Reference 1 Foreign Postal Code", 476, 14);
        assertText("40", "Reference 2 Foreign Postal Code", 490, 14);
        assertText("41", "Borrower/Cosigner Information Indicator", 504, 1);
        assertText("42", "Borrower/Cosigner Monthly Housing Payment", 505, 5);
        assertText("43", "Borrower/Cosigner Owner/Rent Indicator", 510, 1);
        assertText("44", "Borrower/Cosigner Previous Address Line 1", 511, 30);
        assertText("45", "Borrower/Cosigner Previous Address Line 2", 541, 30);
        assertText("46", "Borrower/Cosigner Previous City", 571, 24);
        assertText("47", "Borrower/Cosigner Previous State", 595, 2);
        assertInteger("48", "Borrower/Cosigner Previous Zip", 597, 5);
        assertInteger("49", "Borrower/Cosigner Previous Zip Suffix", 602, 4);
        assertText("50", "Borrower/Cosigner Selfemployed Indicator", 606, 1);
        assertText("51", "Filler", 607, 30);
        assertText("52", "Borrower/Cosigner Position Description", 637, 26);
        assertText("53", "Borrower/Cosigner Years at Employer", 663, 2);
        assertText("54", "Filler", 665, 5);
        assertText("55", "Borrower/Cosigner Previous Employer", 670, 30);
        assertText("56", "Borrower/Cosigner Previous Position Description", 700, 26);
        assertText("57", "Filler", 726, 4);
        assertText("58", "Borrower/Cosigner Previous Employer Telephone Number", 730, 10);
        assertText("59", "Filler", 740, 5);
        assertText("60", "Borrower/Cosigner Source of Other Income", 745, 15);
        assertText("61", "Reference 1 Foreign Telephone Number Prefix", 760, 10);
        assertText("62", "Reference 2 Foreign Telephone Number Prefix", 770, 10);
        assertText("63", "Borrower/Cosigner Employer Foreign Telephone Number Prefix", 780, 10);
        assertText("64", "Borrower/Cosigner Previous Employer Foreign Telephone Number Prefix", 790, 10);
        assertText("65", "Borrower/Cosigner Employer Foreign Postal Code", 800, 14);
        assertText("66", "Borrower/Cosigner Previous Foreign Postal Code", 814, 14);
        assertText("67", "Filler", 828, 132);
    }
}
