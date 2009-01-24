package commonline.cl4.response.layout;

import commonline.cl4.appsend.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class TrailerRecordLayoutTest extends AbstractRecordLayoutTestCase {

    public void test() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Response (@1) Detail Record Count", 3, 6);
        assertInteger("3", "Unique Supplemental (@2) Detail Record Count", 9, 6);
        assertInteger("4", "Special Messages (@3) Detail Record Count", 15, 6);
        assertInteger("5", "File Creation Date (CCYYMMDD)", 21, 8);
        assertInteger("6", "File Creation Time (HHMMSS)", 29, 6);
        assertText("7", "File Identifier Code", 35, 5);
        assertText("8", "Recipient Name", 40, 32);
        assertText("9", "Recipient ID", 72, 8);
        assertText("10", "Filler", 80, 2);
        assertText("11", "Recipient Non-ED Branch ID", 82, 4);
        assertText("12", "Source Name", 86, 32);
        assertText("13", "Source ID", 118, 8);
        assertText("14", "Filler", 126, 2);
        assertText("15", "Source Non-ED Branch ID", 128, 4);
        assertInteger("16", "Alternative Loan Response (@4) Detail Record Count", 132, 6);
        assertInteger("17", "Reference Response (@5) Detail Record Count", 138, 6);
        assertInteger("18", "Change Transaction Error (@6) Detail Record Count", 144, 6);
        assertInteger("19", "Supplemental Borrower Information Response (@7) Detail Record Count", 150, 6);
        assertText("20", "DUNS Recipient ID", 156, 9);
        assertText("21", "DUNS Source ID", 165, 9);
        assertText("22", "Filler", 174, 866);
        assertText("23", "Record Terminator", 1040, 1);
    }

    protected RecordLayout createRecordLayout() {
        return new TrailerRecordLayout();
    }

    protected int recordLength() {
        return 1040;
    }

    protected int fieldCount() {
        return 23;
    }

    protected String recordCode() {
        return "@T";
    }

    public void test_fieldDefinitions() {

    }
}
