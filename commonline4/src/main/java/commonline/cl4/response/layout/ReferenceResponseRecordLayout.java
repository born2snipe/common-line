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
package commonline.cl4.response.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * Reference Response (@5) Detail Record(s) Addendum
 */
public class ReferenceResponseRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Reference Layout Owner Code", "X(004)");
        field("3", "Reference Layout Identifier Code", "X(002)");
        field("4", "Reference 1 Last Name", "X(035)");
        field("5", "Reference 1 First Name", "X(012)");
        field("6", "Reference 1 Middle Initial", "X(001)");
        field("7", "Reference 1 SSN", "9(009)");
        field("8", "Reference 1 Relationship Code", "X(001)");
        field("9", "Reference 1 Address (line 1)", "X(030)");
        field("10", "Reference 1 Address (line 2)", "X(030)");
        field("11", "Reference 1 City", "X(024)");
        field("12", "Filler", "X(005)");
        field("13", "Reference 1 State", "X(002)");
        field("14", "Reference 1 Zip Code", "9(005)");
        field("15", "Reference 1 Zip Code Suffix", "9(004)");
        field("16", "Reference 1 Telephone Number", "X(010)");
        field("17", "Reference 2 Last Name", "X(035)");
        field("18", "Reference 2 First Name", "X(012)");
        field("19", "Reference 2 Middle Initial", "X(001)");
        field("20", "Reference 2 SSN", "9(009)");
        field("21", "Reference 2 Relationship Code", "X(001)");
        field("22", "Reference 2 Address (line 1)", "X(030)");
        field("23", "Reference 2 Address (line 2)", "X(030)");
        field("24", "Reference 2 City", "X(024)");
        field("25", "Filler", "X(005)");
        field("26", "Reference 2 State", "X(002)");
        field("27", "Reference 2 Zip Code", "9(005)");
        field("28", "Reference 2 Zip Code Suffix", "9(004)");
        field("29", "Reference 2 Telephone  Number", "X(010)");
        field("30", "Borrower Employer Name", "X(020)");
        field("31", "Borrower Employer Address (line 1)", "X(030)");
        field("32", "Borrower Employer Address (line 2)", "X(030)");
        field("33", "Borrower Employer City", "X(024)");
        field("34", "Filler", "X(006)");
        field("35", "Borrower Employer State", "X(002)");
        field("36", "Borrower Employer Zip Code", "9(005)");
        field("37", "Borrower Employer Zip Code Suffix", "9(004)");
        field("38", "Borrower Employer Telephone Number", "X(010)");
        field("39", "Reference 1 Foreign Postal Code", "X(014)");
        field("40", "Reference 2 Foreign Postal Code", "X(014)");
        field("41", "Borrower/Cosigner Credit Information Indicator", "X(001)");
        field("42", "Borrower/Cosigner Monthly Housing Payment", "9(005)");
        field("43", "Borrower/Cosigner Owner/Rent Indicator", "X(001)");
        field("44", "Borrower/Cosigner Previous Address Line 1", "X(030)");
        field("45", "Borrower/Cosigner Previous Address Line 2", "X(030)");
        field("46", "Borrower/Cosigner Previous City", "X(024)");
        field("47", "Borrower/Cosigner Previous State", "X(002)");
        field("48", "Borrower/Cosigner Previous Zip", "9(005)");
        field("49", "Borrower/Cosigner Previous Zip Suffix", "9(004)");
        field("50", "Borrower/Cosigner Self- employed Indicator", "X(001)");
        field("51", "Borrower/Cosigner Employer/Company Name", "X(030)");
        field("52", "Borrower/Cosigner Position Description", "X(026)");
        field("53", "Borrower/Cosigner Years at Employer", "9(002)");
        field("54", "Filler", "X(005)");
        field("55", "Borrower/Cosigner Previous Employer", "X(030)");
        field("56", "Borrower/Cosigner Previous Position Description", "X(030)");
        field("57", "Borrower/Cosigner Previous Employer Phone", "X(010)");
        field("58", "Filler", "X(005)");
        field("59", "Borrower/Cosigner Source of Other Income", "X(015)");
        field("60", "Filler", "X(280)");
        recordTerminator("61");
    }

    public String getCode() {
        return "@5";
    }
}
