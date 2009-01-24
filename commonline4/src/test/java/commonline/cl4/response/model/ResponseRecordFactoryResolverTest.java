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

import junit.framework.TestCase;
import commonline.cl4.response.layout.*;
import flapjack.layout.RecordLayout;
import flapjack.model.RecordFactory;


public class ResponseRecordFactoryResolverTest extends TestCase {

    public void test() {
        ResponseRecordFactoryResolver resolver = new ResponseRecordFactoryResolver();

        assertFactory(new HeaderRecordLayout(), HeaderRecordFactory.class, resolver.resolve(new HeaderRecordLayout()));
        assertFactory(new SpecialMessagesRecordLayout(), SpecialMessagesRecordFactory.class, resolver.resolve(new SpecialMessagesRecordLayout()));
        assertFactory(new SupplementalBorrowerInformationRecordLayout(), SupplementalBorrowerInformationRecordFactory.class, resolver.resolve(new SupplementalBorrowerInformationRecordLayout()));
        assertFactory(new AlternativeLoanRecordLayout(), AlternativeLoanRecordFactory.class, resolver.resolve(new AlternativeLoanRecordLayout()));
        assertFactory(new TrailerRecordLayout(), TrailerRecordFactory.class, resolver.resolve(new TrailerRecordLayout()));
        assertFactory(new UniqueSupplementDetailRecordLayout(), UniqueSupplementDetailRecordFactory.class, resolver.resolve(new UniqueSupplementDetailRecordLayout()));
    }

    private void assertFactory(RecordLayout layout, Class expectedFactoryType, RecordFactory actualFactory) {
        assertNotNull("Factory was not found for "+layout.getClass().getName(),actualFactory);
        assertTrue("Factory found but was of type "+actualFactory.getClass().getName()+", but expected "+expectedFactoryType, expectedFactoryType.isInstance(actualFactory));
    }
}
