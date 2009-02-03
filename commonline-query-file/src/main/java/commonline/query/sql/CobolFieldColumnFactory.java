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

import commonline.core.layout.CommonlineFieldDefinition;
import flapjack.layout.FieldDefinition;

import java.util.ArrayList;
import java.util.List;


public class CobolFieldColumnFactory {
    private ColumnNameResolver columnNameResolver;
    private ColumnIdentifierFactory columnIdentifierFactory;
    private List<SqlTypeResolver> sqlTypeResolvers = new ArrayList<SqlTypeResolver>();

    public CobolFieldColumnFactory() {
        this(new ColumnNameResolver(), new CommonlineColumnIdentifierFactory());
    }

    public CobolFieldColumnFactory(ColumnNameResolver columnNameResolver, ColumnIdentifierFactory columnIdentifierFactory) {
        this.columnNameResolver = columnNameResolver;
        this.columnIdentifierFactory = columnIdentifierFactory;
    }

    public FieldColumn build(FieldDefinition fieldDefinition) {
        CommonlineFieldDefinition cobolFd = (CommonlineFieldDefinition) fieldDefinition;
        SqlType type = null;
        for (SqlTypeResolver sqlTypeResolver : sqlTypeResolvers) {
            type = sqlTypeResolver.resolve(fieldDefinition);
            if (type != null) break;
        }
        if (type == null) {
            throw new IllegalArgumentException("Could not resolve what sql data type should be used for field='"+fieldDefinition.getName()+"'");            
        }
        return new FieldColumn(columnIdentifierFactory.build(fieldDefinition), cobolFd.getName(), columnNameResolver.resolve(cobolFd), type, cobolFd.getLength());
    }

    public void setSqlTypeResolvers(List<SqlTypeResolver> sqlTypeResolvers) {
        this.sqlTypeResolvers.addAll(sqlTypeResolvers);
    }
}
