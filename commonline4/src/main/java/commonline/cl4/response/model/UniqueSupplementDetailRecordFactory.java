package commonline.cl4.response.model;

import commonline.core.model.CommonlineRecordFactory;

import java.util.List;

import flapjack.layout.RecordLayout;


public class UniqueSupplementDetailRecordFactory extends CommonlineRecordFactory{
    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        UniqueSupplementDetail detail = new UniqueSupplementDetail();
        int i=1;
        detail.setUniqueSupplementVendorCode(text(fields.get(i++)));
        detail.setUniqueSupplementalLayoutIdentifierCode(text(fields.get(i++)));
        return detail;
    }
}
