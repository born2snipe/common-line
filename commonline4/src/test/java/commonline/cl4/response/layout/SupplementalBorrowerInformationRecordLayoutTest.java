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
package commonline.cl4.response.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class SupplementalBorrowerInformationRecordLayoutTest extends AbstractRecordLayoutTestCase {

    protected RecordLayout createRecordLayout() {
        return new SupplementalBorrowerInformationRecordLayout();
    }

    protected int recordLength() {
        return 1040;
    }

    protected int fieldCount() {
        return 15;
    }

    protected String recordCode() {
        return "@7";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Supplemental Borrower Information Layout Owner Code R", 3, 4);
        assertText("3", "Supplemental Borrower Information Layout Identifier Code R", 7, 2);
        assertText("4", "E-mail Address R1", 9, 256);
        assertText("5", "E-mail Address Validity Indicator R", 265, 1);
        assertInteger("6", "E-mail Address Effective Date(CCYYMMDD)", 266, 8);
        assertText("7", "Temporary Borrower Address(line 1)", 274, 30);
        assertText("8", "Temporary Borrower Address(line 2)", 304, 30);
        assertText("9", "Temporary Borrower City R1", 334, 24);
        assertText("10", "Temporary Borrower State R1", 358, 2);
        assertInteger("11", "Temporary Borrower Zip Code R1", 360, 5);
        assertInteger("12", "Temporary Borrower Zip Code Suffix R 1", 365, 4);
        assertText("13", "Foreign Postal Code R1", 369, 14);
        assertText("14", "Filler", 383, 657);
        assertText("15", "Record Terminator", 1040, 1);

    }
}
