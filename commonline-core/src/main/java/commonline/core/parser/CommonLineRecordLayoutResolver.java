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
