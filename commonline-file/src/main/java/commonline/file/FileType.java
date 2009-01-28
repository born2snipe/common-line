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
package commonline.file;

import java.util.HashMap;
import java.util.Map;


public class FileType {
    private static Map types = new HashMap();

    public static final FileType RESPONSE = new FileType("COMMON RESPONSE", "Response");
    public static final FileType APP_SEND = new FileType("COMMON APPLICATIONS", "Application Send");
    public static final FileType CHANGE_SEND = new FileType("CHANGE TRANS", "Change Send");
    public static final FileType DISBURSEMENT_ROSTER = new FileType("COMMON DISB ROS", "Disbursement Roster");
    public static final FileType DISBURSEMENT_ACKNOWLEDGEMENT = new FileType("COMMON DISB ACK", "Disbursement Acknowledgement");

    private String identifierName;
    private String description;


    FileType(String identifierName, String description) {
        this.identifierName = identifierName;
        this.description = description;
        types.put(identifierName, this);
    }

    public String getDescription() {
        return description;
    }

    public static FileType evaluate(String identifier) {
        return (FileType) types.get(identifier);
    }

    public String toString() {
        return getDescription();
    }
}
