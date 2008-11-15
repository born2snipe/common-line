package commonline.core.layout;

import flapjack.layout.SimpleRecordLayout;

/**
 * An abstract class simplifying the construction of the CommonLineFieldDefinitions for a CommonLineRecordLayout
 */
public abstract class AbstractCommonLineRecordLayout extends SimpleRecordLayout implements CommonLineRecordLayout {
    private int offset = 0;

    protected AbstractCommonLineRecordLayout() {
        recordCodeField();
        defineFields();
        addTrailingFields();
    }

    /**
     * Define the fields in the record
     */
    protected abstract void defineFields();

    /**
     * Adds a filler field to the current record layout
     *
     * @param length - the length in bytes of this field
     */
    protected void filler(int length) {
        addMiddleField(new FillerFieldDefinition(offset, length));
    }


    /**
     * Adds a text field with padding to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void text(String name, int length) {
        addMiddleField(new TextFieldDefinition(offset, length, name));
    }

    /**
     * Adds a number field with padding to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void number(String name, int length) {
        addMiddleField(new NumberFieldDefinition(offset, length, name));
    }

    /**
     * Adds a number field that is not padded definition to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void fixedNumber(String name, int length) {
        addMiddleField(new FixedNumberFieldDefinition(offset, length, name));
    }

    /**
     * Adds a text field that is not padded definition to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     */
    protected void fixedText(String name, int length) {
        addMiddleField(new FixedTextFieldDefinition(offset, length, name));
    }

    private void recordCodeField() {
        addMiddleField(new RecordCodeFieldDefinition());
    }

    private void addMiddleField(CommonLineFieldDefinition fieldDefinition) {
        super.addFieldDefinition(fieldDefinition);
        offset += fieldDefinition.getLength();
    }

    private void addTrailingFields() {
        super.addFieldDefinition(new RecordTerminatorFieldDefinition(offset));
    }

}
