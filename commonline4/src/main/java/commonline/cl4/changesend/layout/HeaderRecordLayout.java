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
package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine� Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * Header
 */
public class HeaderRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        field("2", "Software Product Code", "X(004)");
        field("3", "Software Version", "X(004)");
        field("4", "Batch ID", "X(012)");
        field("5", "File Creation Date (CCYYMMDD)", "9(008)");
        field("6", "File Creation Time (HHMMSS)", "9(006)");
        field("7", "File Transmission Date (CCYYMMDD)", "9(008)");
        field("8", "File Transmission Time (HHMMSS)", "9(006)");
        field("9", "File Identifier Name", "X(019)");
        field("10", "File Identifier Code", "X(005)");
        field("11", "Source Name", "X(032)");
        field("12", "Source ID", "X(008)");
        field("13", "Filler", "X(002)");
        field("14", "Source Non-ED Branch ID", "X(004)");
        field("15", "Source Type Code", "X(001)");
        field("16", "Recipient Name", "X(032)");
        field("17", "Recipient ID", "X(008)");
        field("18", "Filler", "X(002)");
        field("19", "Recipient Non-ED Branch ID", "X(004)");
        field("20", "Media Type Code", "X(001)");
        field("21", "DUNS Source ID", "X(009)");
        field("22", "DUNS Recipient ID", "X(009)");
        field("23", "Filler", "X(293)");
        field("24", "Record Terminator", "X(001)");
    }

    public String getCode() {
        return "@H";
    }

}
