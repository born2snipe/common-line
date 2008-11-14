package commonline.cl4.response.parser;

import commonline.cl4.response.layout.*;
import commonline.cl4.response.model.ResponseRecordFactoryResolver;
import commonline.core.parser.CommoneLineRecordLayoutResolver;

import java.util.ArrayList;
import java.util.List;

import flapjack.parser.RecordParserImpl;
import flapjack.parser.StringRecordFieldParser;


public class ResponseParser extends RecordParserImpl {

    public ResponseParser() {
        CommoneLineRecordLayoutResolver resolver = new CommoneLineRecordLayoutResolver();
        List recordLayouts = new ArrayList();
        initializeRecordLayouts(recordLayouts);
        resolver.setRecordLayouts(recordLayouts);
        setRecordFieldParser(new StringRecordFieldParser());
        setRecordLayoutResolver(resolver);
        setRecordFactoryResolver(new ResponseRecordFactoryResolver());
    }

    protected void initializeRecordLayouts(List recordLayouts) {
        recordLayouts.add(new HeaderRecordLayout());
        recordLayouts.add(new ResponseRecordLayout());
        recordLayouts.add(new AlternativeLoanRecordLayout());
        recordLayouts.add(new SupplementalBorrowerInformationRecordLayout());
        recordLayouts.add(new UniqueSupplementDetailRecordLayout());
        recordLayouts.add(new TrailerRecordLayout());
        recordLayouts.add(new SpecialMessagesRecordLayout());
    }

}
