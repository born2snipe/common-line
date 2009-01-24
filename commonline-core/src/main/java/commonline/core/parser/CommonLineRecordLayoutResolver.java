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

import commonline.core.layout.CommonLineRecordLayout;

import java.util.*;

import flapjack.parser.RecordLayoutResolver;
import flapjack.layout.RecordLayout;


public class CommonLineRecordLayoutResolver implements RecordLayoutResolver {
    private Map recordLayouts = new HashMap();

    public RecordLayout resolve(byte[] bytes) {
        return lookupLayout(getIdentityField(bytes));
    }

    protected RecordLayout lookupLayout(byte[] bytes) {
        return (RecordLayout) recordLayouts.get(new String(bytes));
    }

    private byte[] getIdentityField(byte[] record) {
        byte[] identity = new byte[2];
        System.arraycopy(record, 0, identity, 0, identity.length);
        return identity;
    }

    public void setRecordLayouts(Collection recordLayouts) {
        this.recordLayouts.clear();
        Iterator it = recordLayouts.iterator();
        while (it.hasNext()) {
            CommonLineRecordLayout layout = (CommonLineRecordLayout) it.next();
            this.recordLayouts.put(layout.getCode(), layout);
        }
    }

    public Collection getRecordLayouts() {
        return Collections.unmodifiableCollection(recordLayouts.values());
    }
}
