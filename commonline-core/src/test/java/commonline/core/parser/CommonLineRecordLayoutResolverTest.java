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
package commonline.core.parser;

import flapjack.layout.RecordLayout;
import flapjack.layout.SimpleRecordLayout;
import junit.framework.TestCase;

import java.util.Arrays;


public class CommonLineRecordLayoutResolverTest extends TestCase {
    private CommonLineRecordLayoutResolver resolver;

    protected void setUp() throws Exception {
        super.setUp();
        resolver = new CommonLineRecordLayoutResolver();
        resolver.setRecordLayouts(Arrays.asList(new RecordLayout[]{new SimpleRecordLayout("@1")}));
    }

    public void test_resolve_RecordLayoutFound() {
        RecordLayout layout = resolver.resolve("@1HelloThere".getBytes());

        assertNotNull(layout);
        assertTrue(layout instanceof SimpleRecordLayout);
        assertEquals("@1", layout.getId());
    }

    public void test_resolve_RecordLayoutNotFound() {
        RecordLayout layout = resolver.resolve("@2HelloThere".getBytes());

        assertNull(layout);
    }

    public void test_resolve_NoData() {
        assertNull(resolver.resolve(new byte[0]));
    }

    public void test_resolve_OneByte() {
        assertNull(resolver.resolve("@".getBytes()));
    }

}
