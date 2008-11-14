package commonline.cl4.response.model;

import commonline.core.model.CommonlineRecordFactory;

import java.util.List;

import flapjack.layout.RecordLayout;


public class HeaderRecordFactory extends CommonlineRecordFactory {

    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        Header header = new Header();
        int i = 1;
        header.setSoftwareProductCode(text(fields.get(i++)));
        header.setSoftwareVersion(text(fields.get(i++)));
        header.setBatchId(text(fields.get(i++)));
        header.setFileCreation(date(fields.get(i++), fields.get(i++)));
        header.setFileTransmission(date(fields.get(i++), fields.get(i++)));
        header.setFileIdentifierName(text(fields.get(i++)));
        header.setFileIdentifierCode(text(fields.get(i++)));
        header.setRecipientName(text(fields.get(i++)));
        header.setRecipientId(text(fields.get(i++)));
        i++; // filler
        header.setRecipientNonEdBranchId(text(fields.get(i++)));
        header.setRecipientTypeCode(text(fields.get(i++)));
        header.setSourceName(text(fields.get(i++)));
        header.setSourceId(text(fields.get(i++)));
        i++; // filler
        header.setSourceNonEdBranchId(text(fields.get(i++)));
        header.setMediaTypeCode(text(fields.get(i++)));
        header.setDunsRecipientId(text(fields.get(i++)));
        header.setDunsSourceId(text(fields.get(i++)));
        return header;
    }

}
