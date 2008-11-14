package commonline.core.layout;

import flapjack.layout.SimpleFieldDefinition;


public abstract class BaseCommonLineFieldDefinition extends SimpleFieldDefinition implements CommonLineFieldDefinition {
    private Type type;
    private Justified justified;
    private Padding padding;

    protected BaseCommonLineFieldDefinition(int position, int length, String name, Type type, Justified justified, Padding padding) {
        super(name, position, length);
        this.type = type;
        this.justified = justified;
        this.padding = padding;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Justified getJustified() {
        return justified;
    }

    public void setJustified(Justified justified) {
        this.justified = justified;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }
}
