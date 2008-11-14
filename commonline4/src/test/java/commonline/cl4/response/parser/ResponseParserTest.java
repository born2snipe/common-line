package commonline.cl4.response.parser;

import commonline.cl4.response.layout.*;
import commonline.core.parser.CommonLineRecordLayoutResolver;
import junit.framework.TestCase;

import java.util.Iterator;

import flapjack.parser.RecordLayoutResolver;


public class ResponseParserTest extends TestCase {

    public void test_verifyRecordLayouts() {
        ResponseParser parser = new ResponseParser();

        RecordLayoutResolver recordLayoutResolver = parser.getRecordLayoutResolver();
        assertNotNull(recordLayoutResolver);
        assertTrue(recordLayoutResolver instanceof CommonLineRecordLayoutResolver);

        CommonLineRecordLayoutResolver resolver = (CommonLineRecordLayoutResolver) recordLayoutResolver;
        assertContainsRecordLayout(AlternativeLoanRecordLayout.class, resolver);
        assertContainsRecordLayout(SupplementalBorrowerInformationRecordLayout.class, resolver);
        assertContainsRecordLayout(HeaderRecordLayout.class, resolver);
        assertContainsRecordLayout(TrailerRecordLayout.class, resolver);
        assertContainsRecordLayout(UniqueSupplementDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(SpecialMessagesRecordLayout.class, resolver);
        assertContainsRecordLayout(ResponseRecordLayout.class, resolver);
        assertEquals(7, resolver.getRecordLayouts().size());
    }

    private void assertContainsRecordLayout(Class clazz, CommonLineRecordLayoutResolver resolver) {
        Iterator it = resolver.getRecordLayouts().iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj.getClass().equals(clazz)) {
                assertTrue(true);
                return;
            }
        }
        assertTrue("Could not find RecordLayout " + clazz.getName(), false);
    }
}
