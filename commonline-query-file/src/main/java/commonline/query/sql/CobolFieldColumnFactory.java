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
import flapjack.cobol.layout.DecimalFieldDefinition;
import flapjack.cobol.layout.IntegerFieldDefinition;
import flapjack.layout.FieldDefinition;


public class CobolFieldColumnFactory {
    private ColumnNameResolver columnNameResolver;
    private ColumnIdentifierFactory columnIdentifierFactory;

    public CobolFieldColumnFactory() {
        this(new ColumnNameResolver(), new CommonlineColumnIdentifierFactory());
    }

    public CobolFieldColumnFactory(ColumnNameResolver columnNameResolver, ColumnIdentifierFactory columnIdentifierFactory) {
        this.columnNameResolver = columnNameResolver;
        this.columnIdentifierFactory = columnIdentifierFactory;
    }

    public FieldColumn build(FieldDefinition fieldDefinition) {
        CommonlineFieldDefinition cobolFd = (CommonlineFieldDefinition) fieldDefinition;
        SqlType type = SqlType.VARCHAR;
        if (cobolFd instanceof IntegerFieldDefinition) {
            type = SqlType.INT;
        } else if (cobolFd instanceof DecimalFieldDefinition) {
            type = SqlType.DOUBLE;
        }
        return new FieldColumn(columnIdentifierFactory.build(fieldDefinition), cobolFd.getName(), columnNameResolver.resolve(cobolFd), type, cobolFd.getLength());
    }
}
