package commonline;

import junit.framework.TestCase;


public class FileTypeTest extends TestCase {
    public void test_evaluate() {
        assertEquals(FileType.RESPONSE, FileType.evaluate("COMMON RESPONSE"));
        assertEquals(FileType.CHANGE_SEND, FileType.evaluate("CHANGE TRANS"));
        assertEquals(FileType.APP_SEND, FileType.evaluate("COMMON APPLICATIONS"));
        assertNull(FileType.evaluate("wtf"));
    }
}
