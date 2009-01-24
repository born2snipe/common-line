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

import commonline.cl4.response.layout.*;

import java.util.HashMap;
import java.util.Map;

import flapjack.model.RecordFactoryResolver;
import flapjack.model.RecordFactory;
import flapjack.layout.RecordLayout;


public class ResponseRecordFactoryResolver implements RecordFactoryResolver {
    private Map factories = new HashMap();

    public ResponseRecordFactoryResolver() {
        factories.put(HeaderRecordLayout.class, new HeaderRecordFactory());
        factories.put(SpecialMessagesRecordLayout.class, new SpecialMessagesRecordFactory());
        factories.put(SupplementalBorrowerInformationRecordLayout.class, new SupplementalBorrowerInformationRecordFactory());
        factories.put(TrailerRecordLayout.class, new TrailerRecordFactory());
        factories.put(AlternativeLoanRecordLayout.class, new AlternativeLoanRecordFactory());
        factories.put(UniqueSupplementDetailRecordLayout.class, new UniqueSupplementDetailRecordFactory());
    }

    public RecordFactory resolve(RecordLayout layout) {
        return (RecordFactory) factories.get(layout.getClass());
    }
}
