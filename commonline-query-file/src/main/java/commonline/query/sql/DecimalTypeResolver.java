package commonline.query.sql;

import flapjack.layout.FieldDefinition;


public class DecimalTypeResolver implements SqlTypeResolver {
    public SqlType resolve(FieldDefinition fieldDef) {
        return SqlType.DOUBLE;
    }
}
