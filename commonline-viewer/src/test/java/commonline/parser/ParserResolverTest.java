package commonline.parser;

import junit.framework.TestCase;
import commonline.FileType;
import commonline.FileVersion;
import commonline.cl4.response.parser.ResponseParser;
import flapjack.parser.RecordParser;


public class ParserResolverTest extends TestCase {

    public void test_resolve_ParserResolved() {
        ParserResolver resolver = new ParserResolver();

        RecordParser parser = resolver.resolver(FileType.RESPONSE, FileVersion.CL4);

        assertNotNull(parser);
        assertTrue(parser instanceof ResponseParser);
    }
    
    public void test_resolve_ParserUnResolved() {
        ParserResolver resolver = new ParserResolver();

        assertNull(resolver.resolver(FileType.RESPONSE, null));
    }
}
