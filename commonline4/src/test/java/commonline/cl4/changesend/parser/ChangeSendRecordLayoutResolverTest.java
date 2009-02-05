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
package commonline.cl4.changesend.parser;

import commonline.cl4.changesend.layout.BorrowerDetailRecordLayout;
import commonline.cl4.changesend.layout.HeaderRecordLayout;
import flapjack.layout.RecordLayout;
import junit.framework.TestCase;

import java.util.Arrays;

public class ChangeSendRecordLayoutResolverTest extends TestCase {
    private ChangeSendRecordLayoutResolver resolver;

    public void setUp() {
        resolver = new ChangeSendRecordLayoutResolver();
        resolver.setRecordLayouts(Arrays.asList(new Object[]{new HeaderRecordLayout(), new BorrowerDetailRecordLayout()}));
    }

    public void test_resolve_MatchFound_2ByteCode() {
        RecordLayout recordLayout = resolver.resolve("@H  XXXX".getBytes());

        assertNotNull(recordLayout);
        assertTrue(recordLayout instanceof HeaderRecordLayout);
    }

    public void test_resolve_MatchFound_4ByteCode() {
        RecordLayout recordLayout = resolver.resolve("@102XXXX".getBytes());

        assertNotNull(recordLayout);
        assertTrue(recordLayout instanceof BorrowerDetailRecordLayout);
    }

    public void test_resolve_NotDataGiven() {
        assertNull(resolver.resolve(new byte[0]));
    }

    public void test_resolve_OneByteGiven() {
        assertNull(resolver.resolve(new byte[1]));
    }

}
