package commonline.cl4.response.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class SpecialMessagesRecordLayoutTest extends AbstractRecordLayoutTestCase {


    protected RecordLayout createRecordLayout() {
        return new SpecialMessagesRecordLayout();
    }

    protected int recordLength() {
        return 1040;
    }

    protected int fieldCount() {
        return 8;
    }

    protected String recordCode() {
        return "@3";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Message 1", 3, 160);
        assertText("3", "Message 2", 163, 160);
        assertText("4", "Message 3", 323, 160);
        assertText("5", "Message 4", 483, 160);
        assertText("6", "Message 5", 643, 160);
        assertText("7", "Filler", 803, 237);
        assertText("8", "Record Terminator", 1040, 1);
    }
}
