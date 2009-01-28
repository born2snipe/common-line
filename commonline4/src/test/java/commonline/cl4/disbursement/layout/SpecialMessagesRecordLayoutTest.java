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
package commonline.cl4.disbursement.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class SpecialMessagesRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new SpecialMessagesRecordLayout();
    }

    protected int recordLength() {
        return 560;
    }

    protected int fieldCount() {
        return 8;
    }

    protected String recordCode() {
        return "@3";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Message 1", 3, 80);
        assertText("3", "Message 2", 83, 80);
        assertText("4", "Message 3", 163, 80);
        assertText("5", "Message 4", 243, 80);
        assertText("6", "Message 5", 323, 80);
        assertText("7", "Filler", 403, 157);
        assertText("8", "Record Terminator", 560, 1);
    }
}
