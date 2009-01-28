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

import commonline.core.layout.DecimalFieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;
import commonline.core.layout.TextFieldDefinition;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CobolFieldColumnFactoryTest extends TestCase {
    private CobolFieldColumnFactory factory;
    private ColumnNameResolver columnNameResolver;
    private ColumnIdentifierFactory columnIdentifierFactory;
    private static final ColumnIdentifier IDENTIFIER = new ColumnIdentifier("1");

    protected void setUp() throws Exception {
        super.setUp();

        columnIdentifierFactory = mock(ColumnIdentifierFactory.class);
        columnNameResolver = mock(ColumnNameResolver.class);

        factory = new CobolFieldColumnFactory(columnNameResolver, columnIdentifierFactory);
    }

    public void test_build_decimalField() {
        DecimalFieldDefinition fieldDef = new DecimalFieldDefinition("", "name", 0, "9(2)v99");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");
        when(columnIdentifierFactory.build(fieldDef)).thenReturn(IDENTIFIER);

        FieldColumn fieldColumn = factory.build(fieldDef);

        assertNotNull(fieldColumn);
        assertEquals("column", fieldColumn.getColumnName());
        assertEquals("name", fieldColumn.getFieldName());
        assertEquals(4, fieldColumn.getLength());
        assertEquals(SqlType.DOUBLE, fieldColumn.getType());
        assertSame(IDENTIFIER, fieldColumn.getIdentifier());
    }

    public void test_build_integerField() {
        IntegerFieldDefinition fieldDef = new IntegerFieldDefinition("", "name", 0, "9(2)");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");
        when(columnIdentifierFactory.build(fieldDef)).thenReturn(IDENTIFIER);

        FieldColumn fieldColumn = factory.build(fieldDef);

        assertNotNull(fieldColumn);
        assertEquals("column", fieldColumn.getColumnName());
        assertEquals("name", fieldColumn.getFieldName());
        assertEquals(2, fieldColumn.getLength());
        assertEquals(SqlType.INT, fieldColumn.getType());
        assertSame(IDENTIFIER, fieldColumn.getIdentifier());
    }

    public void test_build_textField() {
        TextFieldDefinition fieldDef = new TextFieldDefinition("", "name", 0, "X(2)");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");
        when(columnIdentifierFactory.build(fieldDef)).thenReturn(IDENTIFIER);

        FieldColumn fieldColumn = factory.build(fieldDef);

        assertNotNull(fieldColumn);
        assertEquals("column", fieldColumn.getColumnName());
        assertEquals("name", fieldColumn.getFieldName());
        assertEquals(2, fieldColumn.getLength());
        assertEquals(SqlType.VARCHAR, fieldColumn.getType());
        assertSame(IDENTIFIER, fieldColumn.getIdentifier());
    }


}
