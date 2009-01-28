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

import junit.framework.TestCase;


public class FileVersionTest extends TestCase {

    public void test_evaluate() {
        assertEquals(FileVersion.CL5, FileVersion.evaluate("R005P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("R005T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("R004P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("R004T"));

        assertEquals(FileVersion.CL5, FileVersion.evaluate("C005P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("C005T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("C004P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("C004T"));

        assertEquals(FileVersion.CL5, FileVersion.evaluate("A005P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("A005T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("A004P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("A004T"));

        assertEquals(FileVersion.CL5, FileVersion.evaluate("E005P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("E005T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("E004P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("E004T"));
        
        assertEquals(FileVersion.CL5, FileVersion.evaluate("EA05P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("EA05T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("EA04P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("EA04T"));
        
        assertNull(FileVersion.evaluate("WTF"));
    }
}
