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

import flapjack.layout.RecordLayout;

import java.util.*;


public class RecordLayoutTableInfo {
    private final RecordLayout recordLayout;
    private String tableName;
    private Map<ColumnIdentifier, FieldColumn> columns = new LinkedHashMap<ColumnIdentifier, FieldColumn>();

    public RecordLayoutTableInfo(RecordLayout recordLayout) {
        this.recordLayout = recordLayout;
    }

    public String getColumnForField(ColumnIdentifier columnIdentifier) {
        return columns.get(columnIdentifier).getColumnName();
    }

    public String getFieldForColumn(ColumnIdentifier columnIdentifier) {
        return columns.get(columnIdentifier).getFieldName();
    }

    public List<FieldColumn> getColumns() {
        List<FieldColumn> columns = new ArrayList<FieldColumn>();
        columns.addAll(this.columns.values());
        return Collections.unmodifiableList(columns);
    }

    public void registerFieldColumn(FieldColumn fieldColumn) {
        columns.put(fieldColumn.getIdentifier(), fieldColumn);
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public RecordLayout getRecordLayout() {
        return recordLayout;
    }
}
