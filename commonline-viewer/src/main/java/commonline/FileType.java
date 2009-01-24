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
package commonline;


public enum FileType {
    RESPONSE("COMMON RESPONSE", "Response"),
    APP_SEND("COMMON APPLICATIONS", "Application Send"),
    CHANGE_SEND("CHANGE TRANS", "Change Send");

    private String identifierName;
    private String description;

    FileType(String identifierName, String description) {
        this.identifierName = identifierName;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static FileType evaluate(String identifier) {
        for (FileType type : values()) {
            if (type.identifierName.equals(identifier)) {
                return type;
            }
        }

        return null;
    }
}
