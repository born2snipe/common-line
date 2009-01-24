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

import java.util.Arrays;


public enum FileVersion {
    CL4("R004P", "R004T", "C004P", "C004T", "A004P", "A004T"),
    CL5("R005P", "R005T", "C005P", "C005T", "A005P", "A005T");

    private String[] identifiers;

    FileVersion(String... identifiers) {
        this.identifiers = identifiers;
    }


    public static FileVersion evaluate(String identifier) {
        for (FileVersion version : values()) {
            if (Arrays.asList(version.identifiers).contains(identifier)) {
                return version;
            }
        }
        return null;
    }
}
