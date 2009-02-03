package commonline.query.sql;

import flapjack.layout.FieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;


public class IntegerTypeResolver implements SqlTypeResolver {
    public SqlType resolve(FieldDefinition fieldDef) {
        return fieldDef instanceof IntegerFieldDefinition ? SqlType.INT : null;
    }
}
