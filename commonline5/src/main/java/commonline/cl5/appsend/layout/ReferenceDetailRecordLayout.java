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

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class ReferenceDetailRecordLayout extends AbstractCommonLineRecordLayout {
    public ReferenceDetailRecordLayout() {
        super("@5");
    }

    protected void defineFields() {
        field("2", "Reference/Cosigner Layout Owner Code", "X(4)");
        field("3", "Reference/Cosigner Layout Identifier Code", "X(2)");
        field("4", "Reference 1 Last Name", "X(35)");
        field("5", "Reference 1 First Name", "X(12)");
        field("6", "Reference 1 Middle Initial", "X(1)");
        field("7", "Reference 1 SSN", "9(9)");
        field("8", "Reference 1 Relationship Code", "X(1)");
        field("9", "Reference 1 Address (line 1)", "X(30)");
        field("10", "Reference 1 Address (line 2)", "X(30)");
        field("11", "Reference 1 City", "X(24)");
        field("12", "Filler", "X(5)");
        field("13", "Reference 1 State", "X(2)");
        field("14", "Reference 1 Zip Code", "9(5)");
        field("15", "Reference 1 Zip Code Suffix", "9(4)");
        field("16", "Reference 1 Telephone Number", "X(10)");
        field("17", "Reference 2 Last Name", "X(35)");
        field("18", "Reference 2 First Name", "X(12)");
        field("19", "Reference 2 Middle Initial", "X(1)");
        field("20", "Reference 2 SSN", "9(9)");
        field("21", "Reference 2 Relationship Code", "X(1)");
        field("22", "Reference 2 Address (line 1)", "X(30)");
        field("23", "Reference 2 Address (line 2)", "X(30)");
        field("24", "Reference 2 City", "X(24)");
        field("25", "Filler", "X(5)");
        field("26", "Reference 2 State", "X(2)");
        field("27", "Reference 2 Zip Code", "9(5)");
        field("28", "Reference 2 Zip Code Suffix", "9(4)");
        field("29", "Reference 2 Telephone Number", "X(10)");
        field("30", "Borrower/Cosigner Employer Name", "X(20)");
        field("31", "Borrower/Cosigner Employer Address (line 1)", "X(30)");
        field("32", "Borrower/Cosigner Employer Address (line 2)", "X(30)");
        field("33", "Borrower/Cosigner Employer City", "X(24)");
        field("34", "Filler", "X(6)");
        field("35", "Borrower/Cosigner Employer State", "X(2)");
        field("36", "Borrower/Cosigner Employer Zip Code", "9(5)");
        field("37", "Borrower/Cosigner Employer Zip Code Suffix", "9(4)");
        field("38", "Borrower/Cosigner Employer Telephone Number", "X(10)");
        field("39", "Reference 1 Foreign Postal Code", "X(14)");
        field("40", "Reference 2 Foreign Postal Code", "X(14)");
        field("41", "Borrower/Cosigner Information Indicator", "X(1)");
        field("42", "Borrower/Cosigner Monthly Housing Payment", "X(5)");
        field("43", "Borrower/Cosigner Owner/Rent Indicator", "X(1)");
        field("44", "Borrower/Cosigner Previous Address Line 1", "X(30)");
        field("45", "Borrower/Cosigner Previous Address Line 2", "X(30)");
        field("46", "Borrower/Cosigner Previous City", "X(24)");
        field("47", "Borrower/Cosigner Previous State", "X(2)");
        field("48", "Borrower/Cosigner Previous Zip", "9(5)");
        field("49", "Borrower/Cosigner Previous Zip Suffix", "9(4)");
        field("50", "Borrower/Cosigner Selfemployed Indicator", "X(1)");
        field("51", "Filler", "X(30)");
        field("52", "Borrower/Cosigner Position Description", "X(26)");
        field("53", "Borrower/Cosigner Years at Employer", "X(2)");
        field("54", "Filler", "X(5)");
        field("55", "Borrower/Cosigner Previous Employer", "X(30)");
        field("56", "Borrower/Cosigner Previous Position Description", "X(26)");
        field("57", "Filler", "X(4)");
        field("58", "Borrower/Cosigner Previous Employer Telephone Number", "X(10)");
        field("59", "Filler", "X(5)");
        field("60", "Borrower/Cosigner Source of Other Income", "X(15)");
        field("61", "Reference 1 Foreign Telephone Number Prefix", "X(10)");
        field("62", "Reference 2 Foreign Telephone Number Prefix", "X(10)");
        field("63", "Borrower/Cosigner Employer Foreign Telephone Number Prefix", "X(10)");
        field("64", "Borrower/Cosigner Previous Employer Foreign Telephone Number Prefix", "X(10)");
        field("65", "Borrower/Cosigner Employer Foreign Postal Code", "X(14)");
        field("66", "Borrower/Cosigner Previous Foreign Postal Code", "X(14)");
        field("67", "Filler", "X(132)");
        recordTerminator("68");
    }
}
