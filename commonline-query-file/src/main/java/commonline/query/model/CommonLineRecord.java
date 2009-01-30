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
package commonline.query.model;

import commonline.core.layout.CommonLineRecordLayout;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;


public class CommonLineRecord {
    private Map<String, byte[]> fields = new LinkedHashMap<String, byte[]>();
    private CommonLineRecordLayout recordLayout;

    public CommonLineRecord(Map<String, byte[]> fields, CommonLineRecordLayout recordLayout) {
        this.fields = fields;
        this.recordLayout = recordLayout;
    }

    public Map<String, byte[]> getFields() {
        return Collections.unmodifiableMap(fields);
    }

    public CommonLineRecordLayout getRecordLayout() {
        return recordLayout;
    }
}