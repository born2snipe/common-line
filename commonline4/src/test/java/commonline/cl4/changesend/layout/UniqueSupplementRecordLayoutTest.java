package commonline.cl4.changesend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class UniqueSupplementRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new UniqueSupplementRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 5;
    }

    protected String recordCode() {
        return "@2";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Unique Supplemental Vendor Code R1", 3, 4);
        assertText("3", "Unique Supplemental Layout Identifier Code R 1", 7, 2);
        assertText("4", "Filler", 9, 471);
        assertText("5", "Record Terminator", 480, 1);
    }
}
