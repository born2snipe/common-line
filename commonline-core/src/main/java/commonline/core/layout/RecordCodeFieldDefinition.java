package commonline.core.layout;

/**
 * Represents the record code for each record
 */
public class RecordCodeFieldDefinition extends BaseCommonLineFieldDefinition {

    public RecordCodeFieldDefinition() {
        super(0, 2, "Record Code", Type.ALPHA_NUMERIC, null, null);
    }
}
