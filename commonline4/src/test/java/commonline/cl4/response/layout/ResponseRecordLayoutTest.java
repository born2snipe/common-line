package commonline.cl4.response.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class ResponseRecordLayoutTest extends AbstractRecordLayoutTestCase {

    protected RecordLayout createRecordLayout() {
        return new ResponseRecordLayout();
    }

    protected int recordLength() {
        return 1040;
    }

    protected int fieldCount() {
        return 153;
    }

    protected String recordCode() {
        return "@1";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Record Status Code", 3, 1);
        assertInteger("3", "Date Record Status Last Updated (CCYYMMDD)", 4, 8);
        assertText("4", "Borrower Last Name", 12, 35);
        assertText("5", "Borrower First Name", 47, 12);
        assertText("6", "Borrower Middle Initial", 59, 1);
        assertInteger("7", "Borrower SSN", 60, 9);
        assertText("8", "Permanent Borrower Address (line 1)", 69, 30);
        assertText("9", "Permanent Borrower Address (line 2)", 99, 30);
        assertText("10", "Permanent Borrower City", 129, 24);
        assertText("11", "Filler", 153, 6);
        assertText("12", "Permanent Borrower State", 159, 2);
        assertInteger("13", "Permanent Borrower Zip Code", 161, 5);
        assertInteger("14", "Permanent Borrower Zip Code Suffix", 166, 4);
        assertText("15", "Borrower Telephone Number", 170, 10);
        assertInteger("16", "Borrower Date of Birth (CCYYMMDD)", 180, 8);
        assertText("17", "Loan Type Code", 188, 2);
        assertInteger("18", "Requested Loan Amount", 190, 6);
        assertText("19", "Deferment Request Code", 196, 1);
        assertText("20", "Borrower Interest Indicator", 197, 1);
        assertText("21", "EFT Authorization Code", 198, 1);
        assertText("22", "Borrower Signature Code", 199, 1);
        assertInteger("23", "Borrower Signature Date (CCYYMMDD)", 200, 8);
        assertText("24", "CommonLine Unique Identifier", 208, 17);
        assertInteger("25", "CommonLine Loan Sequence Number", 225, 2);
        assertText("26", "Filler", 227, 1);
        assertText("27", "PLUS/Alternative Borrower U.S. Citizenship Status Code", 228, 1);
        assertText("28", "PLUS Borrower State of Legal Residence", 229, 2);
        assertInteger("29", "PLUS Borrower State Resident Since Date (CCYYMM)", 231, 6);
        assertText("30", "PLUS/Alternative Borrower Default/Refund Code", 237, 1);
        assertText("31", "PLUS Borrower Outstanding Loans Code", 238, 1);
        assertText("32", "Alternative Student/Borrower Indicator Code", 239, 1);
        assertText("33", "Filler", 240, 19);
        assertText("34", "PLUS/Alternative Student Last Name", 259, 35);
        assertText("35", "PLUS/Alternative Student First Name", 294, 12);
        assertText("36", "PLUS/Alternative Student Middle Initial", 306, 1);
        assertInteger("37", "PLUS/Alternative Student SSN", 307, 9);
        assertInteger("38", "PLUS/Alternative Student Date of Birth (CCYYMMDD)", 316, 8);
        assertText("39", "PLUS/Alternative Student U.S. Citizenship Status Code", 324, 1);
        assertText("40", "PLUS/Alternative Student Default/Refund Code", 325, 1);
        assertText("41", "PLUS/Alternative Student Signature Code", 326, 1);
        assertText("42", "Filler", 327, 20);
        assertInteger("43", "School ID", 347, 8);
        assertText("44", "Filler", 355, 2);
        assertInteger("45", "Loan Period Begin Date (CCYYMMDD)", 357, 8);
        assertInteger("46", "Loan Period End Date (CCYYMMDD)", 365, 8);
        assertText("47", "Grade Level Code", 373, 1);
        assertText("48", "Filler", 374, 1);
        assertText("49", "Enrollment Status Code", 375, 1);
        assertInteger("50", "Anticipated Completion Date (CCYYMMDD)", 376, 8);
        assertInteger("51", "Cost of Attendance", 384, 5);
        assertInteger("52", "Expected Family Contribution Amount", 389, 5);
        assertInteger("53", "Estimated Financial Aid Amount", 394, 5);
        assertInteger("54", "Subsidized Federal Stafford Certified Amount", 399, 5);
        assertInteger("55", "Unsubsidized Federal Stafford Certified Amount", 404, 5);
        assertInteger("56", "Federal PLUS Certified Amount", 409, 5);
        assertInteger("57", "School Certification Date (CCYYMMDD)", 414, 8);
        assertText("58", "Filler", 422, 8);
        assertText("59", "Filler", 430, 8);
        assertInteger("60", "Alternative Loan Certified Amount", 438, 5);
        assertInteger("61", "Alternative Loan Application Version Code", 443, 4);
        assertText("62", "School Designated Branch/Division Code", 447, 2);
        assertText("63", "DUNS School ID", 449, 9);
        assertText("64", "Lender ID", 458, 6);
        assertInteger("65", "Subsidized Federal Stafford Approved Amount", 464, 5);
        assertInteger("66", "Unsubsidized Federal Stafford Approved Amount", 469, 5);
        assertInteger("67", "Federal PLUS Approved Amount", 474, 5);
        assertInteger("68", "Lender Approved/Denied Date (CCYYMMDD)", 479, 8);
        assertText("69", "Lender Approved/Denied Code", 487, 1);
        assertInteger("70", "Alternative Loan Approved Amount", 488, 5);
        assertText("71", "DUNS Lender ID", 493, 9);
        assertText("72", "Filler", 502, 5);
        assertText("73", "Guarantor ID", 507, 3);
        assertText("74", "Federal Application Form Code", 510, 1);
        assertText("75", "DUNS Guarantor ID", 511, 9);
        assertText("76", "Filler", 520, 11);
        assertText("77", "Guarantee Adjustment Indicator Code", 531, 1);
        assertText("78", "Filler", 532, 4);
        assertInteger("79", "Disbursement Date 1 (CCYYMMDD)", 536, 8);
        assertDecimal("80", "Disbursement Amount 1", 544, 7);
        assertDecimal("81", "Origination Fee 1", 551, 7);
        assertDecimal("82", "Guarantee Fee 1", 558, 7);
        assertDecimal("83", "Net Disbursement Amount 1", 565, 7);
        assertInteger("84", "Disbursement Date 2 (CCYYMMDD)", 572, 8);
        assertDecimal("85", "Disbursement Amount 2", 580, 7);
        assertDecimal("86", "Origination Fee 2", 587, 7);
        assertDecimal("87", "Guarantee Fee 2", 594, 7);
        assertDecimal("88", "Net Disbursement Amount 2", 601, 7);
        assertInteger("89", "Disbursement Date 3 (CCYYMMDD)", 608, 8);
        assertDecimal("90", "Disbursement Amount 3", 616, 7);
        assertDecimal("91", "Origination Fee 3", 623, 7);
        assertDecimal("92", "Guarantee Fee 3", 630, 7);
        assertDecimal("93", "Net Disbursement Amount 3", 637, 7);
        assertInteger("94", "Disbursement Date 4 (CCYYMMDD)", 644, 8);
        assertDecimal("95", "Disbursement Amount 4", 652, 7);
        assertDecimal("96", "Origination Fee 4", 659, 7);
        assertDecimal("97", "Guarantee Fee 4", 666, 7);
        assertDecimal("98", "Net Disbursement Amount 4", 673, 7);
        assertInteger("99", "Guarantee Date (CCYYMMDD)", 680, 8);
        assertInteger("100", "Guarantee Amount", 688, 5);
        assertText("101", "Serial Loan Code", 693, 1);
        assertText("102", "MPN Confirmation Code", 694, 1);
        assertText("103", "Borrower Confirmation Indicator", 695, 1);
        assertText("104", "Filler", 696, 19);
        assertText("105", "Borrower Driver's License State", 715, 2);
        assertText("106", "Borrower Driver's License Number", 717, 20);
        assertText("107", "Borrower References Code", 737, 1);
        assertText("108", "School Use Only", 738, 23);
        assertText("109", "Disbursement 1 Hold/Release Indicator Code", 761, 1);
        assertText("110", "Disbursement 2 Hold/Release Indicator Code", 762, 1);
        assertText("111", "Disbursement 3 Hold/Release Indicator Code", 763, 1);
        assertText("112", "Disbursement 4 Hold/Release Indicator Code", 764, 1);
        assertText("113", "Promissory Note Delivery Code", 765, 1);
        assertText("114", "Foreign Postal Code", 766, 14);
        assertText("115", "Filler", 780, 1);
        assertText("116", "Lender Non-ED Branch ID", 781, 4);
        assertText("117", "Lender Use Only", 785, 20);
        assertText("118", "Lender of Last Resort Code", 805, 1);
        assertText("119", "Filler", 806, 20);
        assertText("120", "Disbursement Status Code 1", 826, 1);
        assertText("121", "Disbursement Status Code 2", 827, 1);
        assertText("122", "Disbursement Status Code 3", 828, 1);
        assertText("123", "Disbursement Status Code 4", 829, 1);
        assertText("124", "Response to Originator Code", 830, 1);
        assertText("125", "Application Send Error Message Code 1", 831, 3);
        assertText("126", "Application Send Error Message Code 2", 834, 3);
        assertText("127", "Application Send Error Message Code 3", 837, 3);
        assertText("128", "Application Send Error Message Code 4", 840, 3);
        assertText("129", "Application Send Error Message Code 5", 843, 3);
        assertText("130", "Guarantee Amount Reduction Code", 846, 2);
        assertDecimal("131", "Total Outstanding Federal Stafford/SLS Loan Amount", 848, 8);
        assertDecimal("132", "Total Outstanding Federal PLUS Loan Amount", 856, 8);
        assertText("133", "Application/Loan Phase Code", 864, 4);
        assertInteger("134", "Date Application/Loan Phase Code Last Updated (CCYYMMDD)", 868, 8);
        assertText("135", "Guarantor Use Only", 876, 23);
        assertInteger("136", "Date Permanent Address Last Updated (CCYYMMDD)", 899, 8);
        assertText("137", "Alternative Loan Program Type Code", 907, 3);
        assertInteger("138", "Alternative Borrower Total Student Loan Debt", 910, 7);
        assertText("139", "Filler", 917, 12);
        assertDecimal("140", "Fees Paid 1", 929, 7);
        assertDecimal("141", "Fees Paid 2", 936, 7);
        assertDecimal("142", "Fees Paid 3", 943, 7);
        assertDecimal("143", "Fees Paid 4", 950, 7);
        assertDecimal("144", "Actual Interest Rate", 957, 5);
        assertText("145", "Processing Type Code", 962, 2);
        assertText("146", "Service Type Code", 964, 2);
        assertText("147", "Revised Notice of Guarantee Indicator Code", 966, 1);
        assertDecimal("148", "School Refund Amount", 967, 7);
        assertInteger("149", "Date of Refund to Lender (CCYYMMDD)", 974, 8);
        assertText("150", "Unique Layout Vendor Code", 982, 4);
        assertText("151", "Unique Layout Identifier Code", 986, 2);
        assertText("152", "Filler", 988, 52);
        assertText("153", "Record Terminator", 1040, 1);

    }
}
