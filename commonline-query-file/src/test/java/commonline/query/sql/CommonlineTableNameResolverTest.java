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
import commonline.cl4.appsend.layout.HeaderRecordLayout;
import commonline.cl4.appsend.layout.TrailerRecordLayout;


public class CommonlineTableNameResolverTest extends TestCase {
    public void test_resolve() {
        CommonlineTableNameResolver resolver = new CommonlineTableNameResolver();
        
        assertEquals("AtH", resolver.resolve(new HeaderRecordLayout()));
        assertEquals("AtT", resolver.resolve(new TrailerRecordLayout()));
    }
}
