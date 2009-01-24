package commonline.test.layout;

import commonline.core.layout.*;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.List;

import flapjack.layout.RecordLayout;
import flapjack.layout.FieldDefinition;


public class CommonLineRecordLayoutTestCase extends TestCase {

    protected void printOutFieldDefinitions(RecordLayout recordLayout) {
        Iterator it = recordLayout.getFieldDefinitions().iterator();
        int i = 1;
        while (it.hasNext()) {
            CommonLineFieldDefinition def = (CommonLineFieldDefinition) it.next();
            System.out.println(i + "\t" + def.getName());
            i++;
        }
    }

    protected void assertNumberField(String expectedName, int expectedPosition, int expectedLength, Object actualObj) {
        assertFieldDefinitionType(NumberFieldDefinition.class, actualObj);
        assertFieldDefinition(expectedName, expectedPosition, expectedLength, Type.NUMERIC, Justified.RIGHT, Padding.ZEROS, actualObj);
    }

    protected void assertFixedNumberField(String expectedName, int expectedPosition, int expectedLength, Object actualObj) {
        assertFieldDefinitionType(FixedNumberFieldDefinition.class, actualObj);
        assertFieldDefinition(expectedName, expectedPosition, expectedLength, Type.NUMERIC, actualObj);
    }

    protected void assertFixedTextField(String expectedName, int expectedPosition, int expectedLength, Object actualObj) {
        assertFieldDefinitionType(FixedTextFieldDefinition.class, actualObj);
        assertFieldDefinition(expectedName, expectedPosition, expectedLength, Type.ALPHA_NUMERIC, actualObj);
    }

    protected void assertTextField(String expectedName, int expectedPosition, int expectedLength, Object actualObj) {
        assertFieldDefinitionType(TextFieldDefinition.class, actualObj);
        assertFieldDefinition(expectedName, expectedPosition, expectedLength, Type.ALPHA_NUMERIC, Justified.LEFT, Padding.SPACES, actualObj);
    }

    protected void assertRecordTerminatorField(int expectedPosition, List definitions) {
        Object obj = definitions.get(definitions.size() - 1);
        assertFieldDefinitionType(RecordTerminatorFieldDefinition.class, obj);
        assertPosition(expectedPosition, (RecordTerminatorFieldDefinition) obj, "record terminator");
    }

    protected void assertRecordCodeField(List definitions) {
        FieldDefinition fieldDef = (FieldDefinition) definitions.get(0);
        assertTrue("expected TextFieldDefinition, but was "+fieldDef.getClass().getName(), fieldDef instanceof TextFieldDefinition);
        TextFieldDefinition textField = (TextFieldDefinition) fieldDef;
        assertEquals("1", textField.getId());
        assertEquals(0, textField.getPosition());
        assertEquals(2, textField.getLength());
    }

    protected void assertFieldDefinition(String expectedName, int expectedPosition, int expectedLength, Type expectedType, Justified expectedJustfied, Padding expectedPadding, Object actualObj) {
        CommonLineFieldDefinition fieldDef = convertToFieldDefinition(actualObj);
        Assert.assertEquals(expectedName, fieldDef.getName());
        assertPosition(expectedPosition, fieldDef, expectedName);
        Assert.assertEquals("Failed length for field=" + expectedName, expectedLength, fieldDef.getLength());
        Assert.assertEquals("Failed type for field=" + expectedName, expectedType, fieldDef.getType());
        Assert.assertEquals("Failed justification for field=" + expectedName, expectedJustfied, fieldDef.getJustified());
        Assert.assertEquals("Failed padding for field=" + expectedName, expectedPadding, fieldDef.getPadding());
    }

    private void assertPosition(int expectedPosition, FieldDefinition fieldDef, String name) {
        Assert.assertEquals("Failed position for field=" + name, expectedPosition - 1, fieldDef.getPosition());
    }

    protected void assertFieldDefinition(String expectedName, int expectedPosition, int expectedLength, Type expectedType, Object actualObj) {
        assertFieldDefinition(expectedName, expectedPosition, expectedLength, expectedType, null, null, actualObj);
    }

    protected void assertFillerField(int expectedPostion, int expectedLength, Object actualObj) {
        assertFieldDefinitionType(FillerFieldDefinition.class, actualObj);
        FillerFieldDefinition filler = (FillerFieldDefinition) convertToFieldDefinition(actualObj);
        assertPosition(expectedPostion, filler, filler.getName());
        Assert.assertEquals(expectedLength, filler.getLength());
    }

    private void assertFieldDefinitionType(Class expectedClass, Object actualObj) {
        assertTrue("Not a " + expectedClass.getName() + ", was " + actualObj.getClass().getName(), expectedClass.isInstance(actualObj));
    }

    private CommonLineFieldDefinition convertToFieldDefinition(Object actualObj) {
        assertTrue("Not a field definition given", actualObj instanceof CommonLineFieldDefinition);
        return (CommonLineFieldDefinition) actualObj;
    }
}
