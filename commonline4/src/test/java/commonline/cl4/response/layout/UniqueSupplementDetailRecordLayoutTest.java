package commonline.cl4.response.layout;

import commonline.cl4.appsend.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class UniqueSupplementDetailRecordLayoutTest extends AbstractRecordLayoutTestCase {


    protected RecordLayout createRecordLayout() {
        return new UniqueSupplementDetailRecordLayout();
    }

    protected int recordLength() {
        return 1040;
    }

    protected int fieldCount() {
        return 5;
    }

    protected String recordCode() {
        return "@2";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Unique Supplemental Vendor Code", 3, 4);
        assertText("3", "Unique Supplemental Layout Identifier Code", 7, 2);
        assertText("4", "Filler", 9, 1031);
        assertText("5", "Record Terminator", 1040, 1);
    }
}
