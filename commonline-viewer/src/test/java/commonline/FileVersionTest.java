package commonline;

import junit.framework.TestCase;


public class FileVersionTest extends TestCase {

    public void test_evaluate() {
        assertEquals(FileVersion.CL5, FileVersion.evaluate("R005P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("R005T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("R004P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("R004T"));

        assertEquals(FileVersion.CL5, FileVersion.evaluate("C005P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("C005T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("C004P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("C004T"));

        assertEquals(FileVersion.CL5, FileVersion.evaluate("A005P"));
        assertEquals(FileVersion.CL5, FileVersion.evaluate("A005T"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("A004P"));
        assertEquals(FileVersion.CL4, FileVersion.evaluate("A004T"));
        
        assertNull(FileVersion.evaluate("WTF"));
    }
}
