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

import java.io.ByteArrayInputStream;


public class CommonlineHeaderLocatorTest extends TestCase {
    private CommonlineHeaderLocator locator;

    protected void setUp() throws Exception {
        super.setUp();
        locator = new CommonlineHeaderLocator();
    }

    public void test_locate_NoHeader() {
        assertNull(locator.locate(new ByteArrayInputStream("@1\n@2".getBytes())));
    }

    public void test_locate_FoundOnSecondLine() {
        String record = "\n@H";
        assertEquals("@H", locator.locate(new ByteArrayInputStream(record.getBytes())));
    }

    public void test_locate_FoundOnFirstLine() {
        String record = "@H";
        assertEquals(record, locator.locate(new ByteArrayInputStream(record.getBytes())));
    }


}
