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

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class EmailInformationRecordLayout extends AbstractCommonLineRecordLayout {
    public EmailInformationRecordLayout() {
        super("@119");
    }

    protected void defineFields() {
        field("2", "Record Type", "9(2)");
        field("3", "Borrower SSN", "9(9)");
        field("4", "School ID", "9(8)");
        field("5", "Filler", "X(3)");
        field("6", "School Non-ED Branch ID", "X(4)");
        field("7", "Recipient ID", "X(8)");
        field("8", "Filler", "X(3)");
        field("9", "Recipient Non-ED Branch ID", "X(4)");
        field("10", "E-mail Address", "X(256)");
        field("11", "E-mail Address Validity Indicator", "X(1)");
        field("12", "E-mail Address Effective Date(CCYYMMDD)", "9(8)");
        field("13", "Record Status", "X(1)");
        field("14", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(20)");
        field("15", "DUNS School ID", "X(9)");
        field("16", "DUNS Recipient ID", "X(9)");
        field("17", "Servicer Code", "X(6)");
        field("18", "DUNS Servicer Code", "X(9)");
        field("19", "Filler", "X(51)");
        field("20", "School Use Only", "X(23)");
        field("21", "Lender Use Only", "X(20)");
        field("22", "Guarantor Use Only", "X(23)");
        recordTerminator("23");
    }

}
