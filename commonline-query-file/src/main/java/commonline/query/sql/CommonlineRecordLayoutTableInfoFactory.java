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

import flapjack.layout.FieldDefinition;
import flapjack.layout.RecordLayout;
import flapjack.parser.RecordParser;

import java.util.HashMap;
import java.util.Map;


public class CommonlineRecordLayoutTableInfoFactory implements RecordLayoutTableInfoFactory {
    private TableNameResolver tableNameResolver;
    private CobolFieldColumnFactory fieldColumnFactory;
    private Map<Class, String> prependForParsers = new HashMap<Class, String>();

    public RecordLayoutTableInfo build(RecordParser parser, RecordLayout recordLayout) {
        RecordLayoutTableInfo info = new RecordLayoutTableInfo(recordLayout);
        if (prependForParsers.containsKey(parser.getClass())) {
            info.setTableName(prependForParsers.get(parser.getClass()) + "_" + tableNameResolver.resolve(recordLayout));
        } else {
            info.setTableName(tableNameResolver.resolve(recordLayout));
        }
        for (Object o : recordLayout.getFieldDefinitions()) {
            FieldDefinition fieldDef = (FieldDefinition) o;
            info.registerFieldColumn(fieldColumnFactory.build(fieldDef));
        }
        return info;
    }

    public void setTableNameResolver(TableNameResolver tableNameResolver) {
        this.tableNameResolver = tableNameResolver;
    }

    public void setFieldColumnFactory(CobolFieldColumnFactory fieldColumnFactory) {
        this.fieldColumnFactory = fieldColumnFactory;
    }

    public void setPrependForParsers(Map<Class, String> prependForParsers) {
        this.prependForParsers.putAll(prependForParsers);
    }
}
