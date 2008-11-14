package commonline.cl4.response.model;

import commonline.core.model.CommonlineRecordFactory;

import java.util.List;

import flapjack.layout.RecordLayout;


public class SupplementalBorrowerInformationRecordFactory extends CommonlineRecordFactory {
    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        SupplementalBorrowerInformation info = new SupplementalBorrowerInformation();

        int i=1;
        info.setSupplementalBorrowerInformationLayoutOwnerCode(text(fields.get(i++)));
        info.setSupplementalBorrowerInformationLayoutIdentifierCode(text(fields.get(i++)));
        info.setEmailAddress(text(fields.get(i++)));
        info.setEmailAddressValidityIndicator(text(fields.get(i++)));
        info.setEmailAddressEffectiveDate(date(fields.get(i++)));
        info.setTemporaryBorrowerAddressLine1(text(fields.get(i++)));
        info.setTemporaryBorrowerAddressLine2(text(fields.get(i++)));
        info.setTemporaryBorrowerCity(text(fields.get(i++)));
        info.setTemporaryBorrowerState(text(fields.get(i++)));
        info.setTemporaryBorrowerZipCode(number(fields.get(i++)));
        info.setTemporaryBorrowerZipCodeSuffix(number(fields.get(i++)));
        info.setForeignPostalCode(text(fields.get(i++)));

        return info;
    }
}
