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

import commonline.core.layout.CommonLineRecordLayout;
import commonline.core.layout.CommonlineFieldDefinition;
import commonline.file.FileVersion;
import commonline.query.model.CommonLineRecord;
import commonline.query.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class CommonlineRecordRepository {
    private Map<String, RecordParserDataSource> dataSources = new HashMap<String, RecordParserDataSource>();
    private ColumnIdentifierFactory columnIdentifierFactory;

    public CommonlineRecordRepository(Map<String, RecordParserDataSource> dataSources) {
        this.dataSources.putAll(dataSources);
    }

    public void save(CommonLineRecord record, FileVersion version) {
        RecordParserDataSource dataSource = dataSources.get(version.toString());
        if (dataSource == null) {
            throw new IllegalArgumentException("Could not find datasource for " + version);
        }
        CommonLineRecordLayout recordLayout = record.getRecordLayout();
        RecordLayoutTableInfo tableInfo = dataSource.findTableInfoFor(recordLayout);
        StringBuilder columns = new StringBuilder();
        StringBuilder values = new StringBuilder();

        List fieldDefinitions = recordLayout.getFieldDefinitions();
        List args = new ArrayList();
        for (int i = 0; i < fieldDefinitions.size(); i++) {
            CommonlineFieldDefinition fieldDef = (CommonlineFieldDefinition) fieldDefinitions.get(i);
            ColumnIdentifier identifier = columnIdentifierFactory.build(fieldDef);
            FieldColumn fieldColumn = tableInfo.getFieldColumn(identifier);
            columns.append(fieldColumn.getColumnName());
            String value = new String(record.getFields().get(fieldDef.getId())).trim();
            values.append("?");
            switch (fieldColumn.getType()) {
                case VARCHAR:
                    args.add(value);
                    break;
                default:
                    args.add(value.length() == 0 ? 0 : new Integer(value));
            }
            if (i < fieldDefinitions.size() - 1) {
                columns.append(", ");
                values.append(", ");
            }
        }

        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO ").append(tableInfo.getTableName()).append("\n\t(");
        insert.append(columns).append(")\nVALUES\n\t(").append(values).append(")");

        createJdbcTemplate(dataSource).update(insert.toString(), args.toArray());
    }

    protected JdbcTemplate createJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    public void setColumnIdentifierFactory(ColumnIdentifierFactory columnIdentifierFactory) {
        this.columnIdentifierFactory = columnIdentifierFactory;
    }
}
