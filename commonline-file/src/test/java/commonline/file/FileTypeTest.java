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
package commonline.file;

import junit.framework.TestCase;


public class FileTypeTest extends TestCase {
    public void test_evaluate() {
        assertEquals(FileType.RESPONSE, FileType.evaluate("COMMON RESPONSE"));
        assertEquals(FileType.CHANGE_SEND, FileType.evaluate("CHANGE TRANS"));
        assertEquals(FileType.APP_SEND, FileType.evaluate("COMMON APPLICATIONS"));
        assertEquals(FileType.DISBURSEMENT_ROSTER, FileType.evaluate("COMMON DISB ROS"));
        assertEquals(FileType.DISBURSEMENT_ACKNOWLEDGEMENT, FileType.evaluate("COMMON DISB ACK"));
        assertNull(FileType.evaluate("wtf"));
    }
}
