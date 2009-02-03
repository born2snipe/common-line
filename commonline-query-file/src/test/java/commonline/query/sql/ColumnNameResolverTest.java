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

import commonline.core.layout.TextFieldDefinition;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ColumnNameResolverTest extends TestCase {
    private ColumnNameResolver resolver;

    public void test_resolve() {
        assertEquals("name", resolver.resolve(new TextFieldDefinition("1", "name", 0, "x(1)")));
        assertEquals("name", resolver.resolve(new TextFieldDefinition("1", " name ", 0, "x(1)")));
        assertEquals("first_name", resolver.resolve(new TextFieldDefinition("1", "first name", 0, "x(1)")));
        assertEquals("name", resolver.resolve(new TextFieldDefinition("1", "name (XXX)", 0, "x(1)")));
        assertEquals("name", resolver.resolve(new TextFieldDefinition("1", "name ZZZ", 0, "x(1)")));
        assertEquals("filler_1", resolver.resolve(new TextFieldDefinition("1", "filler", 0, "x(1)")));
        assertEquals("FILLER_1", resolver.resolve(new TextFieldDefinition("1", "FILLER", 0, "x(1)")));
        assertEquals("At1_Count", resolver.resolve(new TextFieldDefinition("1", "@1 Count", 0, "x(1)")));
        assertEquals("disbursement_number_1", resolver.resolve(new TextFieldDefinition("1", "disbursement number", 0, "x(1)")));
    }

    protected void setUp() throws Exception {
        super.setUp();
        resolver = new ColumnNameResolver();
        resolver.setRemoves(Arrays.asList("(XXX)", "ZZZ"));
        Map<String, String> replacements = new HashMap<String, String>();
        replacements.put("@", "At");
        resolver.setReplacements(replacements);
        resolver.setTagOnId(Arrays.asList("filler", "disbursement number"));
    }
}
