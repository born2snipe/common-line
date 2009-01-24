package commonline.model;

import commonline.core.layout.CommonLineRecordLayout;
import flapjack.layout.RecordLayout;
import flapjack.model.RecordFactory;

import java.util.Map;


public class CommonlineRecordFactory implements RecordFactory {
    public Object build(Object fields, RecordLayout recordLayout) {
        return new CommonLineRecord((Map<String, byte[]>)fields, (CommonLineRecordLayout) recordLayout);
    }
}
