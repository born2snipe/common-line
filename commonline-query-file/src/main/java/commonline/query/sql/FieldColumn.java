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


public class FieldColumn {
    private String fieldName;
    private String columnName;
    private SqlType type;
    private int length;
    private ColumnIdentifier identifier;

    public FieldColumn(ColumnIdentifier identifier, String fieldName, String columnName, SqlType type) throws IllegalArgumentException {
        this(identifier, fieldName, columnName, type, -1);
    }

    public FieldColumn(ColumnIdentifier identifier, String fieldName, String columnName, SqlType type, int length) throws IllegalArgumentException {
        if (type.isLengthRequired() && length <= 0) {
            throw new IllegalArgumentException("A length over 0 must be provided with type " + type);
        }

        this.fieldName = fieldName;
        this.columnName = columnName;
        this.type = type;
        this.length = length;
        this.identifier = identifier;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getColumnName() {
        return columnName;
    }

    public SqlType getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public ColumnIdentifier getIdentifier() {
        return identifier;
    }

    public String toString() {
        return getColumnName() + " " + type.format(getLength());
    }
}
