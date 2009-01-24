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


public class ResponseRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        field("2", "Record Status Code", "X(001)");
        field("3", "Date Record Status Last Updated (CCYYMMDD)", "9(008)");
        field("4", "Borrower Last Name", "X(035)");
        field("5", "Borrower First Name", "X(012)");
        field("6", "Borrower Middle Initial", "X(001)");
        field("7", "Borrower SSN", "9(009)");
        field("8", "Permanent Borrower Address (line 1)", "X(030)");
        field("9", "Permanent Borrower Address (line 2)", "X(030)");
        field("10", "Permanent Borrower City", "X(024)");
        field("11", "Filler", "X(006)");
        field("12", "Permanent Borrower State", "X(002)");
        field("13", "Permanent Borrower Zip Code", "9(005)");
        field("14", "Permanent Borrower Zip Code Suffix", "9(004)");
        field("15", "Borrower Telephone Number", "X(010)");
        field("16", "Borrower Date of Birth (CCYYMMDD)", "9(008)");
        field("17", "Loan Type Code", "X(002)");
        field("18", "Requested Loan Amount", "9(006)");
        field("19", "Deferment Request Code", "X(001)");
        field("20", "Borrower Interest Indicator", "X(001)");
        field("21", "EFT Authorization Code", "X(001)");
        field("22", "Borrower Signature Code", "X(001)");
        field("23", "Borrower Signature Date (CCYYMMDD)", "9(008)");
        field("24", "CommonLine Unique Identifier", "X(017)");
        field("25", "CommonLine Loan Sequence Number", "9(002)");
        field("26", "Filler", "X(001)");
        field("27", "PLUS/Alternative Borrower U.S. Citizenship Status Code", "X(001)");
        field("28", "PLUS Borrower State of Legal Residence", "X(002)");
        field("29", "PLUS Borrower State Resident Since Date (CCYYMM)", "9(006)");
        field("30", "PLUS/Alternative Borrower Default/Refund Code", "X(001)");
        field("31", "PLUS Borrower Outstanding Loans Code", "X(001)");
        field("32", "Alternative Student/Borrower Indicator Code", "X(001)");
        field("33", "Filler", "X(019)");
        field("34", "PLUS/Alternative Student Last Name", "X(035)");
        field("35", "PLUS/Alternative Student First Name", "X(012)");
        field("36", "PLUS/Alternative Student Middle Initial", "X(001)");
        field("37", "PLUS/Alternative Student SSN", "9(009)");
        field("38", "PLUS/Alternative Student Date of Birth (CCYYMMDD)", "9(008)");
        field("39", "PLUS/Alternative Student U.S. Citizenship Status Code", "X(001)");
        field("40", "PLUS/Alternative Student Default/Refund Code", "X(001)");
        field("41", "PLUS/Alternative Student Signature Code", "X(001)");
        field("42", "Filler", "X(020)");
        field("43", "School ID", "9(008)");
        field("44", "Filler", "X(002)");
        field("45", "Loan Period Begin Date (CCYYMMDD)", "9(008)");
        field("46", "Loan Period End Date (CCYYMMDD)", "9(008)");
        field("47", "Grade Level Code", "X(001)");
        field("48", "Filler", "X(001)");
        field("49", "Enrollment Status Code", "X(001)");
        field("50", "Anticipated Completion Date (CCYYMMDD)", "9(008)");
        field("51", "Cost of Attendance", "9(005)");
        field("52", "Expected Family Contribution Amount", "9(005)");
        field("53", "Estimated Financial Aid Amount", "9(005)");
        field("54", "Subsidized Federal Stafford Certified Amount", "9(005)");
        field("55", "Unsubsidized Federal Stafford Certified Amount", "9(005)");
        field("56", "Federal PLUS Certified Amount", "9(005)");
        field("57", "School Certification Date (CCYYMMDD)", "9(008)");
        field("58", "Filler", "X(008)");
        field("59", "Filler", "X(008)");
        field("60", "Alternative Loan Certified Amount", "9(005)");
        field("61", "Alternative Loan Application Version Code", "9(004)");
        field("62", "School Designated Branch/Division Code", "X(002)");
        field("63", "DUNS School ID", "X(009)");
        field("64", "Lender ID", "X(006)");
        field("65", "Subsidized Federal Stafford Approved Amount", "9(005)");
        field("66", "Unsubsidized Federal Stafford Approved Amount", "9(005)");
        field("67", "Federal PLUS Approved Amount", "9(005)");
        field("68", "Lender Approved/Denied Date (CCYYMMDD)", "9(008)");
        field("69", "Lender Approved/Denied Code", "X(001)");
        field("70", "Alternative Loan Approved Amount", "9(005)");
        field("71", "DUNS Lender ID", "X(009)");
        field("72", "Filler", "X(005)");
        field("73", "Guarantor ID", "X(003)");
        field("74", "Federal Application Form Code", "X(001)");
        field("75", "DUNS Guarantor ID", "X(009)");
        field("76", "Filler", "X(011)");
        field("77", "Guarantee Adjustment Indicator Code", "X(001)");
        field("78", "Filler", "X(004)");
        field("79", "Disbursement Date 1 (CCYYMMDD)", "9(008)");
        field("80", "Disbursement Amount 1", "9(005)v99");
        field("81", "Origination Fee 1", "9(005)v99");
        field("82", "Guarantee Fee 1", "9(005)v99");
        field("83", "Net Disbursement Amount 1", "9(005)v99");
        field("84", "Disbursement Date 2 (CCYYMMDD)", "9(008)");
        field("85", "Disbursement Amount 2", "9(005)v99");
        field("86", "Origination Fee 2", "9(005)v99");
        field("87", "Guarantee Fee 2", "9(005)v99");
        field("88", "Net Disbursement Amount 2", "9(005)v99");
        field("89", "Disbursement Date 3 (CCYYMMDD)", "9(008)");
        field("90", "Disbursement Amount 3", "9(005)v99");
        field("91", "Origination Fee 3", "9(005)v99");
        field("92", "Guarantee Fee 3", "9(005)v99");
        field("93", "Net Disbursement Amount 3", "9(005)v99");
        field("94", "Disbursement Date 4 (CCYYMMDD)", "9(008)");
        field("95", "Disbursement Amount 4", "9(005)v99");
        field("96", "Origination Fee 4", "9(005)v99");
        field("97", "Guarantee Fee 4", "9(005)v99");
        field("98", "Net Disbursement Amount 4", "9(005)v99");
        field("99", "Guarantee Date (CCYYMMDD)", "9(008)");
        field("100", "Guarantee Amount", "9(005)");
        field("101", "Serial Loan Code", "X(001)");
        field("102", "MPN Confirmation Code", "X(001)");
        field("103", "Borrower Confirmation Indicator", "X(001)");
        field("104", "Filler", "X(019)");
        field("105", "Borrower Driver's License State", "X(002)");
        field("106", "Borrower Driver's License Number", "X(020)");
        field("107", "Borrower References Code", "X(001)");
        field("108", "School Use Only", "X(023)");
        field("109", "Disbursement 1 Hold/Release Indicator Code", "X(001)");
        field("110", "Disbursement 2 Hold/Release Indicator Code", "X(001)");
        field("111", "Disbursement 3 Hold/Release Indicator Code", "X(001)");
        field("112", "Disbursement 4 Hold/Release Indicator Code", "X(001)");
        field("113", "Promissory Note Delivery Code", "X(001)");
        field("114", "Foreign Postal Code", "X(014)");
        field("115", "Filler", "X(001)");
        field("116", "Lender Non-ED Branch ID", "X(004)");
        field("117", "Lender Use Only", "X(020)");
        field("118", "Lender of Last Resort Code", "X(001)");
        field("119", "Filler", "X(020)");
        field("120", "Disbursement Status Code 1", "X(001)");
        field("121", "Disbursement Status Code 2", "X(001)");
        field("122", "Disbursement Status Code 3", "X(001)");
        field("123", "Disbursement Status Code 4", "X(001)");
        field("124", "Response to Originator Code", "X(001)");
        field("125", "Application Send Error Message Code 1", "X(003)");
        field("126", "Application Send Error Message Code 2", "X(003)");
        field("127", "Application Send Error Message Code 3", "X(003)");
        field("128", "Application Send Error Message Code 4", "X(003)");
        field("129", "Application Send Error Message Code 5", "X(003)");
        field("130", "Guarantee Amount Reduction Code", "X(002)");
        field("131", "Total Outstanding Federal Stafford/SLS Loan Amount", "9(006)V99");
        field("132", "Total Outstanding Federal PLUS Loan Amount", "9(006)v99");
        field("133", "Application/Loan Phase Code", "X(004)");
        field("134", "Date Application/Loan Phase Code Last Updated (CCYYMMDD)", "9(008)");
        field("135", "Guarantor Use Only", "X(023)");
        field("136", "Date Permanent Address Last Updated (CCYYMMDD)", "9(008)");
        field("137", "Alternative Loan Program Type Code", "X(003)");
        field("138", "Alternative Borrower Total Student Loan Debt", "9(007)");
        field("139", "Filler", "X(012)");
        field("140", "Fees Paid 1", "9(005)V99");
        field("141", "Fees Paid 2", "9(005)V99");
        field("142", "Fees Paid 3", "9(005)V99");
        field("143", "Fees Paid 4", "9(005)V99");
        field("144", "Actual Interest Rate", "9(002)V999");
        field("145", "Processing Type Code", "X(002)");
        field("146", "Service Type Code", "X(002)");
        field("147", "Revised Notice of Guarantee Indicator Code", "X(001)");
        field("148", "School Refund Amount", "9(005)V99");
        field("149", "Date of Refund to Lender (CCYYMMDD)", "9(008)");
        field("150", "Unique Layout Vendor Code", "X(004)");
        field("151", "Unique Layout Identifier Code", "X(002)");
        field("152", "Filler", "X(052)");
        recordTerminator("153");
    }

    public String getCode() {
        return "@1";
    }
}
