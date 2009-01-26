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

import java.util.List;

public class RecordLayoutSqlTableFactory {
    public String build(RecordLayoutTableInfo tableInfo) throws IllegalArgumentException {
        List<FieldColumn> columns = tableInfo.getColumns();
        if (columns.size() == 0) {
            throw new IllegalArgumentException("No fields defined for table=" + tableInfo.getTableName() + ", recordLayout=" + tableInfo.getRecordLayout().getClass().getName());
        }

        StringBuilder builder = new StringBuilder();
        builder.append("CREATE TABLE ").append(tableInfo.getTableName()).append(" (\n");
        for (int i = 0; i < columns.size(); i++) {
            FieldColumn fieldColumn = columns.get(i);
            builder.append("\t").append(fieldColumn.getColumnName()).append(" ").append(fieldColumn.getType().format(fieldColumn.getLength()));
            if (i < columns.size() - 1) {
                builder.append(",");
            }
            builder.append("\n");
        }
        builder.append(")");
        return builder.toString();
    }
}
