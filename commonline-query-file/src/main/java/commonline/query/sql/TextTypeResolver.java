package commonline.query.sql;

import commonline.core.layout.TextFieldDefinition;
import flapjack.layout.FieldDefinition;


public class TextTypeResolver implements SqlTypeResolver {
    public SqlType resolve(FieldDefinition fieldDef) {
        return fieldDef instanceof TextFieldDefinition ? SqlType.VARCHAR : null;
    }
}
