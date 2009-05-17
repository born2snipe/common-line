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
package commonline.cl5.appsend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class SupplementalBorrowerInformationLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new SupplementalBorrowerInformationLayout();
    }

    protected int recordLength() {
        return 960;
    }

    protected int fieldCount() {
        return 8;
    }

    protected String recordCode() {
        return "@7";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Supplemental Borrower Information Layout Owner Code", 3, 4);
        assertText("3", "Supplemental Borrower Information Layout Identifier Code", 7, 2);
        assertText("4", "E-mail Address", 9, 256);
        assertText("5", "E-mail Address Validity Indicator", 265, 1);
        assertInteger("6", "E-mail Address Effective Date (CCYYMMDD)", 266, 8);
        assertText("7", "Filler", 274, 686);
        assertText("8", "Record Terminator", 960, 1);
    }
}
