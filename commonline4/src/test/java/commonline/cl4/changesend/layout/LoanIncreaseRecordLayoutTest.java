package commonline.cl4.changesend.layout;

import commonline.cl4.appsend.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class LoanIncreaseRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new LoanIncreaseRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 54;
    }

    protected String recordCode() {
        return "@124";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type", 3, 2);
        assertInteger("3", "Borrower SSN", 5, 9);
        assertInteger("4", "School ID", 14, 8);
        assertText("5", "Filler", 22, 3);
        assertText("6", "School Non-ED Branch ID", 25, 4);
        assertText("7", "Recipient ID", 29, 8);
        assertText("8", "Filler", 37, 3);
        assertText("9", "Recipient Non-ED Branch ID", 40, 4);
        assertText("10", "Unique Loan Identifier", 44, 16);
        assertInteger("11", "Guarantee Date (CCYYMMDD)", 60, 8);
        assertText("12", "Loan Type Code", 68, 2);
        assertText("13", "Alternative Loan Program Type Code", 70, 3);
        assertInteger("14", "First Disbursement Date(CCYYMMDD)", 73, 8);
        assertText("15", "Lender ID", 81, 6);
        assertText("16", "Servicer Code", 87, 6);
        assertInteger("17", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertInteger("18", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("19", "School Designated Branch/Division Code", 109, 2);
        assertInteger("20", "PLUS/Alternative Student SSN", 111, 9);
        assertText("21", "CommonLine Unique Identifier", 120, 17);
        assertInteger("22", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("23", "Increased Loan Amount", 139, 6);
        assertInteger("24", "Revised Certification Amount", 145, 6);
        assertInteger("25", "Cost of Attendance", 151, 5);
        assertInteger("26", "Expected Family Contribution Amount", 156, 5);
        assertInteger("27", "Estimated Financial Aid Amount", 161, 5);
        assertInteger("28", "Disbursement Date 1 (CCYYMMDD)", 166, 8);
        assertDecimal("29", "Disbursement Amount 1", 174, 8);
        assertInteger("30", "Disbursement Date 2 (CCYYMMDD)", 182, 8);
        assertDecimal("31", "Disbursement Amount 2", 190, 8);
        assertInteger("32", "Disbursement Date 3 (CCYYMMDD)", 198, 8);
        assertDecimal("33", "Disbursement Amount 3", 206, 8);
        assertInteger("34", "Disbursement Date 4 (CCYYMMDD)", 214, 8);
        assertDecimal("35", "Disbursement Amount 4", 222, 8);
        assertText("36", "Record Status", 230, 1);
        assertInteger("37", "Change Certification Date(CCYYMMDD)", 231, 8);
        assertText("38", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 239, 20);
        assertText("39", "DUNS School ID", 259, 9);
        assertText("40", "DUNS Recipient ID", 268, 9);
        assertText("41", "DUNS Lender ID", 277, 9);
        assertText("42", "DUNS Servicer Code", 286, 9);
        assertText("43", "Lender Non-ED Branch ID", 295, 4);
        assertInteger("44", "Submittal As-Of Date", 299, 8);
        assertInteger("45", "Disbursement Identification Number 1", 307, 2);
        assertInteger("46", "Disbursement Identification Number 2", 309, 2);
        assertInteger("47", "Disbursement Identification Number 3", 311, 2);
        assertInteger("48", "Disbursement Identification Number 4", 313, 2);
        assertText("49", "Filler", 315, 19);
        assertText("50", "School Use Only", 334, 23);
        assertText("51", "Lender Use Only", 357, 20);
        assertText("52", "Guarantor Use Only", 377, 23);
        assertText("53", "Filler", 400, 80);
        assertText("54", "Record Terminator", 480, 1);
    }
}
