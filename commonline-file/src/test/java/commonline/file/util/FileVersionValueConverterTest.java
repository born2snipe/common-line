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
package commonline.file.util;

import commonline.file.FileVersion;
import junit.framework.TestCase;


public class FileVersionValueConverterTest extends TestCase {
    public void test_toDomain() {
        FileVersionValueConverter converter = new FileVersionValueConverter();

        assertEquals(FileVersion.CL4, converter.toDomain("R004P".getBytes()));
        assertEquals(FileVersion.CL5, converter.toDomain("R005P".getBytes()));
        assertNull(converter.toDomain(new byte[0]));
    }
}
