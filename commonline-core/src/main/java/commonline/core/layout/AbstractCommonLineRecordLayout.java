package commonline.core.layout;

import flapjack.cobol.layout.*;
import flapjack.layout.FieldDefinition;

/**
 * An abstract class simplifying the construction of the CommonLineFieldDefinitions for a CommonLineRecordLayout
 */
public abstract class AbstractCommonLineRecordLayout extends AbstractCobolRecordLayout implements CommonLineRecordLayout {
    private int offset = 2;

    protected AbstractCommonLineRecordLayout() {
        setFieldDefFactory(new FieldDefinitionFactory() {
            public CobolFieldDefinition build(CobolFieldInfo fieldInfo) {
                CommonlineFieldInfo info = (CommonlineFieldInfo) fieldInfo;
                if (info.getType() == CobolFieldType.ALPHA_NUMERIC)
                    return new TextFieldDefinition(info.getId(), info.getName(), info.getPosition(), info.getPattern());
                else if (info.getType() == CobolFieldType.INTEGER)
                    return new IntegerFieldDefinition(info.getId(), info.getName(), info.getPosition(), info.getPattern());
                else if (info.getType() == CobolFieldType.DECIMAL)
                    return new DecimalFieldDefinition(info.getId(), info.getName(), info.getPosition(), info.getPattern());
                return null;
            }
        });

        recordCodeField();
        defineFields();
    }

    /**
     * Define the fields in the record
     */
    protected abstract void defineFields();

    /**
     * Adds a filler field to the current record layout
     *
     * @param length - the length in bytes of this field
     * @deprecated
     */
    protected void filler(int length) {
        addMiddleField(new FillerFieldDefinition(offset, length));
    }


    /**
     * Adds a text field with padding to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     * @deprecated - should be changed to use the cobol pattern support
     */
    protected void text(String name, int length) {
        addMiddleField(new TextFieldDefinition("", name, offset, ""));
    }

    /**
     * Adds a number field with padding to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     * @deprecated - should be changed to use the cobol pattern support
     */
    protected void number(String name, int length) {
        addMiddleField(new NumberFieldDefinition(offset, length, name));
    }

    /**
     * Adds a number field that is not padded definition to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     * @deprecated - should be changed to use the cobol pattern support
     */
    protected void fixedNumber(String name, int length) {
        addMiddleField(new FixedNumberFieldDefinition(offset, length, name));
    }

    /**
     * Adds a text field that is not padded definition to the current record layout
     *
     * @param name   - decriptive name for field
     * @param length - the length in bytes of this field
     * @deprecated - should be changed to use the cobol pattern support
     */
    protected void fixedText(String name, int length) {
        addMiddleField(new FixedTextFieldDefinition(offset, length, name));
    }

    private void recordCodeField() {
        field("1", "Record Code", "XX");
    }

    private void addMiddleField(FieldDefinition fieldDefinition) {
        super.addFieldDefinition(fieldDefinition);
        offset += fieldDefinition.getLength();
    }

    protected void recordTerminator(String id) {
        field(id, "Record Terminator", "X");
    }

    protected void field(String id, String name, String pattern) {
        cobolField(new CommonlineFieldInfo(name, pattern, id));
    }

    private static class CommonlineFieldInfo extends CobolFieldInfo {
        private String id;

        private CommonlineFieldInfo(String name, String pattern, String id) {
            super(name, pattern);
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

}
