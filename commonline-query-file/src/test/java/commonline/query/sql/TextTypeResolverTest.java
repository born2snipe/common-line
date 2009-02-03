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

import junit.framework.TestCase;
import commonline.core.layout.TextFieldDefinition;
import commonline.core.layout.DecimalFieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;


public class TextTypeResolverTest extends TestCase {
    public void test_resolve() {
        TextTypeResolver resolver = new TextTypeResolver();
        assertEquals(SqlType.VARCHAR, resolver.resolve(new TextFieldDefinition("","", 1, "")));
        assertNull(resolver.resolve(new DecimalFieldDefinition("","", 1, "9v9")));
        assertNull(resolver.resolve(new IntegerFieldDefinition("","", 1, "9")));
    }
}
