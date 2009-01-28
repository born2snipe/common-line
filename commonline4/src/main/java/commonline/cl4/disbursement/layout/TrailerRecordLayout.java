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
 * Trailer (@T) Detail Record(s) Addendum
 */
public class TrailerRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Disbursement (@1) Detail Record Count", "9(006)");
        field("3", "Total Net Disbursement Amount", "9(012)v99");
        field("4", "Total Net EFT Amount", "9(012)v99");
        field("5", "Total Net Non-EFT Amount", "9(012)v99");
        field("6", "Total Reissue Amount", "9(012)v99");
        field("7", "Unique Supplemental (@2) Detail Record Count", "9(006)");
        field("8", "Special Messages (@3) Detail Record Count", "9(006)");
        field("9", "File Creation Date (CCYYMMDD)", "9(008)");
        field("10", "File Creation Time (HHMMSS)", "9(006)");
        field("11", "Source ID", "X(008)");
        field("12", "Filler", "X(002)");
        field("13", "Source Non-ED Branch ID", "X(004)");
        field("14", "Total Cancellation Amount", "9(012)v99");
        field("15", "Total Deficit Amount", "9(012)v99");
        field("16", "DUNS Source ID", "X(009)");
        field("17", "Filler", "X(418)");
        recordTerminator("18");
    }

    public String getCode() {
        return "@T";
    }
}
