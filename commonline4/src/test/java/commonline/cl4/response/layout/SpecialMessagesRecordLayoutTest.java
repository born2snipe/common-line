package commonline.cl4.response.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;


public class SpecialMessagesRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        SpecialMessagesRecordLayout layout = new SpecialMessagesRecordLayout();

        assertEquals("@3", layout.getCode());
        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertTextField("Message 1", 3, 160, layout.getFieldDefinitions().get(i++));
        assertTextField("Message 2", 163, 160, layout.getFieldDefinitions().get(i++));
        assertTextField("Message 3", 323, 160, layout.getFieldDefinitions().get(i++));
        assertTextField("Message 4", 483, 160, layout.getFieldDefinitions().get(i++));
        assertTextField("Message 5", 643, 160, layout.getFieldDefinitions().get(i++));
        assertFillerField(803, 237, layout.getFieldDefinitions().get(i++));
        assertRecordTerminatorField(1040, layout.getFieldDefinitions());

        assertEquals(1040, layout.getLength());
        assertEquals(8, layout.getFieldDefinitions().size());
    }
}
