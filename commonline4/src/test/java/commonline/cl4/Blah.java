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
package commonline.cl4;

import commonline.cl4.response.layout.SupplementalBorrowerInformationRecordLayout;
import commonline.core.layout.DecimalFieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;
import commonline.core.layout.CommonlineFieldDefinition;
import commonline.core.layout.TextFieldDefinition;
import flapjack.layout.RecordLayout;

import java.util.Iterator;


public class Blah {
    public static void main(String args[]) {
        RecordLayout layout = new SupplementalBorrowerInformationRecordLayout();

        Iterator it = layout.getFieldDefinitions().iterator();
        while (it.hasNext()) {
            CommonlineFieldDefinition fieldDef = (CommonlineFieldDefinition) it.next();
            if (fieldDef instanceof DecimalFieldDefinition) {
                System.out.print("assertDecimal(");
            } else if (fieldDef instanceof IntegerFieldDefinition) {
                System.out.print("assertInteger(");
            } else if (fieldDef instanceof TextFieldDefinition) {
                System.out.print("assertText(");
            }

            System.out.print("\"" + fieldDef.getId() + "\", ");
            System.out.print("\"" + fieldDef.getName() + "\", ");
            System.out.print((fieldDef.getPosition() + 1) + ", ");
            System.out.println(fieldDef.getLength() + ");");
        }
    }
}
