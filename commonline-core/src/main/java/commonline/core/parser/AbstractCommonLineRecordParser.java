package commonline.core.parser;

import flapjack.parser.RecordParserImpl;
import flapjack.parser.StringRecordFieldParser;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractCommonLineRecordParser extends RecordParserImpl {

    protected AbstractCommonLineRecordParser() {
        CommonLineRecordLayoutResolver resolver = createRecordLayoutResolver();
        List recordLayouts = new ArrayList();
        initializeRecordLayouts(recordLayouts);
        resolver.setRecordLayouts(recordLayouts);
        setRecordFieldParser(new StringRecordFieldParser());
        setRecordLayoutResolver(resolver);
    }

    protected CommonLineRecordLayoutResolver createRecordLayoutResolver() {
        return new CommonLineRecordLayoutResolver();
    }

    protected abstract void initializeRecordLayouts(List recordLayouts);
}
