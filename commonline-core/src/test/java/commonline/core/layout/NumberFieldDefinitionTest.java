package commonline.core.layout;

import junit.framework.TestCase;


public class NumberFieldDefinitionTest extends TestCase {

    public void test() {
        NumberFieldDefinition fieldDef = new NumberFieldDefinition(0, 10, "name");

        assertEquals(0, fieldDef.getPosition());
        assertEquals(10, fieldDef.getLength());
        assertEquals("name", fieldDef.getName());
        assertEquals(Justified.RIGHT, fieldDef.getJustified());
        assertEquals(Padding.ZEROS, fieldDef.getPadding());
        assertEquals(Type.NUMERIC, fieldDef.getType());
    }
}
