package commonline.cl4.response.model;

import commonline.core.model.CommonlineRecordFactory;

import java.util.List;

import flapjack.layout.RecordLayout;


public class TrailerRecordFactory extends CommonlineRecordFactory{
    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        Trailer trailer = new Trailer();

        int i=1;

        trailer.setResponseDetailRecordCount(number(fields.get(i++)));
        trailer.setUniqueSupplementalDetailRecordCount(number(fields.get(i++)));
        trailer.setSpecialMessagesDetailRecordCount(number(fields.get(i++)));
        trailer.setFileCreation(date(fields.get(i++), fields.get(i++)));
        trailer.setFileIdentifierCode(text(fields.get(i++)));
        trailer.setRecipientName(text(fields.get(i++)));
        trailer.setRecipientId(text(fields.get(i++)));
        i++; // filler
        trailer.setRecipientNonEdBranchId(text(fields.get(i++)));
        trailer.setSourceName(text(fields.get(i++)));
        trailer.setSourceId(text(fields.get(i++)));
        i++; // filler
        trailer.setSourceNonEdBranchId(text(fields.get(i++)));
        trailer.setAlternativeLoanResponseDetailRecordCount(number(fields.get(i++)));
        trailer.setReferenceResponseDetailRecordCount(number(fields.get(i++)));
        trailer.setChangeTransactionErrorDetailRecordCount(number(fields.get(i++)));
        trailer.setSupplementalBorrowerInformationResponseDetailRecordCount(number(fields.get(i++)));
        trailer.setDunsRecipientId(text(fields.get(i++)));
        trailer.setDunsSourceId(text(fields.get(i++)));

        return trailer;
    }
}
