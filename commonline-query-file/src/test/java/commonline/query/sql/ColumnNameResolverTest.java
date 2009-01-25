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

import flapjack.layout.SimpleFieldDefinition;
import junit.framework.TestCase;

import java.util.Arrays;


public class ColumnNameResolverTest extends TestCase {
    private ColumnNameResolver resolver;

    public void test_resolve() {
        assertEquals("name", resolver.resolve(new SimpleFieldDefinition("name", 0, 0)));
        assertEquals("name", resolver.resolve(new SimpleFieldDefinition(" name ", 0, 0)));
        assertEquals("first_name", resolver.resolve(new SimpleFieldDefinition("first name", 0, 0)));
        assertEquals("name", resolver.resolve(new SimpleFieldDefinition("name (XXX)", 0, 0)));
        assertEquals("name", resolver.resolve(new SimpleFieldDefinition("name ZZZ", 0, 0)));
    }

    protected void setUp() throws Exception {
        super.setUp();
        resolver = new ColumnNameResolver();
        resolver.setRemoves(Arrays.asList("(XXX)", "ZZZ"));
    }
}
