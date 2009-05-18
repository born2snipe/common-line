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
package commonline.cl5.changesend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class TrailerRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new TrailerRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 18;
    }

    protected String recordCode() {
        return "@T";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "@1 Detail Record Count", 3, 6);
        assertInteger("3", "Unique Supplemental (@2) Detail Record Count", 9, 6);
        assertInteger("4", "File Creation Date (CCYYMMDD)", 15, 8);
        assertInteger("5", "File Creation Time (HHMMSS) O", 23, 6);
        assertText("6", "File Identifier Code", 29, 5);
        assertText("7", "Source Name", 34, 32);
        assertText("8", "Source ID", 66, 8);
        assertText("9", "Filler", 74, 2);
        assertText("10", "Source Non-ED Branch ID", 76, 4);
        assertText("11", "Recipient Name", 80, 32);
        assertText("12", "Recipient ID", 112, 8);
        assertText("13", "Filler", 120, 2);
        assertText("14", "Recipient Non-ED Branch ID", 122, 4);
        assertText("15", "Filler", 126, 9);
        assertText("16", "Filler", 135, 9);
        assertText("17", "Filler", 144, 336);
        assertText("18", "Record Terminator", 480, 1);
    }
}
