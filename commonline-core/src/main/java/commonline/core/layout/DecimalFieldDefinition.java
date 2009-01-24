package commonline.core.layout;


public class DecimalFieldDefinition extends flapjack.cobol.layout.DecimalFieldDefinition implements NewCommonlineFieldDefinition {
    private String id;

    public DecimalFieldDefinition(String id, String name, int position, String pattern) {
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
