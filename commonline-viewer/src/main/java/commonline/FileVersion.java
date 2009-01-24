package commonline;

import java.util.Arrays;


public enum FileVersion {
    CL4("R004P", "R004T", "C004P", "C004T", "A004P", "A004T"),
    CL5("R005P", "R005T", "C005P", "C005T", "A005P", "A005T");

    private String[] identifiers;

    FileVersion(String... identifiers) {
        this.identifiers = identifiers;
    }


    public static FileVersion evaluate(String identifier) {
        for (FileVersion version : values()) {
            if (Arrays.asList(version.identifiers).contains(identifier)) {
                return version;
            }
        }
        return null;
    }
}
