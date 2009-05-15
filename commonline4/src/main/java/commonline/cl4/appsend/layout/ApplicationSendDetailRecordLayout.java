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


public class ApplicationSendDetailRecordLayout extends AbstractCommonLineRecordLayout {
    public ApplicationSendDetailRecordLayout() {
        super("@1");
    }

    protected void defineFields() {
        field("2", "Record Type Indicator Code", "X(1)");
        field("3", "Borrower Last Name", "X(35)");
        field("4", "Borrower First Name", "X(12)");
        field("5", "Borrower Middle Initial", "X(1)");
        field("6", "Borrower SSN", "9(9)");
        field("7", "Permanent Borrower Address (line 1)", "X(30)");
        field("8", "Permanent Borrower Address (line 2)", "X(30)");
        field("9", "Permanent Borrower City", "X(24)");
        field("10", "Filler", "X(6)");
        field("11", "Permanent Borrower State", "X(2)");
        field("12", "Permanent Borrower Zip Code", "9(5)");
        field("13", "Permanent Borrower Zip Code Suffix", "9(4)");
        field("14", "Borrower Telephone Number", "X(10)");
        field("15", "Borrower Lender ID", "X(6)");
        field("16", "Borrower Date of Birth (CCYYMMDD)", "9(8)");
        field("17", "Loan Type Requested Code", "X(2)");
        field("18", "Requested Loan Amount", "9(6)");
        field("19", "Deferment Request Code", "X(1)");
        field("20", "Borrower Interest Indicator", "X(1)");
        field("21", "EFT Authorization Code", "X(1)");
        field("22", "Borrower Signature Code", "X(1)");
        field("23", "Borrower Signature Date (CCYYMMDD)", "9(8)");
        field("24", "CommonLine Unique Identifier", "X(17)");
        field("25", "Filler", "X(3)");
        field("26", "PLUS/Alternative Borrower U.S. Citizenship Status Code", "X(1)");
        field("27", "PLUS Borrower State of Legal Residence", "X(2)");
        field("28", "PLUS Borrower State Resident Since Date (CCYYMM)", "9(6)");
        field("29", "PLUS/Alternative Borrower Default/Refund Code", "X(1)");
        field("30", "PLUS Borrower Outstanding Loans Code", "X(1)");
        field("31", "Alternative Student/Borrower Indicator Code", "X(1)");
        field("32", "DUNS Borrower Lender ID", "X(9)");
        field("33", "Filler", "X(10)");
        field("34", "PLUS/Alternative Student Last Name", "X(35)");
        field("35", "PLUS/Alternative Student First Name", "X(12)");
        field("36", "PLUS/Alternative Student Middle Initial", "X(1)");
        field("37", "PLUS/Alternative Student SSN", "9(9)");
        field("38", "PLUS/Alternative Student Date of Birth (CCYYMMDD)", "9(8)");
        field("39", "PLUS/Alternative Student U.S. Citizenship Status Code", "X(1)");
        field("40", "PLUS/Alternative Student Default/Refund Code", "X(1)");
        field("41", "PLUS/Alternative Student Signature Code", "X(1)");
        field("42", "Filler", "X(20)");
        field("43", "School ID", "9(8)");
        field("44", "Filler", "X(2)");
        field("45", "Loan Period Begin Date (CCYYMMDD)", "9(8)");
        field("46", "Loan Period End Date (CCYYMMDD)", "9(8)");
        field("47", "Grade Level Code", "X(1)");
        field("48", "Filler", "X(1)");
        field("49", "Enrollment Status Code", "X(1)");
        field("50", "Anticipated Completion Date (CCYYMMDD)", "9(8)");
        field("51", "Cost of Attendance", "9(5)");
        field("52", "Expected Family Contribution Amount", "9(5)");
        field("53", "Estimated Financial Aid Amount", "9(5)");
        field("54", "Subsidized Federal Stafford Certified Amount", "9(5)");
        field("55", "Unsubsidized Federal Stafford Certified Amount", "9(5)");
        field("56", "Federal PLUS Certified Amount", "9(5)");
        field("57", "Recommended Disbursement Date 1 (CCYYMMDD)", "9(8)");
        field("58", "Recommended Disbursement Date 2 (CCYYMMDD)", "9(8)");
        field("59", "Recommended Disbursement Date 3 (CCYYMMDD)", "9(8)");
        field("60", "Recommended Disbursement Date 4 (CCYYMMDD)", "9(8)");
        field("61", "School Certification Date (CCYYMMDD)", "9(8)");
        field("62", "Filler", "X(8)");
        field("63", "Filler", "X(8)");
        field("64", "Alternative Loan Certified Amount", "9(5)");
        field("65", "Alternative Loan Application Version Code", "9(4)");
        field("66", "School Designated Branch/Division Code", "X(2)");
        field("67", "DUNS School ID", "X(9)");
        field("68", "Lender ID", "X(6)");
        field("69", "Subsidized Federal Stafford Approved Amount", "9(5)");
        field("70", "Unsubsidized Federal Stafford Approved Amount", "9(5)");
        field("71", "Federal PLUS Approved Amount", "9(5)");
        field("72", "Alternative Loan Approved Amount", "9(5)");
        field("73", "DUNS Lender ID", "X(9)");
        field("74", "Filler", "X(6)");
        field("75", "Guarantor ID", "X(3)");
        field("76", "Federal Application Form Code", "X(1)");
        field("77", "DUNS Guarantor ID", "X(9)");
        field("78", "Filler", "X(11)");
        field("79", "Borrower Driver's License State", "X(2)");
        field("80", "Borrower Driver's License Number", "X(20)");
        field("81", "Borrower References Code", "X(1)");
        field("82", "School Use Only", "X(23)");
        field("83", "Disbursement 1 Hold/Release Indicator Code", "X(1)");
        field("84", "Disbursement 2 Hold/Release Indicator Code", "X(1)");
        field("85", "Disbursement 3 Hold/Release Indicator Code", "X(1)");
        field("86", "Disbursement 4 Hold/Release Indicator Code", "X(1)");
        field("87", "Foreign Postal Code", "X(14)");
        field("88", "Serial Loan Code", "X(1)");
        field("89", "Filler", "X(1)");
        field("90", "Lender Non-ED Branch ID", "X(4)");
        field("91", "Lender Use Only", "X(20)");
        field("92", "Filler", "X(1)");
        field("93", "Processing Type Code", "X(2)");
        field("94", "Guarantor Use Only", "X(23)");
        field("95", "Promissory Note Delivery Code", "X(1)");
        field("96", "Alternative Loan Program Type Code", "X(3)");
        field("97", "Alternative Borrower Total Student Loan Debt", "9(7)");
        field("98", "Recommended Alternative Loan Disbursement Amount 1", "9(5)");
        field("99", "Recommended Alternative Loan Disbursement Amount 2", "9(5)");
        field("100", "Recommended Alternative Loan Disbursement Amount 3", "9(5)");
        field("101", "Recommended Alternative Loan Disbursement Amount 4", "9(5)");
        field("102", "Date Permanent Address Last Updated (CCYYMMDD)", "9(8)");
        field("103", "Temporary Borrower Address (line 1)", "X(30)");
        field("104", "Temporary Borrower Address (line 2)", "X(30)");
        field("105", "Temporary Borrower City", "X(24)");
        field("106", "Filler", "X(6)");
        field("107", "Temporary Borrower State", "X(2)");
        field("108", "Temporary Borrower Zip Code", "9(5)");
        field("109", "Temporary Borrower Zip Code Suffix", "9(4)");
        field("110", "Unique Layout Vendor Code", "X(4)");
        field("111", "Unique Layout Identifier Code", "X(2)");
        field("112", "Filler", "X(65)");
        recordTerminator("113");
    }

}
