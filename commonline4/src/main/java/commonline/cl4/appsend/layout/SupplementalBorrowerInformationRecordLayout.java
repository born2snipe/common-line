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
package commonline.cl4.appsend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine� Network for FFELP and Alternative Loans
 * <p/>
 * Application Send File
 * <p/>
 * Supplemental Borrower Information (@7) Detail Record(s) Addendum
 */
public class SupplementalBorrowerInformationRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Supplemental Borrower Information Layout Owner Code", "X(004)");
        field("3", "Supplemental Borrower Information Layout Identifier Code", "X(002)");
        field("4", "E-mail Address", "X(256)");
        field("5", "E-mail Address Validity Indicator", "X(001)");
        field("6", "E-mail Address Effective Date (CCYYMMDD)", "9(008)");
        field("7", "Filler", "X(606)");
        recordTerminator("8");
    }

    public String getCode() {
        return "@7";
    }
}
