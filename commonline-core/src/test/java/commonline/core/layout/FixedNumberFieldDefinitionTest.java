package commonline.core.layout;

import junit.framework.TestCase;


public class FixedNumberFieldDefinitionTest extends TestCase {

    public void test() {
        FixedNumberFieldDefinition fieldDef = new FixedNumberFieldDefinition(0, 10, "name");

        assertEquals(0, fieldDef.getPosition());
        assertEquals(10, fieldDef.getLength());
        assertEquals("name", fieldDef.getName());
        assertNull(fieldDef.getJustified());
        assertNull(fieldDef.getPadding());
        assertEquals(Type.NUMERIC, fieldDef.getType());
    }
}
