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
 * NCHELP CommonLine� Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * BORROWER (@1-02) DETAIL RECORD(S)
 */
public class BorrowerDetailRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        field("2", "Record Type", "9(002)");
        field("3", "Borrower SSN", "9(009)");
        field("4", "School ID", "9(008)");
        field("5", "Filler", "X(003)");
        field("6", "School Non-ED Branch ID", "X(004)");
        field("7", "Recipient ID", "X(008)");
        field("8", "Filler", "X(003)");
        field("9", "Recipient Non-ED Branch ID", "X(004)");
        field("10", "Filler", "X(012)");
        field("11", "Borrower Last Name", "X(035)");
        field("12", "Borrower First Name", "X(012)");
        field("13", "Borrower Middle Initial", "X(001)");
        field("14", "Borrower Date of Birth (CCYYMMDD)", "9(008)");
        field("15", "Record Status", "X(001)");
        field("16", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(020)");
        field("17", "DUNS School ID", "X(009)");
        field("18", "DUNS Recipient ID", "X(009)");
        field("19", "Filler", "X(183)");
        field("20", "School Use Only", "X(023)");
        field("21", "Lender Use Only", "X(020)");
        field("22", "Guarantor Use Only", "X(023)");
        field("23", "Filler", "X(080)");
        recordTerminator("24");
    }

    public String getCode() {
        return "@102";
    }

}
