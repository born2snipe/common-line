package commonline.core.layout;

/**
 * A field definition for a Filler field
 */
public class FillerFieldDefinition extends BaseCommonLineFieldDefinition {

    public FillerFieldDefinition(int position, int length) {
        super(position, length, "Filler", Type.ALPHA_NUMERIC, null, null);
    }
}
