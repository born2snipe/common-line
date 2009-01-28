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


public class TrailerRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new TrailerRecordLayout();
    }

    protected int recordLength() {
        return 560;
    }

    protected int fieldCount() {
        return 18;
    }

    protected String recordCode() {
        return "@T";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Disbursement (@1) Detail Record Count", 3, 6);
        assertDecimal("3", "Total Net Disbursement Amount", 9, 14);
        assertDecimal("4", "Total Net EFT Amount", 23, 14);
        assertDecimal("5", "Total Net Non-EFT Amount", 37, 14);
        assertDecimal("6", "Total Reissue Amount", 51, 14);
        assertInteger("7", "Unique Supplemental (@2) Detail Record Count", 65, 6);
        assertInteger("8", "Special Messages (@3) Detail Record Count", 71, 6);
        assertInteger("9", "File Creation Date (CCYYMMDD)", 77, 8);
        assertInteger("10", "File Creation Time (HHMMSS)", 85, 6);
        assertText("11", "Source ID", 91, 8);
        assertText("12", "Filler", 99, 2);
        assertText("13", "Source Non-ED Branch ID", 101, 4);
        assertDecimal("14", "Total Cancellation Amount", 105, 14);
        assertDecimal("15", "Total Deficit Amount", 119, 14);
        assertText("16", "DUNS Source ID", 133, 9);
        assertText("17", "Filler", 142, 418);
        assertText("18", "Record Terminator", 560, 1);
    }
}
