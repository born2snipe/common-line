package commonline.cl4.response.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;


public class UniqueSupplementDetailRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        UniqueSupplementDetailRecordLayout layout = new UniqueSupplementDetailRecordLayout();

        assertEquals("@2", layout.getCode());
        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertTextField("Unique Supplemental Vendor Code", 3, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Unique Supplemental Layout Identifier Code", 7, 2, layout.getFieldDefinitions().get(i++));
        assertFillerField(9, 1031, layout.getFieldDefinitions().get(i++));
        assertRecordTerminatorField(1040, layout.getFieldDefinitions());

        assertEquals(1040, layout.getLength());
        assertEquals(5, layout.getFieldDefinitions().size());
    }
}
