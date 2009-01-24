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


public class SpecialMessagesRecordFactoryTest extends TestCase {

    public void test() {
        SpecialMessagesRecordFactory factory = new SpecialMessagesRecordFactory();

        List fields = Arrays.asList(new byte[][]{
                "@3".getBytes(), "message1".getBytes(), "message2".getBytes(), "message3".getBytes(), "message4".getBytes(), "message5".getBytes(), "filler".getBytes(), "*".getBytes(), "\r\n".getBytes()
        });

        Object obj = factory.build(fields, null);
        assertNotNull(obj);
        assertTrue(obj instanceof SpecialMessages);

        SpecialMessages messages = (SpecialMessages) obj;
        assertEquals("message1", messages.getMessage1());
        assertEquals("message2", messages.getMessage2());
        assertEquals("message3", messages.getMessage3());
        assertEquals("message4", messages.getMessage4());
        assertEquals("message5", messages.getMessage5());
    }
}
