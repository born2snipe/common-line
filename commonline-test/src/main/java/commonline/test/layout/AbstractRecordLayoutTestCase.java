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
package commonline.test.layout;

import commonline.core.layout.*;
import flapjack.layout.FieldDefinition;
import flapjack.layout.RecordLayout;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class AbstractRecordLayoutTestCase extends TestCase {
    private RecordLayout layout;
    private int i = 0;
    private List fieldDefinitions;

    protected abstract RecordLayout createRecordLayout();

    protected abstract int recordLength();

    protected abstract int fieldCount();

    protected abstract String recordCode();

    public abstract void test_fieldDefinitions();

    protected void setUp() throws Exception {
        super.setUp();
        layout = createRecordLayout();
        fieldDefinitions = layout.getFieldDefinitions();
    }

    public void test_lengthAndFieldCount() {
        assertEquals(recordCode(), ((CommonLineRecordLayout) createRecordLayout()).getCode());
        assertEquals("Not all fields account for", fieldCount(), createRecordLayout().getFieldDefinitions().size());
        assertEquals("Record length is off", recordLength(), createRecordLayout().getLength());
    }

    public void test_noDuplicateIds() {
        List ids = new ArrayList();
        Iterator it = layout.getFieldDefinitions().iterator();
        while (it.hasNext()) {
            CommonlineFieldDefinition fieldDef = (CommonlineFieldDefinition) it.next();
            assertFalse("Found duplicate id, '" + fieldDef.getId() + "'", ids.contains(fieldDef.getId()));
            ids.add(fieldDef.getId());
        }
    }

    protected void assertInteger(String id, String name, int position, int length) {
        FieldDefinition fieldDef = getNextFieldDefinition();
        assertInstanceOf(IntegerFieldDefinition.class, id, fieldDef);
        IntegerFieldDefinition integerFieldDef = (IntegerFieldDefinition) fieldDef;
        assertEquals(id, integerFieldDef.getId());
        assertFieldDefinition(integerFieldDef, name, position, length);
    }

    protected void assertDecimal(String id, String name, int position, int length) {
        FieldDefinition fieldDef = getNextFieldDefinition();
        assertInstanceOf(DecimalFieldDefinition.class, id, fieldDef);
        DecimalFieldDefinition decimalFieldDefinition = (DecimalFieldDefinition) fieldDef;
        assertEquals(id, decimalFieldDefinition.getId());
        assertFieldDefinition(decimalFieldDefinition, name, position, length);
    }

    protected void assertText(String id, String name, int position, int length) {
        FieldDefinition fieldDef = getNextFieldDefinition();
        assertInstanceOf(TextFieldDefinition.class, id, fieldDef);
        TextFieldDefinition textFieldDef = (TextFieldDefinition) fieldDef;
        assertEquals(id, textFieldDef.getId());
        assertFieldDefinition(textFieldDef, name, position, length);
    }

    private void assertInstanceOf(Class expectedClazz, String id, FieldDefinition fieldDef) {
        assertTrue("Not a " + expectedClazz.getName() + " on " + id + ", but was " + fieldDef.getClass().getName(), expectedClazz.isInstance(fieldDef));
    }

    private void assertFieldDefinition(FieldDefinition fieldDef, String name, int position, int length) {
        assertEquals(name, fieldDef.getName());
        assertEquals("Postion off on " + name, position, fieldDef.getPosition() + 1);
        assertEquals("Length off on " + name, length, fieldDef.getLength());
    }

    private FieldDefinition convertToFieldDefinition(Object obj) {
        assertTrue("Not a field definition, was a " + obj.getClass().getName(), obj instanceof FieldDefinition);
        return (FieldDefinition) obj;
    }

    private FieldDefinition getNextFieldDefinition() {
        if (i < fieldDefinitions.size()) {
            return convertToFieldDefinition(fieldDefinitions.get(i++));
        }
        throw new IllegalStateException("There are no more field definitions");
    }
}
