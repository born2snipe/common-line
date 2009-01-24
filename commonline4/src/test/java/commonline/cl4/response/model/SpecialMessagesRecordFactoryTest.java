package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;


public class SpecialMessagesRecordFactoryTest extends TestCase {

    public void test() {
        SpecialMessagesRecordFactory factory = new SpecialMessagesRecordFactory();

        List fields = Arrays.asList(new byte[][]{
                "@3".getBytes(), "message1".getBytes(), "message2".getBytes(), "message3".getBytes(), "message4".getBytes(), "message5".getBytes(), "filler".getBytes(), "*".getBytes(), "\r\n".getBytes()
        });

        Object obj = factory.build(fields, null);
        assertNotNull(obj);
        assertTrue(obj instanceof SpecialMessages);

        SpecialMessages messages = (SpecialMessages) obj;
        assertEquals("message1", messages.getMessage1());
        assertEquals("message2", messages.getMessage2());
        assertEquals("message3", messages.getMessage3());
        assertEquals("message4", messages.getMessage4());
        assertEquals("message5", messages.getMessage5());
    }
}
