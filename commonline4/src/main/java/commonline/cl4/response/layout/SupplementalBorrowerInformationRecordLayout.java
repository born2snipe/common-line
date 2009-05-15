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

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * Supplemental Borrower Information Response (@7) Detail Record(s) Addendum
 */
public class SupplementalBorrowerInformationRecordLayout extends AbstractCommonLineRecordLayout {
    public SupplementalBorrowerInformationRecordLayout() {
        super("@7");
    }

    protected void defineFields() {
        field("2", "Supplemental Borrower Information Layout Owner Code", "X(4)");
        field("3", "Supplemental Borrower Information Layout Identifier Code", "X(2)");
        field("4", "E-mail Address", "X(256)");
        field("5", "E-mail Address Validity Indicator", "X(1)");
        field("6", "E-mail Address Effective Date(CCYYMMDD)", "9(8)");
        field("7", "Temporary Borrower Address(line 1)", "X(30)");
        field("8", "Temporary Borrower Address(line 2)", "X(30)");
        field("9", "Temporary Borrower City", "X(24)");
        field("10", "Temporary Borrower State", "X(2)");
        field("11", "Temporary Borrower Zip Code", "9(5)");
        field("12", "Temporary Borrower Zip Code Suffix", "9(4)");
        field("13", "Foreign Postal Code", "X(14)");
        field("14", "Filler", "X(657)");
        recordTerminator("15");
    }

}
