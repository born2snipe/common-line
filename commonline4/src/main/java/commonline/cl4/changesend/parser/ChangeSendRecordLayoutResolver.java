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
package commonline.cl4.changesend.parser;

import commonline.core.parser.CommonLineRecordLayoutResolver;
import flapjack.layout.RecordLayout;

public class ChangeSendRecordLayoutResolver extends CommonLineRecordLayoutResolver {

    public RecordLayout resolve(byte[] bytes) {
        if (0 == bytes.length) {
            return null;
        }

        RecordLayout layout = lookupLayout(createIdentityBuffer(bytes, 4));
        if (layout == null) {
            return lookupLayout(createIdentityBuffer(bytes, 2));
        }
        return layout;
    }

    private byte[] createIdentityBuffer(byte[] bytes, int length) {
        byte[] identity = new byte[length];
        System.arraycopy(bytes, 0, identity, 0, identity.length);
        return identity;
    }

}
