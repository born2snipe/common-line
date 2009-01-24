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
package commonline.core.util;

import junit.framework.TestCase;


public class Base36ConverterTest extends TestCase {
    private Base36Converter converter;

    public void test_convertTo() {
        // March 15, 1998
        assertEquals("SBF", converter.convertTo(36699));
    }

    public void test_convertFrom_Uppercase() {
        // March 15, 1998
        assertEquals(36699, converter.convertFrom("SBF"));
    }

    public void test_convertFrom_Lowercase() {
        // March 15, 1998
        assertEquals(36699, converter.convertFrom("sbf"));
    }

    public void test_convertFrom_Mixcase() {
        // March 15, 1998
        assertEquals(36699, converter.convertFrom("sBf"));
    }

    protected void setUp() throws Exception {
        super.setUp();
        converter = new Base36Converter();
    }

}
