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


public class UniqueSupplementDetailRecordFactory extends CommonlineRecordFactory{
    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        UniqueSupplementDetail detail = new UniqueSupplementDetail();
        int i=1;
        detail.setUniqueSupplementVendorCode(text(fields.get(i++)));
        detail.setUniqueSupplementalLayoutIdentifierCode(text(fields.get(i++)));
        return detail;
    }
}
