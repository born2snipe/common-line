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
package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;


public class UniqueSupplementDetailRecordFactoryTest extends TestCase {

    public void test() {
        UniqueSupplementDetailRecordFactory factory = new UniqueSupplementDetailRecordFactory();

        List fields = Arrays.asList(new byte[][]{
                "@2".getBytes(),
                "vendorCode".getBytes(),
                "idCode".getBytes(),
                "filler".getBytes(),
                "*".getBytes(),
                "\r\n".getBytes()
        });

        Object obj = factory.build(fields, null);

        assertNotNull(obj);
        assertTrue(obj instanceof UniqueSupplementDetail);

        UniqueSupplementDetail detail = (UniqueSupplementDetail) obj;
        
        assertEquals("vendorCode", detail.getUniqueSupplementVendorCode());
        assertEquals("idCode", detail.getUniqueSupplementalLayoutIdentifierCode());
    }
}
