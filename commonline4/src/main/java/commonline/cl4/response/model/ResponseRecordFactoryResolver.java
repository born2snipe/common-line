package commonline.cl4.response.model;

import commonline.cl4.response.layout.*;

import java.util.HashMap;
import java.util.Map;

import flapjack.model.RecordFactoryResolver;
import flapjack.model.RecordFactory;
import flapjack.layout.RecordLayout;


public class ResponseRecordFactoryResolver implements RecordFactoryResolver {
    private Map factories = new HashMap();

    public ResponseRecordFactoryResolver() {
        factories.put(HeaderRecordLayout.class, new HeaderRecordFactory());
        factories.put(SpecialMessagesRecordLayout.class, new SpecialMessagesRecordFactory());
        factories.put(SupplementalBorrowerInformationRecordLayout.class, new SupplementalBorrowerInformationRecordFactory());
        factories.put(TrailerRecordLayout.class, new TrailerRecordFactory());
        factories.put(AlternativeLoanRecordLayout.class, new AlternativeLoanRecordFactory());
        factories.put(UniqueSupplementDetailRecordLayout.class, new UniqueSupplementDetailRecordFactory());
    }

    public RecordFactory resolve(RecordLayout layout) {
        return (RecordFactory) factories.get(layout.getClass());
    }
}
