/**
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package commonline.query.sql;

import commonline.cl4.response.parser.ResponseParser;
import commonline.core.layout.AbstractCommonLineRecordLayout;
import flapjack.layout.FieldDefinition;
import flapjack.layout.RecordLayout;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;


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

    public void test_build_MultipleFieldsWithTheSameName() {
        RecordLayout layout = new AbstractCommonLineRecordLayout("") {
            protected void defineFields() {
                field("1", "Record Code", "x(2)");
            }
        };

        FieldColumn fieldColumn = new FieldColumn(new ColumnIdentifier("1"), "field", "column", SqlType.DOUBLE);
        FieldColumn fieldColumn2 = new FieldColumn(new ColumnIdentifier("2"), "field", "column", SqlType.DOUBLE);

        when(tableNameResolver.resolve(layout)).thenReturn("tableName");
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(0))).thenReturn(fieldColumn);
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(1))).thenReturn(fieldColumn2);

        RecordLayoutTableInfo tableInfo = factory.build(PARSER, layout);

        assertEquals(2, tableInfo.getColumns().size());
        assertEquals(fieldColumn, tableInfo.getColumns().get(0));
        assertEquals(fieldColumn2, tableInfo.getColumns().get(1));
    }

    public void test_build_MultipleFields() {
        RecordLayout layout = new AbstractCommonLineRecordLayout("") {
            protected void defineFields() {
                field("2", "name", "x(9)");
            }
        };

        FieldColumn fieldColumn = new FieldColumn(new ColumnIdentifier("1"), "field1", "column1", SqlType.INT);
        FieldColumn fieldColumn2 = new FieldColumn(new ColumnIdentifier("2"), "field2", "column2", SqlType.DOUBLE);

        when(tableNameResolver.resolve(layout)).thenReturn("tableName");
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(0))).thenReturn(fieldColumn);
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(1))).thenReturn(fieldColumn2);

        RecordLayoutTableInfo tableInfo = factory.build(PARSER, layout);

        assertEquals(2, tableInfo.getColumns().size());
        assertEquals(fieldColumn, tableInfo.getColumns().get(0));
        assertEquals(fieldColumn2, tableInfo.getColumns().get(1));
    }

    public void test_build_SingleField() {
        RecordLayout layout = new AbstractCommonLineRecordLayout("") {
            protected void defineFields() {
            }
        };


        FieldColumn fieldColumn = new FieldColumn(new ColumnIdentifier("2"), "", "", SqlType.INT);

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

        RecordLayout layout = new AbstractCommonLineRecordLayout("") {
            protected void defineFields() {
            }
        };

        when(tableNameResolver.resolve(layout)).thenReturn("tableName");
        when(columnFactory.build((FieldDefinition) layout.getFieldDefinitions().get(0))).thenReturn(new FieldColumn(new ColumnIdentifier("2"), "", "", SqlType.INT));

        RecordLayoutTableInfo tableInfo = factory.build(PARSER, layout);

        assertEquals("RESPONSE_tableName", tableInfo.getTableName());
    }


}
