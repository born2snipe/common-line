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
package commonline.cl4.response.model;

import commonline.core.model.CommonlineRecordFactory;

import java.util.List;

import flapjack.layout.RecordLayout;


public class SupplementalBorrowerInformationRecordFactory extends CommonlineRecordFactory {
    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        SupplementalBorrowerInformation info = new SupplementalBorrowerInformation();

        int i=1;
        info.setSupplementalBorrowerInformationLayoutOwnerCode(text(fields.get(i++)));
        info.setSupplementalBorrowerInformationLayoutIdentifierCode(text(fields.get(i++)));
        info.setEmailAddress(text(fields.get(i++)));
        info.setEmailAddressValidityIndicator(text(fields.get(i++)));
        info.setEmailAddressEffectiveDate(date(fields.get(i++)));
        info.setTemporaryBorrowerAddressLine1(text(fields.get(i++)));
        info.setTemporaryBorrowerAddressLine2(text(fields.get(i++)));
        info.setTemporaryBorrowerCity(text(fields.get(i++)));
        info.setTemporaryBorrowerState(text(fields.get(i++)));
        info.setTemporaryBorrowerZipCode(number(fields.get(i++)));
        info.setTemporaryBorrowerZipCodeSuffix(number(fields.get(i++)));
        info.setForeignPostalCode(text(fields.get(i++)));

        return info;
    }
}
