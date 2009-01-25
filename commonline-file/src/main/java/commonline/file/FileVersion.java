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


public class FileVersion {
    private static Map versions = new HashMap();

    public static final FileVersion CL4 = new FileVersion(new String[]{"R004P", "R004T", "C004P", "C004T", "A004P", "A004T"});
    public static final FileVersion CL5 = new FileVersion(new String[]{"R005P", "R005T", "C005P", "C005T", "A005P", "A005T"});

    private String[] identifiers;

    FileVersion(String[] identifiers) {
        this.identifiers = identifiers;
        for (int i = 0; i < identifiers.length; i++) {
            versions.put(identifiers[i], this);
        }
    }


    public static FileVersion evaluate(String identifier) {
        return (FileVersion) versions.get(identifier);
    }
}
