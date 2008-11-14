package commonline.cl4.changesend.parser;

import commonline.core.parser.CommoneLineRecordLayoutResolver;
import flapjack.layout.RecordLayout;

public class ChangeSendRecordLayoutResolver extends CommoneLineRecordLayoutResolver {

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
