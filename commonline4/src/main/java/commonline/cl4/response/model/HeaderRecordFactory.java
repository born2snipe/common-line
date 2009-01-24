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


public class HeaderRecordFactory extends CommonlineRecordFactory {

    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        Header header = new Header();
        int i = 1;
        header.setSoftwareProductCode(text(fields.get(i++)));
        header.setSoftwareVersion(text(fields.get(i++)));
        header.setBatchId(text(fields.get(i++)));
        header.setFileCreation(date(fields.get(i++), fields.get(i++)));
        header.setFileTransmission(date(fields.get(i++), fields.get(i++)));
        header.setFileIdentifierName(text(fields.get(i++)));
        header.setFileIdentifierCode(text(fields.get(i++)));
        header.setRecipientName(text(fields.get(i++)));
        header.setRecipientId(text(fields.get(i++)));
        i++; // filler
        header.setRecipientNonEdBranchId(text(fields.get(i++)));
        header.setRecipientTypeCode(text(fields.get(i++)));
        header.setSourceName(text(fields.get(i++)));
        header.setSourceId(text(fields.get(i++)));
        i++; // filler
        header.setSourceNonEdBranchId(text(fields.get(i++)));
        header.setMediaTypeCode(text(fields.get(i++)));
        header.setDunsRecipientId(text(fields.get(i++)));
        header.setDunsSourceId(text(fields.get(i++)));
        return header;
    }

}
