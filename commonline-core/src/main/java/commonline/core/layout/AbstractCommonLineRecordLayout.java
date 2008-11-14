package commonline.core.layout;

import flapjack.layout.FieldDefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * An abstract class simplifying the construction of the CommonLineFieldDefinitions for a CommonLineRecordLayout
 */
public abstract class AbstractCommonLineRecordLayout implements CommonLineRecordLayout {
    private List fieldDefinitions = new ArrayList();
    private int offset = 0;

    protected AbstractCommonLineRecordLayout() {
        recordCodeField();
        addTrailingFields();
    }

    /**
     * Adds a filler field to the current record layout
     *
     * @param length - the length in bytes of this field
     */
    protected void filler(int length) {
        addMiddleField(new FillerFieldDefinition(getNextPosition(), length), true);
    }


    /**
     * Adds a text field with padding to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void text(String name, int length) {
        addMiddleField(new TextFieldDefinition(getNextPosition(), length, name), true);
    }

    /**
     * Adds a number field with padding to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void number(String name, int length) {
        addMiddleField(new NumberFieldDefinition(getNextPosition(), length, name), true);
    }

    /**
     * Adds a number field that is not padded definition to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void fixedNumber(String name, int length) {
        addMiddleField(new FixedNumberFieldDefinition(getNextPosition(), length, name), true);
    }

    /**
     * Adds a text field that is not padded definition to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void fixedText(String name, int length) {
        addMiddleField(new FixedTextFieldDefinition(getNextPosition(), length, name), true);
    }

    private int getNextPosition() {
        return offset;
    }

    private void removeFieldDefinition(Class fieldDefinitionClass) {
        FieldDefinition match = null;
        for (int i = fieldDefinitions.size() - 1; i >= 0; i--) {
            FieldDefinition def = (FieldDefinition) fieldDefinitions.get(i);
            if (fieldDefinitionClass.isInstance(def)) {
                match = def;
                break;
            }
        }

        if (match != null) {
            fieldDefinitions.remove(match);
        }
    }

    private void recordCodeField() {
        addMiddleField(new RecordCodeFieldDefinition(), false);
    }

    private void addMiddleField(CommonLineFieldDefinition fieldDefinition, boolean moveTrailingFields) {
        if (moveTrailingFields) {
            removeTrailingFields();
        }
        fieldDefinitions.add(fieldDefinition);
        offset += fieldDefinition.getLength();
        if (moveTrailingFields) {
            addTrailingFields();
        }
    }

    private void addTrailingFields() {
        fieldDefinitions.add(new RecordTerminatorFieldDefinition(offset));
    }

    private void removeTrailingFields() {
        removeFieldDefinition(RecordTerminatorFieldDefinition.class);
    }

    public List getFieldDefinitions() {
        return Collections.unmodifiableList(fieldDefinitions);
    }

    public int getLength() {
        int length = 0;
        Iterator it = fieldDefinitions.iterator();
        while (it.hasNext()) {
            FieldDefinition def = (FieldDefinition) it.next();
            length += def.getLength();
        }
        return length;
    }
}
