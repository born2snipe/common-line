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

import flapjack.cobol.layout.AlphaNumericFieldDefinition;
import flapjack.cobol.layout.IntegerFieldDefinition;
import flapjack.cobol.layout.DecimalFieldDefinition;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CobolFieldColumnFactoryTest extends TestCase {
    private CobolFieldColumnFactory factory;
    private ColumnNameResolver columnNameResolver;

    protected void setUp() throws Exception {
        super.setUp();

        columnNameResolver = mock(ColumnNameResolver.class);

        factory = new CobolFieldColumnFactory(columnNameResolver);
    }

    public void test_build_decimalField() {
        DecimalFieldDefinition fieldDef = new DecimalFieldDefinition("name", 0, "9(2)v99");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");

        FieldColumn fieldColumn = factory.build(fieldDef);

        assertNotNull(fieldColumn);
        assertEquals("column", fieldColumn.getColumnName());
        assertEquals("name", fieldColumn.getFieldName());
        assertEquals(4, fieldColumn.getLength());
        assertEquals(SqlType.DOUBLE, fieldColumn.getType());
    }

    public void test_build_integerField() {
        IntegerFieldDefinition fieldDef = new IntegerFieldDefinition("name", 0, "9(2)");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");

        FieldColumn fieldColumn = factory.build(fieldDef);

        assertNotNull(fieldColumn);
        assertEquals("column", fieldColumn.getColumnName());
        assertEquals("name", fieldColumn.getFieldName());
        assertEquals(2, fieldColumn.getLength());
        assertEquals(SqlType.INT, fieldColumn.getType());
    }

    public void test_build_textField() {
        AlphaNumericFieldDefinition fieldDef = new AlphaNumericFieldDefinition("name", 0, "X(2)");

        when(columnNameResolver.resolve(fieldDef)).thenReturn("column");

        FieldColumn fieldColumn = factory.build(fieldDef);

        assertNotNull(fieldColumn);
        assertEquals("column", fieldColumn.getColumnName());
        assertEquals("name", fieldColumn.getFieldName());
        assertEquals(2, fieldColumn.getLength());
        assertEquals(SqlType.VARCHAR, fieldColumn.getType());
    }


}
