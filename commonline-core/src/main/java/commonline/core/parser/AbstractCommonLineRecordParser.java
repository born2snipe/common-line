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
package commonline.core.parser;

import flapjack.parser.RecordParserImpl;
import flapjack.parser.StringRecordFieldParser;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractCommonLineRecordParser extends RecordParserImpl {

    protected AbstractCommonLineRecordParser() {
        CommonLineRecordLayoutResolver resolver = createRecordLayoutResolver();
        List recordLayouts = new ArrayList();
        initializeRecordLayouts(recordLayouts);
        resolver.setRecordLayouts(recordLayouts);
        setRecordFieldParser(new StringRecordFieldParser());
        setRecordLayoutResolver(resolver);
    }

    protected CommonLineRecordLayoutResolver createRecordLayoutResolver() {
        return new CommonLineRecordLayoutResolver();
    }

    protected abstract void initializeRecordLayouts(List recordLayouts);
}
