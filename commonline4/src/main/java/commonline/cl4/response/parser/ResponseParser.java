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
package commonline.cl4.response.parser;

import commonline.cl4.response.layout.*;
import commonline.cl4.response.model.ResponseRecordFactoryResolver;
import commonline.core.parser.AbstractCommonLineRecordParser;

import java.util.List;


public class ResponseParser extends AbstractCommonLineRecordParser {

    public ResponseParser() {
        setRecordFactoryResolver(new ResponseRecordFactoryResolver());
    }

    protected void initializeRecordLayouts(List recordLayouts) {
        recordLayouts.add(new HeaderRecordLayout());
        recordLayouts.add(new ResponseRecordLayout());
        recordLayouts.add(new AlternativeLoanRecordLayout());
        recordLayouts.add(new SupplementalBorrowerInformationRecordLayout());
        recordLayouts.add(new UniqueSupplementDetailRecordLayout());
        recordLayouts.add(new TrailerRecordLayout());
        recordLayouts.add(new SpecialMessagesRecordLayout());
    }

}
