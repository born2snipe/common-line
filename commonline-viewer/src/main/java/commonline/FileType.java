package commonline;


public enum FileType {
    RESPONSE("COMMON RESPONSE", "Response"),
    APP_SEND("COMMON APPLICATIONS", "Application Send"),
    CHANGE_SEND("CHANGE TRANS", "Change Send");

    private String identifierName;
    private String description;

    FileType(String identifierName, String description) {
        this.identifierName = identifierName;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static FileType evaluate(String identifier) {
        for (FileType type : values()) {
            if (type.identifierName.equals(identifier)) {
                return type;
            }
        }

        return null;
    }
}
