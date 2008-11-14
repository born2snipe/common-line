package commonline.core.parser;

import commonline.core.layout.AbstractCommonLineRecordLayout;
import junit.framework.TestCase;

import java.util.Arrays;

import flapjack.layout.RecordLayout;


public class CommoneLineRecordLayoutResolverTest extends TestCase {
    private CommoneLineRecordLayoutResolver resolver;

    protected void setUp() throws Exception {
        super.setUp();
        resolver = new CommoneLineRecordLayoutResolver();
        resolver.setRecordLayouts(Arrays.asList(new RecordLayout[]{new StubRecordLayout("@1")}));
    }

    public void test_resolve_RecordLayoutFound() {
        RecordLayout layout = resolver.resolve("@1HelloThere".getBytes());

        assertNotNull(layout);
        assertTrue(layout instanceof StubRecordLayout);

        StubRecordLayout stub = (StubRecordLayout) layout;
        assertEquals("@1", stub.getCode());
    }

    public void test_resolve_RecordLayoutNotFound() {
        RecordLayout layout = resolver.resolve("@2HelloThere".getBytes());

        assertNull(layout);
    }

    private static class StubRecordLayout extends AbstractCommonLineRecordLayout {
        private String code;

        private StubRecordLayout(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
