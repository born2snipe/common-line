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


public class EmailInformationRecordLayout extends AbstractCommonLineRecordLayout {
    public EmailInformationRecordLayout() {
        super("@119");
    }

    protected void defineFields() {
        field("2", "Record Type", "9(2)");
        field("3", "Borrower SSN", "9(9)");
        field("4", "School ID", "9(8)");
        field("5", "Change Type Code", "X(1)");
        field("6", "Filler", "X(2)");
        field("7", "School Non-ED Branch ID", "X(4)");
        field("8", "Recipient ID", "X(8)");
        field("9", "Guarantor ID", "X(3)");
        field("10", "Recipient Non-ED Branch ID5", "X(4)");
        field("11", "E-mail Address", "X(256)");
        field("12", "E-mail Address Validity Indicator", "X(1)");
        field("13", "E-mail Address Effective Date (CCYYMMDD)", "9(8)");
        field("14", "Filler", "X(25)");
        field("15", "School Use Only", "X(23)");
        field("16", "Lender Use Only", "X(20)");
        field("17", "Guarantor Use Only", "X(23)");
        field("18", "Lender ID", "X(6)");
        field("19", "Lender Non-ED Branch ID", "X(4)");
        field("20", "Filler", "X(8)");
        field("21", "Servicer Code", "X(6)");
        field("22", "Filler", "X(9)");
        field("23", "Submittal As-Of Date", "X(8)");
        field("24", "Filler", "X(9)");
        field("25", "Filler", "X(9)");
        field("26", "Record Status", "X(1)");
        field("27", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", "9(20)");
        recordTerminator("28");
    }
}
