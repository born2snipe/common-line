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

import flapjack.layout.SimpleRecordLayout;
import junit.framework.TestCase;


public class RecordLayoutSqlTableFactoryTest extends TestCase {
    private SimpleRecordLayout layout;
    private RecordLayoutSqlTableFactory factory;
    private RecordLayoutTableInfo tableInfo;

    protected void setUp() throws Exception {
        super.setUp();
        layout = new SimpleRecordLayout();
        factory = new RecordLayoutSqlTableFactory();
        tableInfo = new RecordLayoutTableInfo(layout);
        tableInfo.setTableName("DUMMY");
    }

    public void test_build_NoColumns() {
        try {
            factory.build(tableInfo);
            fail();
        } catch (IllegalArgumentException err) {
            assertEquals("No fields defined for table=DUMMY, recordLayout=" + SimpleRecordLayout.class.getName(), err.getMessage());
        }
    }

    public void test_build_MultipleColumns() {
        tableInfo.registerFieldColumn(new FieldColumn("field1", "column1", SqlType.INT));
        tableInfo.registerFieldColumn(new FieldColumn("field2", "column2", SqlType.VARCHAR, 10));

        String sql = "CREATE TABLE DUMMY (\n" +
                "\tcolumn1 int,\n" +
                "\tcolumn2 varchar(10)\n" +
                ")";
        assertEquals(sql, factory.build(tableInfo));
    }

    public void test_build_SingleColumn() {
        tableInfo.registerFieldColumn(new FieldColumn("field", "column", SqlType.VARCHAR, 10));

        String sql = "CREATE TABLE DUMMY (\n" +
                "\tcolumn varchar(10)\n" +
                ")";

        assertEquals(sql, factory.build(tableInfo));
    }

}
