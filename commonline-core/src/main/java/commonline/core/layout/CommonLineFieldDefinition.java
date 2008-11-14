package commonline.core.layout;

import flapjack.layout.FieldDefinition;

/**
 * Represents the definition of a field
 */
public interface CommonLineFieldDefinition extends FieldDefinition {

    /**
     * The data type of the field
     *
     * @return
     */
    Type getType();

    /**
     * The justification of the field layout
     *
     * @return
     */
    Justified getJustified();

    /**
     * The type of padding used
     *
     * @return
     */
    Padding getPadding();
}
