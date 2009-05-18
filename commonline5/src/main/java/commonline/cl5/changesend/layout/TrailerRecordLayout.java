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
package commonline.cl5.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class TrailerRecordLayout extends AbstractCommonLineRecordLayout {
    public TrailerRecordLayout() {
        super("@T");
    }

    protected void defineFields() {
        field("2", "@1 Detail Record Count", "9(6)");
        field("3", "Unique Supplemental (@2) Detail Record Count", "9(6)");
        field("4", "File Creation Date (CCYYMMDD)", "9(8)");
        field("5", "File Creation Time (HHMMSS) O", "9(6)");
        field("6", "File Identifier Code", "X(5)");
        field("7", "Source Name", "X(32)");
        field("8", "Source ID", "X(8)");
        field("9", "Filler", "X(2)");
        field("10", "Source Non-ED Branch ID", "X(4)");
        field("11", "Recipient Name", "X(32)");
        field("12", "Recipient ID", "X(8)");
        field("13", "Filler", "X(2)");
        field("14", "Recipient Non-ED Branch ID", "X(4)");
        field("15", "Filler", "X(9)");
        field("16", "Filler", "X(9)");
        field("17", "Filler", "X(336)");
        recordTerminator("18");
    }
}
