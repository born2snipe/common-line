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


public class BorrowerDetailLayout extends AbstractCommonLineRecordLayout {
    public BorrowerDetailLayout() {
        super("@102");
    }

    protected void defineFields() {
        field("2", "Record Type", "9(2)");
        field("3", "Borrower SSN", "9(9)");
        field("4", "Source ID", "X(8)");
        field("5", "Filler", "X(3)");
        field("6", "Source Non-ED Branch ID5", "X(4)");
        field("7", "Recipient ID", "X(8)");
        field("8", "Filler", "X(3)");
        field("9", "Recipient Non-ED Branch ID", "X(4)");
        field("10", "Filler", "X(12)");
        field("11", "Borrower Last Name", "X(35)");
        field("12", "Borrower First Name", "X(12)");
        field("13", "Borrower Middle Initial", "X(1)");
        field("14", "Borrower Date of Birth (CCYYMMDD)", "9(8)");
        field("15", "Filler", "X(21)");
        field("16", "Filler", "X(9)");
        field("17", "Filler", "X(9)");
        field("18", "Filler", "X(183)");
        field("19", "School Use Only", "X(23)");
        field("20", "Lender Use Only", "X(20)");
        field("21", "Guarantor Use Only", "X(23)");
        field("22", "Filler", "X(59)");
        field("23", "Record Status5", "X(1)");
        field("24", "Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", "9(20)");
        recordTerminator("25");
    }
}
