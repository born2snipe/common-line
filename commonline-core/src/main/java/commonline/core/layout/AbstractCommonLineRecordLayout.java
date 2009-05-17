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
package commonline.core.layout;

import flapjack.cobol.layout.*;

/**
 * An abstract class simplifying the construction of the CommonLineFieldDefinitions for a CommonLineRecordLayout
 */
public abstract class AbstractCommonLineRecordLayout extends CobolRecordLayout {

    public AbstractCommonLineRecordLayout(String id) {
        super(id);
        setFieldDefFactory(new FieldDefinitionFactory() {
            public CobolFieldDefinition build(CobolFieldInfo fieldInfo) {
                CommonlineFieldInfo info = (CommonlineFieldInfo) fieldInfo;
                if (info.getType() == CobolFieldType.ALPHA_NUMERIC)
                    return new TextFieldDefinition(info.getId(), info.getName(), info.getPosition(), info.getPattern());
                else if (info.getType() == CobolFieldType.INTEGER)
                    return new IntegerFieldDefinition(info.getId(), info.getName(), info.getPosition(), info.getPattern());
                else if (info.getType() == CobolFieldType.DECIMAL)
                    return new DecimalFieldDefinition(info.getId(), info.getName(), info.getPosition(), info.getPattern());
                return null;
            }
        });

        recordCodeField();
        defineFields();
    }

    /**
     * Define the fields in the record
     */
    protected abstract void defineFields();

    /**
     * Defines the Record Termintor field
     *
     * @param id - the id representing the Record Terminator
     */
    protected void recordTerminator(String id) {
        // TODO - should be able to calculate this very easily
        field(id, "Record Terminator", "X");
    }

    /**
     * Defines a field
     *
     * @param id      - the id representing the given field
     * @param name    - the name/descrition of the field
     * @param pattern - the COBOL field definition pattern (ex. 9(10))
     */
    protected void field(String id, String name, String pattern) {
        field(new CommonlineFieldInfo(name, pattern, id));
    }

    private void recordCodeField() {
        field("1", "Record Code", "XX");
    }

    private static class CommonlineFieldInfo extends CobolFieldInfo {
        private String id;

        private CommonlineFieldInfo(String name, String pattern, String id) {
            super(name, pattern);
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

}
