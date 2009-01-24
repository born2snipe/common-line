package commonline.core.layout;

import flapjack.cobol.layout.AlphaNumericFieldDefinition;


public class TextFieldDefinition extends AlphaNumericFieldDefinition implements CommonlineFieldDefinition {
    private String id;

    public TextFieldDefinition(String id, String name, int position, String pattern) {
        super(name, position, pattern);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
