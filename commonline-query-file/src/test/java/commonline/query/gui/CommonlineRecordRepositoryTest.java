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
package commonline.query.gui;

import commonline.core.layout.AbstractCommonLineRecordLayout;
import commonline.core.layout.CommonlineFieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;
import commonline.file.FileVersion;
import commonline.query.model.CommonLineRecord;
import commonline.query.sql.*;
import flapjack.layout.FieldDefinition;
import flapjack.layout.RecordLayout;
import junit.framework.TestCase;
import static org.mockito.Mockito.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


public class CommonlineRecordRepositoryTest extends TestCase {
    private JdbcTemplate template;
    private RecordParserDataSource dataSource;
    private ColumnIdentifierFactory columnIdentifierFactory;
    private ShuntRepository repository;

    protected void setUp() throws Exception {
        super.setUp();
        template = mock(JdbcTemplate.class);
        dataSource = mock(RecordParserDataSource.class);
        columnIdentifierFactory = mock(ColumnIdentifierFactory.class);

        Map<String, RecordParserDataSource> dataSources = new HashMap<String, RecordParserDataSource>();
        dataSources.put("CL4", dataSource);

        repository = new ShuntRepository(dataSources);
        repository.template = template;
        repository.setColumnIdentifierFactory(columnIdentifierFactory);
    }

    public void test_save_couldNotFindDataSource() {
        try {
            repository.save(null, FileVersion.CL5);
            fail();
        } catch (IllegalArgumentException err) {
            assertEquals("Could not find datasource for CL5", err.getMessage());
        }

    }

    public void test_save_SingleFieldDefinition() {
        RecordLayout recordLayout = new AbstractCommonLineRecordLayout("") {
            protected void defineFields() {
            }
        };

        Map<String, byte[]> fields = createFieldMap(recordLayout);

        CommonLineRecord record = new CommonLineRecord(fields, recordLayout);

        ColumnIdentifier columnIdentifier = new ColumnIdentifier("id");

        RecordLayoutTableInfo layoutTableInfo = new RecordLayoutTableInfo(recordLayout);
        layoutTableInfo.setTableName("header");
        layoutTableInfo.registerFieldColumn(new FieldColumn(columnIdentifier, "Record Code", "Record_Code", SqlType.VARCHAR, 2));

        when(dataSource.findTableInfoFor(recordLayout)).thenReturn(layoutTableInfo);
        when(columnIdentifierFactory.build((FieldDefinition) recordLayout.getFieldDefinitions().get(0))).thenReturn(columnIdentifier);

        repository.save(record, FileVersion.CL4);

        String sql = "INSERT INTO header\n" +
                "\t(Record_Code)\n" +
                "VALUES\n" +
                "\t(?)";
        verify(template).update(sql, new Object[]{"XX"});
    }

    public void test_save_MultipleFieldDefinitions() {
        RecordLayout recordLayout = new AbstractCommonLineRecordLayout("") {
            protected void defineFields() {
                field("2", "field2", "9(2)");
            }
        };

        Map<String, byte[]> fields = createFieldMap(recordLayout);

        CommonLineRecord record = new CommonLineRecord(fields, recordLayout);

        ColumnIdentifier columnIdentifier = new ColumnIdentifier("id");
        ColumnIdentifier columnIdentifier2 = new ColumnIdentifier("id2");

        RecordLayoutTableInfo layoutTableInfo = new RecordLayoutTableInfo(recordLayout);
        layoutTableInfo.setTableName("header");
        layoutTableInfo.registerFieldColumn(new FieldColumn(columnIdentifier, "Record Code", "Record_Code", SqlType.VARCHAR, 2));
        layoutTableInfo.registerFieldColumn(new FieldColumn(columnIdentifier2, "Id", "Id", SqlType.INT));

        when(dataSource.findTableInfoFor(recordLayout)).thenReturn(layoutTableInfo);
        when(columnIdentifierFactory.build((FieldDefinition) recordLayout.getFieldDefinitions().get(0))).thenReturn(columnIdentifier);
        when(columnIdentifierFactory.build((FieldDefinition) recordLayout.getFieldDefinitions().get(1))).thenReturn(columnIdentifier2);

        repository.save(record, FileVersion.CL4);

        String sql = "INSERT INTO header\n" +
                "\t(Record_Code, Id)\n" +
                "VALUES\n" +
                "\t(?, ?)";
        verify(template).update(sql, new Object[]{"XX", new Integer(99)});
    }

    private Map<String, byte[]> createFieldMap(RecordLayout recordLayout) {
        Map<String, byte[]> map = new HashMap<String, byte[]>();
        for (Object o : recordLayout.getFieldDefinitions()) {
            CommonlineFieldDefinition fieldDef = (CommonlineFieldDefinition) o;
            String character = "X";
            if (fieldDef instanceof IntegerFieldDefinition) {
                character = "9";
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < fieldDef.getLength(); i++) {
                builder.append(character);
            }
            map.put(fieldDef.getId(), builder.toString().getBytes());
        }
        return map;
    }

    private static class ShuntRepository extends CommonlineRecordRepository {
        private JdbcTemplate template;

        public ShuntRepository(Map<String, RecordParserDataSource> dataSource) {
            super(dataSource);
        }


        protected JdbcTemplate createJdbcTemplate(DataSource dataSource) {
            return template;
        }
    }
}
