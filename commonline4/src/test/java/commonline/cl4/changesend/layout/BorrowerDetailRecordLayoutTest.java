package commonline.cl4.changesend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;

public class BorrowerDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {


    protected RecordLayout createRecordLayout() {
        return new BorrowerDetailRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 24;
    }

    protected String recordCode() {
        return "@102";
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
        assertText("10", "Filler", 44, 12);
        assertText("11", "Borrower Last Name", 56, 35);
        assertText("12", "Borrower First Name", 91, 12);
        assertText("13", "Borrower Middle Initial", 103, 1);
        assertInteger("14", "Borrower Date of Birth (CCYYMMDD)", 104, 8);
        assertText("15", "Record Status", 112, 1);
        assertText("16", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 113, 20);
        assertText("17", "DUNS School ID", 133, 9);
        assertText("18", "DUNS Recipient ID", 142, 9);
        assertText("19", "Filler", 151, 183);
        assertText("20", "School Use Only", 334, 23);
        assertText("21", "Lender Use Only", 357, 20);
        assertText("22", "Guarantor Use Only", 377, 23);
        assertText("23", "Filler", 400, 80);
        assertText("24", "Record Terminator", 480, 1);
    }
}
