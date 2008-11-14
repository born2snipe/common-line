package commonline.core.layout;

import junit.framework.TestCase;


public class FixedTextFieldDefinitionTest extends TestCase {

    public void test() {
        FixedTextFieldDefinition fieldDef = new FixedTextFieldDefinition(0, 10, "name");

        assertEquals(0, fieldDef.getPosition());
        assertEquals(10, fieldDef.getLength());
        assertEquals("name", fieldDef.getName());
        assertNull(fieldDef.getJustified());
        assertNull(fieldDef.getPadding());
        assertEquals(Type.ALPHA_NUMERIC, fieldDef.getType());
    }

}
