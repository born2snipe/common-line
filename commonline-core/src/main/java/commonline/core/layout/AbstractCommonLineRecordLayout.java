package commonline.core.layout;

import flapjack.cobol.layout.*;

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
     * Defines the Record Termintor field
     *
     * @param id - the id representing the Record Terminator
     */
    protected void recordTerminator(String id) {
        field(id, "Record Terminator", "X");
    }

    /**
     * Defines a field
     *
     * @param id      - the id representing the given field
     * @param name    - the name/descrition of the field
     * @param pattern - the COBOL field definition pattern (ex. 9(10))
     */
    protected void field(String id, String name, String pattern) {
        cobolField(new CommonlineFieldInfo(name, pattern, id));
    }

    private void recordCodeField() {
        field("1", "Record Code", "XX");
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
