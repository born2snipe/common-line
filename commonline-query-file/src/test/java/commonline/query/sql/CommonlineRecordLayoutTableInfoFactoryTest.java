package commonline.query.sql;

import commonline.core.layout.AbstractCommonLineRecordLayout;
import commonline.cl4.response.parser.ResponseParser;
import flapjack.layout.RecordLayout;
import flapjack.layout.FieldDefinition;
import flapjack.parser.RecordParser;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Map;
import java.util.HashMap;


public class CommonlineRecordLayoutTableInfoFactoryTest extends TestCase {
    private TableNameResolver tableNameResolver;
    private CobolFieldColumnFactory columnFactory;
    private CommonlineRecordLayoutTableInfoFactory factory;
    private static final ResponseParser PARSER = new ResponseParser();

    protected void setUp() throws Exception {
        super.setUp();
        tableNameResolver = mock(TableNameResolver.class);
        columnFactory = mock(CobolFieldColumnFactory.class);
        factory = new CommonlineRecordLayoutTableInfoFactory();
        factory.setTableNameResolver(tableNameResolver);
        factory.setFieldColumnFactory(columnFactory);
    }
    
    public void test_build_MultipleFields() {
        RecordLayout layout = new AbstractCommonLineRecordLayout() {
            protected void defineFields() {
                field("2", "name", "x(9)");
            }

            public String getCode() {
                return null;
            }
        };

        FieldColumn fieldColumn = new FieldColumn("field1", "column1", SqlType.INT);
        FieldColumn fieldColumn2 = new FieldColumn("field2", "column2", SqlType.DOUBLE);

        when(tableNameResolver.resolve(layout)).thenReturn("tableName");
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(0))).thenReturn(fieldColumn);
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(1))).thenReturn(fieldColumn2);

        RecordLayoutTableInfo tableInfo = factory.build(PARSER, layout);

        assertEquals(2, tableInfo.getColumns().size());
        assertEquals(fieldColumn, tableInfo.getColumns().get(0));
        assertEquals(fieldColumn2, tableInfo.getColumns().get(1));
    }

    public void test_build_SingleField() {
        RecordLayout layout = new AbstractCommonLineRecordLayout() {
            protected void defineFields() {
            }

            public String getCode() {
                return null;
            }
        };


        FieldColumn fieldColumn = new FieldColumn("", "", SqlType.INT);

        when(tableNameResolver.resolve(layout)).thenReturn("tableName");
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(0))).thenReturn(fieldColumn);

        RecordLayoutTableInfo tableInfo = factory.build(PARSER, layout);

        assertNotNull(tableInfo);
        assertEquals(layout, tableInfo.getRecordLayout());
        assertEquals("tableName", tableInfo.getTableName());
        assertEquals(1, tableInfo.getColumns().size());
        assertSame(fieldColumn, tableInfo.getColumns().get(0));
    }
    
    public void test_build_PrependStringForSpecificParser() {
        Map<Class, String> x = new HashMap<Class, String>();
        x.put(ResponseParser.class, "RESPONSE");

        factory.setPrependForParsers(x);

        RecordLayout layout = new AbstractCommonLineRecordLayout() {
            protected void defineFields() {
            }

            public String getCode() {
                return null;
            }
        };

        when(tableNameResolver.resolve(layout)).thenReturn("tableName");
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(0))).thenReturn(new FieldColumn("", "", SqlType.INT));

        RecordLayoutTableInfo tableInfo = factory.build(PARSER, layout);

        assertEquals("RESPONSE_tableName", tableInfo.getTableName());
    }


}
