package commonline.query.sql;

import flapjack.layout.FieldDefinition;

import java.util.Arrays;
import java.util.List;


public class DateTypeResolver implements SqlTypeResolver {
    private final List<String> commonlineDateFormats = Arrays.asList("CCYYMM", "HHMMSS", "CCYYMMDD", "CCYYMMDDHHMMSSNNNNNN");

    public SqlType resolve(FieldDefinition fieldDef) {
        for (String format : commonlineDateFormats) {
            if (fieldDef.getName().contains(format)) {
                return SqlType.DATE;
            }
        }
        return null;
    }
}
