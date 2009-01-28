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

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine Network for FFELP and Alternative Loans
 * <p/>
 * Disbursement Roster File/Disbursement Roster Acknowledgment File
 * <p/>
 * Header (@H) Detail Record(s) Addendum
 */
public class HeaderRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Batch ID", "X(012)");
        field("3", "File Creation Date(CCYYMMDD)", "9(008)");
        field("4", "File Creation Time(HHMMSS)", "9(006)");
        field("5", "File Transmission Date (CCYYMMDD)", "9(008)");
        field("6", "File Transmission Time (HHMMSS)", "9(006)");
        field("7", "File Identifier Name", "X(019)");
        field("8", "File Identifier Code", "X(005)");
        field("9", "Source Name", "X(032)");
        field("10", "Source ID", "X(008)");
        field("11", "Filler", "X(002)");
        field("12", "Source Non-ED Branch ID", "X(004)");
        field("13", "Source Type Code", "X(001)");
        field("14", "Recipient Name", "X(032)");
        field("15", "Recipient ID", "X(008)");
        field("16", "Filler", "X(002)");
        field("17", "Recipient Non-ED Branch ID", "X(004)");
        field("18", "Media Type Code", "X(001)");
        field("19", "DUNS Source ID", "X(009)");
        field("20", "DUNS Recipient ID", "X(009)");
        field("21", "Filler", "X(381)");
        recordTerminator("22");
    }

    public String getCode() {
        return "@H";
    }
}
