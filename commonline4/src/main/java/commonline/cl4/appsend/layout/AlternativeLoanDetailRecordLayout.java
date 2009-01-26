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
package commonline.cl4.appsend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine� Network for FFELP and Alternative Loans
 * <p/>
 * Application Send File
 * <p/>
 * Alternative Loan (@4) Detail Record(s) Addendum
 */
// TODO - why are these special characters getting inserted?!
public class AlternativeLoanDetailRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Alternative Loan Layout Owner Code", "X(004)");
        field("3", "Alternative Loan Layout Identifier Code", "X(002)");
        field("4", "Federal Stafford Loan Debt", "9(005)");
        field("5", "Federal SLS Debt", "9(005)");
        field("6", "HEAL Debt", "9(006)");
        field("7", "Perkins Debt", "9(005)");
        field("8", "Other Debt", "9(006)");
        field("9", "Other Loans this Period", "9(007)");
        field("10", "Credit Under Different Name Code", "X(001)");
        field("11", "Cosigner 1 Last Name", "X(035)");
        field("12", "Cosigner 1 First Name", "X(012)");
        field("13", "Cosigner 1 Middle Initial", "X(001)");
        field("14", "Cosigner 1 SSN", "9(009)");
        field("15", "Cosigner 1 U.S. Citizenship Status Code", "X(001)");
        field("16", "Cosigner 1 Address (line 1)", "X(030)");
        field("17", "Cosigner 1 Address (line 2)", "X(030)");
        field("18", "Cosigner 1 City", "X(024)");
        field("19", "Filler", "X(006)");
        field("20", "Cosigner 1 State", "X(002)");
        field("21", "Cosigner 1 Zip Code", "9(005)");
        field("22", "Cosigner 1 Zip Code Suffix", "9(004)");
        field("23", "Cosigner 1 Telephone Number", "X(010)");
        field("24", "Cosigner 1 Signature Code", "X(001)");
        field("25", "Cosigner 2 Last Name", "X(035)");
        field("26", "Cosigner 2 First Name", "X(012)");
        field("27", "Cosigner 2 Middle Initial", "X(001)");
        field("28", "Cosigner 2 SSN", "9(009)");
        field("29", "Cosigner 2 U.S. Citizenship Status Code", "X(001)");
        field("30", "Cosigner 2 Address (line 1)", "X(030)");
        field("31", "Cosigner 2 Address (line 2)", "X(030)");
        field("32", "Cosigner 2 City", "X(024)");
        field("33", "Filler", "X(006)");
        field("34", "Cosigner 2 State", "X(002)");
        field("35", "Cosigner 2 Zip Code", "9(005)");
        field("36", "Cosigner 2 Zip Code Suffix", "9(004)");
        field("37", "Cosigner 2 Telephone Number", "X(010)");
        field("38", "Cosigner 2 Signature Code", "X(001)");
        field("39", "Borrower Gross Annual Salary", "9(007)");
        field("40", "Borrower Other Income", "9(007)");
        field("41", "Cosigner 1 Gross Annual Salary", "9(007)");
        field("42", "Cosigner 1 Other Income", "9(007)");
        field("43", "Cosigner 2 Gross Annual Salary", "9(007)");
        field("44", "Cosigner 2 Other Income", "9(007)");
        field("45", "Cosigner 1 Foreign Postal Code", "X(014)");
        field("46", "Cosigner 2 Foreign Postal Code", "X(014)");
        field("47", "Student Major", "X(015)");
        field("48", "Cosigner 1 Date of Birth", "9(008)");
        field("49", "Cosigner 1 Driver�s License State", "X(002)");
        field("50", "Cosigner 1 Driver�s License Number", "X(020)");
        field("51", "Cosigner 2 Date of Birth", "9(008)");
        field("52", "Cosigner 2 Driver�s License State", "X(002)");
        field("53", "Cosigner 2 Driver�s License Number", "X(020)");
        field("54", "Filler", "X(020)");
        field("55", "Student School Phone", "X(010)");
        field("56", "Cosigner 1 Relationship to Student", "X(001)");
        field("57", "Cosigner 1 Suffix", "X(003)");
        field("58", "Cosigner 1 Years at Address", "9(002)");
        field("59", "Cosigner 2 Relationship to Student", "X(001)");
        field("60", "Cosigner 2 Suffix", "X(003)");
        field("61", "Cosigner 2 Years at Address", "9(002)");
        field("62", "Interest Rate Option", "X(001)");
        field("63", "Repayment Option Code", "X(001)");
        field("64", "Filler", "X(307)");
        recordTerminator("65");
    }

    public String getCode() {
        return "@4";
    }
}
