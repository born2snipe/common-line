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


public class FieldColumnTest extends TestCase {
    public void test_constructor_zeroLength() {
        try {
            new FieldColumn("field", "column", SqlType.VARCHAR, 0);
            fail();
        } catch (IllegalArgumentException er) {
            assertEquals("A length over 0 must be provided with type VARCHAR", er.getMessage());
        }
    }
    
    public void test_constructor_negativeLength() {
        try {
            new FieldColumn("field", "column", SqlType.VARCHAR, -1);
            fail();
        } catch (IllegalArgumentException er) {
            assertEquals("A length over 0 must be provided with type VARCHAR", er.getMessage());
        }
    }
    
    public void test_constructor_validLength() {
        new FieldColumn("field", "column", SqlType.VARCHAR, 1);
    }
}
