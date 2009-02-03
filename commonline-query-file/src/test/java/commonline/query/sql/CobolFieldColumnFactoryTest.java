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

import commonline.core.layout.TextFieldDefinition;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;


public class CobolFieldColumnFactoryTest extends TestCase {
    private CobolFieldColumnFactory factory;
    private ColumnNameResolver columnNameResolver;
    private ColumnIdentifierFactory columnIdentifierFactory;
    private static final ColumnIdentifier IDENTIFIER = new ColumnIdentifier("1");
    private SqlTypeResolver sqlTypeResolver;

    protected void setUp() throws Exception {
        super.setUp();

        columnIdentifierFactory = mock(ColumnIdentifierFactory.class);
        columnNameResolver = mock(ColumnNameResolver.class);
        sqlTypeResolver = mock(SqlTypeResolver.class);

        factory = new CobolFieldColumnFactory(columnNameResolver, columnIdentifierFactory);
        factory.setSqlTypeResolvers(Arrays.asList(sqlTypeResolver));
    }

    public void test_build_TypeWasResolved() {
        TextFieldDefinition fieldDef = new TextFieldDefinition("", "name", 0, "X(2)");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");
        when(columnIdentifierFactory.build(fieldDef)).thenReturn(IDENTIFIER);
        when(sqlTypeResolver.resolve(fieldDef)).thenReturn(SqlType.DOUBLE);

        FieldColumn fieldColumn = factory.build(fieldDef);

        assertNotNull(fieldColumn);
        assertEquals("column", fieldColumn.getColumnName());
        assertEquals("name", fieldColumn.getFieldName());
        assertEquals(2, fieldColumn.getLength());
        assertEquals(SqlType.DOUBLE, fieldColumn.getType());
        assertSame(IDENTIFIER, fieldColumn.getIdentifier());
    }
    
    public void test_build_TypeWasNotResolved() {
        TextFieldDefinition fieldDef = new TextFieldDefinition("", "name", 0, "X(2)");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");
        when(columnIdentifierFactory.build(fieldDef)).thenReturn(IDENTIFIER);
        when(sqlTypeResolver.resolve(fieldDef)).thenReturn(null);

        try {
            factory.build(fieldDef);
            fail();
        } catch (IllegalArgumentException err) {
            assertEquals("Could not resolve what sql data type should be used for field='name'", err.getMessage());
        }
    }


}
