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
package commonline.cl4.disbursement.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine Network for FFELP and Alternative Loans
 * <p/>
 * Disbursement Roster File/Disbursement Roster Acknowledgment File
 * <p/>
 * DISBURSEMENT @1 DETAIL RECORD(S)
 */
public class DisbursementDetailRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Record Type Indicator Code", "X(001)");
        field("3", "CommonLine Unique Identifier", "X(017)");
        field("4", "CommonLine Loan Sequence Number", "9(002)");
        field("5", "Borrower Last Name", "X(035)");
        field("6", "Borrower First Name", "X(012)");
        field("7", "Borrower Middle Initial", "X(001)");
        field("8", "Borrower SSN", "9(009)");
        field("9", "Borrower Address (line 1)", "X(030)");
        field("10", "Borrower Address (line 2)", "X(030)");
        field("11", "Borrower City", "X(024)");
        field("12", "Filler", "X(006)");
        field("13", "Borrower State", "X(002)");
        field("14", "Borrower Zip Code", "9(005)");
        field("15", "Borrower Zip Code Suffix", "9(004)");
        field("16", "Date Address Last Updated (CCYYMMDD)", "9(008)");
        field("17", "EFT Authorization Code", "X(001)");
        field("18", "PLUS/Alternative Student Last Name", "X(035)");
        field("19", "PLUS/Alternative Student First Name", "X(012)");
        field("20", "PLUS/Alternative Student Middle Initial", "X(001)");
        field("21", "PLUS/Alternative Student SSN", "9(009)");
        field("22", "School ID", "9(008)");
        field("23", "School Designated Branch/Division Code", "X(002)");
        field("24", "School Use Only", "X(023)");
        field("25", "Loan Period Begin Date (CCYYMMDD)", "9(008)");
        field("26", "Loan Period End Date (CCYYMMDD)", "9(008)");
        field("27", "Loan Type Code", "X(002)");
        field("28", "Alternative Loan Program Type Code", "X(003)");
        field("29", "Lender ID", "X(006)");
        field("30", "Lender Branch ID", "X(004)");
        field("31", "Lender Use Only", "X(020)");
        field("32", "Borrower Confirmation Indicator", "X(001)");
        field("33", "Filler", "X(002)");
        field("34", "Funds Release Date(CCYYMMDD)", "9(008)");
        field("35", "Disbursement Number", "9(001)");
        field("36", "Total Number of Scheduled Disbursements", "9(001)");
        field("37", "Guarantor ID", "X(003)");
        field("38", "Guarantor Use Only", "X(023)");
        field("39", "Guarantee Date (CCYYMMDD)", "9(008)");
        field("40", "Guarantee Amount", "9(005)");
        field("41", "Gross Disbursement Amount", "9(005)V99");
        field("42", "Origination Fee", "9(005)V99");
        field("43", "Guarantee Fee", "9(005)V99");
        field("44", "Net Disbursement Amount", "9(005)V99");
        field("45", "Funds Distribution Method Code", "X(001)");
        field("46", "Check Number", "X(015)");
        field("47", "Late Disbursement Indicator Code", "X(001)");
        field("48", "Previously Reported Indicator Code", "X(001)");
        field("49", "Error Message Code 1", "X(003)");
        field("50", "Error Message Code 2", "X(003)");
        field("51", "Error Message Code 3", "X(003)");
        field("52", "Error Message Code 4", "X(003)");
        field("53", "Error Message Code 5", "x(003)");
        field("54", "Fees Paid", "9(005)v99");
        field("55", "Lender Name", "X(015)");
        field("56", "Net Cancellation Amount", "9(005)v99");
        field("57", "DUNS School ID", "X(009)");
        field("58", "DUNS Lender ID", "X(009)");
        field("59", "DUNS Guarantor ID", "X(009)");
        field("60", "Filler", "X(060)");
        recordTerminator("61");

    }

    public String getCode() {
        return "@1";
    }
}
