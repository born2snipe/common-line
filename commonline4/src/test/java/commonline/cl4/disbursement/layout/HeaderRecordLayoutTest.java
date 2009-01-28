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


public class HeaderRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new HeaderRecordLayout();
    }

    protected int recordLength() {
        return 560;
    }

    protected int fieldCount() {
        return 22;
    }

    protected String recordCode() {
        return "@H";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Batch ID", 3, 12);
        assertInteger("3", "File Creation Date(CCYYMMDD)", 15, 8);
        assertInteger("4", "File Creation Time(HHMMSS)", 23, 6);
        assertInteger("5", "File Transmission Date (CCYYMMDD)", 29, 8);
        assertInteger("6", "File Transmission Time (HHMMSS)", 37, 6);
        assertText("7", "File Identifier Name", 43, 19);
        assertText("8", "File Identifier Code", 62, 5);
        assertText("9", "Source Name", 67, 32);
        assertText("10", "Source ID", 99, 8);
        assertText("11", "Filler", 107, 2);
        assertText("12", "Source Non-ED Branch ID", 109, 4);
        assertText("13", "Source Type Code", 113, 1);
        assertText("14", "Recipient Name", 114, 32);
        assertText("15", "Recipient ID", 146, 8);
        assertText("16", "Filler", 154, 2);
        assertText("17", "Recipient Non-ED Branch ID", 156, 4);
        assertText("18", "Media Type Code", 160, 1);
        assertText("19", "DUNS Source ID", 161, 9);
        assertText("20", "DUNS Recipient ID", 170, 9);
        assertText("21", "Filler", 179, 381);
        assertText("22", "Record Terminator", 560, 1);
    }
}
