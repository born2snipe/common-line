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

import commonline.core.layout.AbstractCommonLineRecordLayout;
import junit.framework.TestCase;

import java.util.Arrays;

import flapjack.layout.RecordLayout;


public class CommonLineRecordLayoutResolverTest extends TestCase {
    private CommonLineRecordLayoutResolver resolver;

    protected void setUp() throws Exception {
        super.setUp();
        resolver = new CommonLineRecordLayoutResolver();
        resolver.setRecordLayouts(Arrays.asList(new RecordLayout[]{new StubRecordLayout("@1")}));
    }

    public void test_resolve_RecordLayoutFound() {
        RecordLayout layout = resolver.resolve("@1HelloThere".getBytes());

        assertNotNull(layout);
        assertTrue(layout instanceof StubRecordLayout);

        StubRecordLayout stub = (StubRecordLayout) layout;
        assertEquals("@1", stub.getCode());
    }

    public void test_resolve_RecordLayoutNotFound() {
        RecordLayout layout = resolver.resolve("@2HelloThere".getBytes());

        assertNull(layout);
    }

    private static class StubRecordLayout extends AbstractCommonLineRecordLayout {
        private String code;

        private StubRecordLayout(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        protected void defineFields() {

        }
    }
}
