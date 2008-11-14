package commonline.cl4.response.model;

import junit.framework.TestCase;
import commonline.cl4.response.layout.*;
import flapjack.layout.RecordLayout;
import flapjack.model.RecordFactory;


public class ResponseRecordFactoryResolverTest extends TestCase {

    public void test() {
        ResponseRecordFactoryResolver resolver = new ResponseRecordFactoryResolver();

        assertFactory(new HeaderRecordLayout(), HeaderRecordFactory.class, resolver.resolve(new HeaderRecordLayout()));
        assertFactory(new SpecialMessagesRecordLayout(), SpecialMessagesRecordFactory.class, resolver.resolve(new SpecialMessagesRecordLayout()));
        assertFactory(new SupplementalBorrowerInformationRecordLayout(), SupplementalBorrowerInformationRecordFactory.class, resolver.resolve(new SupplementalBorrowerInformationRecordLayout()));
        assertFactory(new AlternativeLoanRecordLayout(), AlternativeLoanRecordFactory.class, resolver.resolve(new AlternativeLoanRecordLayout()));
        assertFactory(new TrailerRecordLayout(), TrailerRecordFactory.class, resolver.resolve(new TrailerRecordLayout()));
        assertFactory(new UniqueSupplementDetailRecordLayout(), UniqueSupplementDetailRecordFactory.class, resolver.resolve(new UniqueSupplementDetailRecordLayout()));
    }

    private void assertFactory(RecordLayout layout, Class expectedFactoryType, RecordFactory actualFactory) {
        assertNotNull("Factory was not found for "+layout.getClass().getName(),actualFactory);
        assertTrue("Factory found but was of type "+actualFactory.getClass().getName()+", but expected "+expectedFactoryType, expectedFactoryType.isInstance(actualFactory));
    }
}
