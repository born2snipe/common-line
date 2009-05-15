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

/**
 * NCHELP CommonLine Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * BORROWER (@1-02) DETAIL RECORD(S)
 */
public class BorrowerDetailRecordLayout extends AbstractCommonLineRecordLayout {
    public BorrowerDetailRecordLayout() {
        super("@102");
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
        field("10", "Filler", "X(12)");
        field("11", "Borrower Last Name", "X(35)");
        field("12", "Borrower First Name", "X(12)");
        field("13", "Borrower Middle Initial", "X(1)");
        field("14", "Borrower Date of Birth (CCYYMMDD)", "9(8)");
        field("15", "Record Status", "X(1)");
        field("16", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(20)");
        field("17", "DUNS School ID", "X(9)");
        field("18", "DUNS Recipient ID", "X(9)");
        field("19", "Filler", "X(183)");
        field("20", "School Use Only", "X(23)");
        field("21", "Lender Use Only", "X(20)");
        field("22", "Guarantor Use Only", "X(23)");
        field("23", "Filler", "X(80)");
        recordTerminator("24");
    }

}
