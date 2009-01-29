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
 * DISBURSEMENT CANCELLATION/CHANGE (@1-09) DETAIL RECORD(S)
 */
public class DisbursementCancellationChangeDetailRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Record Type", "9(002)");
        field("3", "Borrower SSN", "9(009)");
        field("4", "School ID", "9(008)");
        field("5", "Filler", "X(003)");
        field("6", "School Non-ED Branch ID", "X(004)");
        field("7", "Recipient ID", "X(008)");
        field("8", "Filler", "X(003)");
        field("9", "Recipient Non-ED Branch ID", "X(004)");
        field("10", "Unique Loan Identifier", "X(016)");
        field("11", "Guarantee Date (CCYYMMDD)", "9(008)");
        field("12", "Loan Type Code", "X(002)");
        field("13", "Alternative Loan Program Type Code", "X(003)");
        field("14", "First Disbursement Date(CCYYMMDD)", "9(008)");
        field("15", "Lender ID", "X(006)");
        field("16", "Servicer Code", "X(006)");
        field("17", "Loan Period Begin Date (CCYYMMDD)", "9(008)");
        field("18", "Loan Period End Date (CCYYMMDD)", "9(008)");
        field("19", "School Designated Branch/Division Code", "X(002)");
        field("20", "PLUS/Alternative Student SSN", "9(009)");
        field("21", "CommonLine Unique Identifier", "X(017)");
        field("22", "CommonLine Loan Sequence Number", "9(002)");
        field("23", "Disbursement Number 1", "X(001)");
        field("24", "Disbursement Number 2", "9(001)");
        field("25", "Disbursement Date (CCYYMMDD)", "9(008)");
        field("26", "Cancellation Date (CCYYMMDD)", "9(008)");
        field("27", "Cancellation Amount", "9(006)V99");
        field("28", "Disbursement Hold/Release Indicator Code", "X(001)");
        field("29", "Revised Disbursement Date(CCYYMMDD)", "9(008)");
        field("30", "Revised Disbursement Amount", "9(006)V99");
        field("31", "Reinstatement Indicator Code", "X(001)");
        field("32", "Record Status", "X(001)");
        field("33", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(020)");
        field("34", "DUNS School ID", "X(009)");
        field("35", "DUNS Recipient ID", "X(009)");
        field("36", "DUNS Lender ID", "X(009)");
        field("37", "DUNS Servicer Code", "X(009)");
        field("38", "Lender Non-ED Branch ID", "X(004)");
        field("39", "Submittal As-Of Date", "9(008)");
        field("40", "Filler", "X(082)");
        field("41", "School Use Only", "X(023)");
        field("42", "Lender Use Only", "X(020)");
        field("43", "Guarantor Use Only", "X(023)");
        field("44", "Filler", "X(080)");
        recordTerminator("45");
    }

    public String getCode() {
        return "@109";
    }
}
