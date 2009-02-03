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

import commonline.core.layout.IntegerFieldDefinition;
import junit.framework.TestCase;


public class DateTypeResolverTest extends TestCase {
    public void test_resolver() {
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (CCYYMMDDHHMMSSNNNNNN)", 0, "x(1)")));
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (CCYYMMDD)", 0, "x(1)")));
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (HHMMSS)", 0, "x(1)")));
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (CCYYMM)", 0, "x(1)")));
        assertNull(new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name", 0, "x(1)")));
    }
}
