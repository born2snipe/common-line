package commonline.query.sql;

import flapjack.layout.FieldDefinition;
import flapjack.layout.RecordLayout;
import flapjack.parser.RecordParser;

import java.util.HashMap;
import java.util.Map;


public class CommonlineRecordLayoutTableInfoFactory implements RecordLayoutTableInfoFactory {
    private TableNameResolver tableNameResolver;
    private CobolFieldColumnFactory fieldColumnFactory;
    private Map<Class, String> prependForParsers = new HashMap<Class, String>();

    public RecordLayoutTableInfo build(RecordParser parser, RecordLayout recordLayout) {
        RecordLayoutTableInfo info = new RecordLayoutTableInfo(recordLayout);
        if (prependForParsers.containsKey(parser.getClass())) {
            info.setTableName(prependForParsers.get(parser.getClass()) + "_" + tableNameResolver.resolve(recordLayout));
        } else {
            info.setTableName(tableNameResolver.resolve(recordLayout));
        }
        for (Object o : recordLayout.getFieldDefinitions()) {
            FieldDefinition fieldDef = (FieldDefinition) o;
            info.registerFieldColumn(fieldColumnFactory.build(fieldDef));
        }
        return info;
    }

    public void setTableNameResolver(TableNameResolver tableNameResolver) {
        this.tableNameResolver = tableNameResolver;
    }

    public void setFieldColumnFactory(CobolFieldColumnFactory fieldColumnFactory) {
        this.fieldColumnFactory = fieldColumnFactory;
    }

    public void setPrependForParsers(Map<Class, String> prependForParsers) {
        this.prependForParsers.putAll(prependForParsers);
    }
}
