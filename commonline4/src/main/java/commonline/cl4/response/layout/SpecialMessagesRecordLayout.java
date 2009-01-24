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
 * NCHELP CommonLine� Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * SPECIAL MESSAGES (@3) DETAIL RECORD(S)
 */
public class SpecialMessagesRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        field("2", "Message 1", "X(160)");
        field("3", "Message 2", "X(160)");
        field("4", "Message 3", "X(160)");
        field("5", "Message 4", "X(160)");
        field("6", "Message 5", "X(160)");
        field("7", "Filler", "X(237)");
        recordTerminator("8");
    }

    public String getCode() {
        return "@3";
    }
}
