package commonline.cl4.appsend.layout;

import flapjack.layout.RecordLayout;


public class ApplicationSendDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new ApplicationSendDetailRecordLayout();
    }

    protected int recordLength() {
        return 880;
    }

    protected int fieldCount() {
        return 113;
    }

    protected String recordCode() {
        return "@1";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Record Type Indicator Code", 3, 1);
        assertText("3", "Borrower Last Name", 4, 35);
        assertText("4", "Borrower First Name", 39, 12);
        assertText("5", "Borrower Middle Initial", 51, 1);
        assertInteger("6", "Borrower SSN", 52, 9);
        assertText("7", "Permanent Borrower Address (line 1)", 61, 30);
        assertText("8", "Permanent Borrower Address (line 2)", 91, 30);
        assertText("9", "Permanent Borrower City", 121, 24);
        assertText("10", "Filler", 145, 6);
        assertText("11", "Permanent Borrower State", 151, 2);
        assertInteger("12", "Permanent Borrower Zip Code", 153, 5);
        assertInteger("13", "Permanent Borrower Zip Code Suffix", 158, 4);
        assertText("14", "Borrower Telephone Number", 162, 10);
        assertText("15", "Borrower Lender ID", 172, 6);
        assertInteger("16", "Borrower Date of Birth (CCYYMMDD)", 178, 8);
        assertText("17", "Loan Type Requested Code", 186, 2);
        assertInteger("18", "Requested Loan Amount", 188, 6);
        assertText("19", "Deferment Request Code", 194, 1);
        assertText("20", "Borrower Interest Indicator", 195, 1);
        assertText("21", "EFT Authorization Code", 196, 1);
        assertText("22", "Borrower Signature Code", 197, 1);
        assertInteger("23", "Borrower Signature Date (CCYYMMDD)", 198, 8);
        assertText("24", "CommonLine Unique Identifier", 206, 17);
        assertText("25", "Filler", 223, 3);
        assertText("26", "PLUS/Alternative Borrower U.S. Citizenship Status Code", 226, 1);
        assertText("27", "PLUS Borrower State of Legal Residence", 227, 2);
        assertInteger("28", "PLUS Borrower State Resident Since Date (CCYYMM)", 229, 6);
        assertText("29", "PLUS/Alternative Borrower Default/Refund Code", 235, 1);
        assertText("30", "PLUS Borrower Outstanding Loans Code", 236, 1);
        assertText("31", "Alternative Student/Borrower Indicator Code", 237, 1);
        assertText("32", "DUNS Borrower Lender ID", 238, 9);
        assertText("33", "Filler", 247, 10);
        assertText("34", "PLUS/Alternative Student Last Name", 257, 35);
        assertText("35", "PLUS/Alternative Student First Name", 292, 12);
        assertText("36", "PLUS/Alternative Student Middle Initial", 304, 1);
        assertInteger("37", "PLUS/Alternative Student SSN", 305, 9);
        assertInteger("38", "PLUS/Alternative Student Date of Birth (CCYYMMDD)", 314, 8);
        assertText("39", "PLUS/Alternative Student U.S. Citizenship Status Code", 322, 1);
        assertText("40", "PLUS/Alternative Student Default/Refund Code", 323, 1);
        assertText("41", "PLUS/Alternative Student Signature Code", 324, 1);
        assertText("42", "Filler", 325, 20);
        assertInteger("43", "School ID", 345, 8);
        assertText("44", "Filler", 353, 2);
        assertInteger("45", "Loan Period Begin Date (CCYYMMDD)", 355, 8);
        assertInteger("46", "Loan Period End Date (CCYYMMDD)", 363, 8);
        assertText("47", "Grade Level Code", 371, 1);
        assertText("48", "Filler", 372, 1);
        assertText("49", "Enrollment Status Code", 373, 1);
        assertInteger("50", "Anticipated Completion Date (CCYYMMDD)", 374, 8);
        assertInteger("51", "Cost of Attendance", 382, 5);
        assertInteger("52", "Expected Family Contribution Amount", 387, 5);
        assertInteger("53", "Estimated Financial Aid Amount", 392, 5);
        assertInteger("54", "Subsidized Federal Stafford Certified Amount", 397, 5);
        assertInteger("55", "Unsubsidized Federal Stafford Certified Amount", 402, 5);
        assertInteger("56", "Federal PLUS Certified Amount", 407, 5);
        assertInteger("57", "Recommended Disbursement Date 1 (CCYYMMDD)", 412, 8);
        assertInteger("58", "Recommended Disbursement Date 2 (CCYYMMDD)", 420, 8);
        assertInteger("59", "Recommended Disbursement Date 3 (CCYYMMDD)", 428, 8);
        assertInteger("60", "Recommended Disbursement Date 4 (CCYYMMDD)", 436, 8);
        assertInteger("61", "School Certification Date (CCYYMMDD)", 444, 8);
        assertText("62", "Filler - Expansion for revision of Federal Stafford common application", 452, 8);
        assertText("63", "Filler - Expansion for revision of Federal Stafford common application", 460, 8);
        assertInteger("64", "Alternative Loan Certified Amount", 468, 5);
        assertInteger("65", "Alternative Loan Application Version Code", 473, 4);
        assertText("66", "School Designated Branch/Division Code", 477, 2);
        assertText("67", "DUNS School ID", 479, 9);
        assertText("68", "Lender ID", 488, 6);
        assertInteger("69", "Subsidized Federal Stafford Approved Amount", 494, 5);
        assertInteger("70", "Unsubsidized Federal Stafford Approved Amount", 499, 5);
        assertInteger("71", "Federal PLUS Approved Amount", 504, 5);
        assertInteger("72", "Alternative Loan Approved Amount", 509, 5);
        assertText("73", "DUNS Lender ID", 514, 9);
        assertText("74", "Filler", 523, 6);
        assertText("75", "Guarantor ID", 529, 3);
        assertText("76", "Federal Application Form Code", 532, 1);
        assertText("77", "DUNS Guarantor ID", 533, 9);
        assertText("78", "Filler", 542, 11);
        assertText("79", "Borrower Driver's License State", 553, 2);
        assertText("80", "Borrower Driver's License Number", 555, 20);
        assertText("81", "Borrower References Code", 575, 1);
        assertText("82", "School Use Only", 576, 23);
        assertText("83", "Disbursement 1 Hold/Release Indicator Code", 599, 1);
        assertText("84", "Disbursement 2 Hold/Release Indicator Code", 600, 1);
        assertText("85", "Disbursement 3 Hold/Release Indicator Code", 601, 1);
        assertText("86", "Disbursement 4 Hold/Release Indicator Code", 602, 1);
        assertText("87", "Foreign Postal Code", 603, 14);
        assertText("88", "Serial Loan Code", 617, 1);
        assertText("89", "Filler", 618, 1);
        assertText("90", "Lender Non-ED Branch ID", 619, 4);
        assertText("91", "Lender Use Only", 623, 20);
        assertText("92", "Filler", 643, 1);
        assertText("93", "Processing Type Code", 644, 2);
        assertText("94", "Guarantor Use Only", 646, 23);
        assertText("95", "Promissory Note Delivery Code", 669, 1);
        assertText("96", "Alternative Loan Program Type Code", 670, 3);
        assertInteger("97", "Alternative Borrower Total Student Loan Debt", 673, 7);
        assertInteger("98", "Recommended Alternative Loan Disbursement Amount 1", 680, 5);
        assertInteger("99", "Recommended Alternative Loan Disbursement Amount 2", 685, 5);
        assertInteger("100", "Recommended Alternative Loan Disbursement Amount 3", 690, 5);
        assertInteger("101", "Recommended Alternative Loan Disbursement Amount 4", 695, 5);
        assertInteger("102", "Date Permanent Address Last Updated (CCYYMMDD)", 700, 8);
        assertText("103", "Temporary Borrower Address (line 1)", 708, 30);
        assertText("104", "Temporary Borrower Address (line 2)", 738, 30);
        assertText("105", "Temporary Borrower City", 768, 24);
        assertText("106", "Filler", 792, 6);
        assertText("107", "Temporary Borrower State", 798, 2);
        assertInteger("108", "Temporary Borrower Zip Code", 800, 5);
        assertInteger("109", "Temporary Borrower Zip Code Suffix", 805, 4);
        assertText("110", "Unique Layout Vendor Code", 809, 4);
        assertText("111", "Unique Layout Identifier Code", 813, 2);
        assertText("112", "Filler", 815, 65);
        assertText("113", "Record Terminator", 880, 1);
    }
}
