package commonline.core.layout;

import junit.framework.TestCase;


public class TextFieldDefinitionTest extends TestCase {

    public void test() {
        TextFieldDefinition fieldDef = new TextFieldDefinition(0, 10, "name");

        assertEquals(0, fieldDef.getPosition());
        assertEquals(10, fieldDef.getLength());
        assertEquals("name", fieldDef.getName());
        assertEquals(Justified.LEFT, fieldDef.getJustified());
        assertEquals(Padding.SPACES, fieldDef.getPadding());
        assertEquals(Type.ALPHA_NUMERIC, fieldDef.getType());
    }

}
