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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class ColumnNameResolver {
    private List<String> removes = new ArrayList<String>();
    private Map<String, String> replacements = new HashMap<String, String>();

    public String resolve(CommonlineFieldDefinition fieldDefinition) {
        String newName = fieldDefinition.getName().trim();
        for (String key : replacements.keySet()) {
            newName = newName.replaceAll(key, replacements.get(key));
        }
        for (String value : removes) {
            newName = newName.replace(value, "").trim();
            if ("filler".equalsIgnoreCase(newName)) {
                newName += "_" + fieldDefinition.getId();
            }
        }
        return newName.replace(" ", "_");
    }

    public void setRemoves(List<String> removes) {
        this.removes.addAll(removes);
    }

    public void setReplacements(Map<String, String> replacements) {
        this.replacements.putAll(replacements);
    }
}
