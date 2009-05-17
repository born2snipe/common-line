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

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class AddressPhoneChangeLayout extends AbstractCommonLineRecordLayout {
    public AddressPhoneChangeLayout() {
        super("@105");
    }

    protected void defineFields() {
        field("2", "Record Type", "9(2)");
        field("3", "Borrower SSN", "9(9)");
        field("4", "School ID", "9(8)");
        field("5", "Change Type Code", "X(1)");
        field("6", "Filler", "X(2)");
        field("7", "School Non-ED Branch ID", "X(4)");
        field("8", "Recipient ID5", "X(8)");
        field("9", "Guarantor ID", "X(3)");
        field("10", "Recipient Non-ED Branch ID5", "X(4)");
        field("11", "Borrower Address Indicator", "X(1)");
        field("12", "Borrower Street Address 1 (line 1)", "X(35)");
        field("13", "Borrower Street Address 2 (line 2)", "X(35)");
        field("14", "Borrower City", "X(24)");
        field("15", "Borrower State", "X(2)");
        field("16", "Borrower Country", "X(25)");
        field("17", "Borrower Zip Code/Foreign Postal Code", "X(14)");
        field("18", "Borrower Address Validity Indicator", "X(1)");
        field("19", "Borrower Address Effective Date (CCYYMMDD)", "9(8)");
        field("20", "Borrower Home Telephone Number", "X(10)");
        field("21", "Borrower Home Foreign Telephone Number Prefix", "X(10)");
        field("22", "Borrower Home Telephone Number Validity Indicator", "X(1)");
        field("23", "Borrower Home Telephone Number Effective Date (CCYYMMDD)", "9(8)");
        field("24", "Borrower Work Telephone Number", "X(10)");
        field("25", "Borrower Work Telephone Number Foreign Prefix", "X(10)");
        field("26", "Borrower Work Telephone Number Validity Indicator", "X(1)");
        field("27", "Borrower Work Telephone Number Effective Date (CCYYMMDD)", "9(8)");
        field("28", "Other Telephone Number", "X(10)");
        field("29", "Other Telephone Number Foreign Prefix", "X(10)");
        field("30", "Other Telephone Number Validity Indicator", "X(1)");
        field("31", "Other Telephone Number Effective Date (CCYYMMDD)", "9(8)");
        field("32", "Lender ID", "X(6)");
        field("33", "Lender Non-ED Branch ID", "X(4)");
        field("34", "Filler", "X(48)");
        field("35", "School Use Only5", "X(23)");
        field("36", "Lender Use Only", "X(20)");
        field("37", "Guarantor Use Only", "X(23)");
        field("38", "Filler", "X(33)");
        field("39", "Submittal As-Of-Date5 (CCYYMMDD)", "X(8)");
        field("40", "Filler", "X(9)");
        field("41", "Filler", "X(9)");
        field("42", "Record Status6", "X(1)");
        field("43", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", "9(20)");
        recordTerminator("44");
    }
}
