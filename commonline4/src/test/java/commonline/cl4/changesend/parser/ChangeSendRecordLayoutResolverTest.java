package commonline.cl4.changesend.parser;

import commonline.cl4.changesend.layout.BorrowerDetailRecordLayout;
import commonline.cl4.changesend.layout.HeaderRecordLayout;
import junit.framework.TestCase;

import java.util.Arrays;

import flapjack.layout.RecordLayout;

public class ChangeSendRecordLayoutResolverTest extends TestCase {
    private ChangeSendRecordLayoutResolver resolver;

    public void setUp() {
        resolver = new ChangeSendRecordLayoutResolver();
        resolver.setRecordLayouts(Arrays.asList(new Object[]{new HeaderRecordLayout(), new BorrowerDetailRecordLayout()}));
    }

    public void test_resolve_MatchFound_2ByteCode() {
        RecordLayout recordLayout = resolver.resolve("@H  XXXX".getBytes());

        assertNotNull(recordLayout);
        assertTrue(recordLayout instanceof HeaderRecordLayout);
    }

    public void test_resolve_MatchFound_4ByteCode() {
        RecordLayout recordLayout = resolver.resolve("@102XXXX".getBytes());

        assertNotNull(recordLayout);
        assertTrue(recordLayout instanceof BorrowerDetailRecordLayout);
    }

    public void test_resolve_NotEnoughDataGiven() {
        assertNull(resolver.resolve(new byte[0]));
    }

}
