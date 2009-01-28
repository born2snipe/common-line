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
 * UNIQUE SUPPLEMENTAL (@2) DETAIL RECORD(S)
 */
public class UniqueSupplementRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Unique Supplemental Vendor Code", "X(004)");
        field("3", "Unique Supplemental Layout Identifier Code", "X(002)");
        field("4", "Filler", "X(551)");
        recordTerminator("5");

    }

    public String getCode() {
        return "@2";
    }
}
