package commonline.cl4.changesend.layout;

import commonline.cl4.appsend.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class LoanCancellationReinstatementRecordLayoutTest extends AbstractRecordLayoutTestCase {

    protected RecordLayout createRecordLayout() {
        return new LoanCancellationReinstatementRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 35;
    }

    protected String recordCode() {
        return "@108";
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
        assertInteger("23", "Cancellation Date (CCYYMMDD)", 139, 8);
        assertDecimal("24", "Reinstated Loan Amount", 147, 8);
        assertText("25", "Record Status", 155, 1);
        assertText("26", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 156, 20);
        assertText("27", "DUNS School ID", 176, 9);
        assertText("28", "DUNS Recipient ID", 185, 9);
        assertText("29", "DUNS Lender ID", 194, 9);
        assertText("30", "DUNS Servicer Code", 203, 9);
        assertText("31", "Filler", 212, 202);
        assertText("32", "School Use Only", 414, 23);
        assertText("33", "Lender Use Only", 437, 20);
        assertText("34", "Guarantor Use Only", 457, 23);
        assertText("35", "Record Terminator", 480, 1);
    }
}
