package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class HeaderRecordFactoryTest extends TestCase {
    private List fields;

    public void setUp() {
        fields = new ArrayList();

        fields.addAll(Arrays.asList(new byte[][]{
                "@H".getBytes(),
                " 123".getBytes(),
                "  12".getBytes(),
                "batchId".getBytes(),
                "20000120".getBytes(),
                "012030".getBytes(),
                "20000122".getBytes(),
                "112530".getBytes(),
                "idName".getBytes(),
                "idCode".getBytes(),
                "recipientName".getBytes(),
                "recipientId".getBytes(),
                "filler".getBytes(),
                "recipientNonEdBranchId".getBytes(),
                "recipientTypeCode".getBytes(),
                "sourceName".getBytes(),
                "sourceId".getBytes(),
                "filler".getBytes(),
                "sourceNonEdBranchId".getBytes(),
                "mediaTypeCode".getBytes(),
                "dunsRecipientId".getBytes(),
                "dunsSourceId".getBytes(),
                "filler".getBytes(),
                "*".getBytes(),
                "\r\n".getBytes()
        }));
    }


    public void test_WithTimes() {
        HeaderRecordFactory factory = new HeaderRecordFactory();

        Object obj = factory.build(fields, null);
        assertNotNull(obj);
        assertTrue(obj instanceof Header);

        Header header = (Header) obj;

        assertEquals("123", header.getSoftwareProductCode());
        assertEquals("12", header.getSoftwareVersion());
        assertEquals("batchId", header.getBatchId());
        assertEquals(createDate("01/20/2000 01:20:30"), header.getFileCreation());
        assertEquals(createDate("01/22/2000 11:25:30"), header.getFileTransmission());
        assertEquals("idName",header.getFileIdentifierName());
        assertEquals("idCode",header.getFileIdentifierCode());
        assertEquals("recipientName", header.getRecipientName());
        assertEquals("recipientId", header.getRecipientId());
        assertEquals("recipientNonEdBranchId", header.getRecipientNonEdBranchId());
        assertEquals("recipientTypeCode", header.getRecipientTypeCode());
        assertEquals("sourceName", header.getSourceName());
        assertEquals("sourceId", header.getSourceId());
        assertEquals("sourceNonEdBranchId", header.getSourceNonEdBranchId());
        assertEquals("mediaTypeCode", header.getMediaTypeCode());
        assertEquals("dunsRecipientId", header.getDunsRecipientId());
        assertEquals("dunsSourceId", header.getDunsSourceId());

    }

    public void test_WithoutTimes() {
        HeaderRecordFactory factory = new HeaderRecordFactory();

        fields.set(4, "20000120");
        fields.set(5, "");
        fields.set(6, "20000122");
        fields.set(7, "");

        Object obj = factory.build(fields, null);
        assertNotNull(obj);
        assertTrue(obj instanceof Header);

        Header header = (Header) obj;

        assertEquals(createDate("01/20/2000 00:00:00"), header.getFileCreation());
        assertEquals(createDate("01/22/2000 00:00:00"), header.getFileTransmission());
    }

    private Date createDate(String text) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm/DD/yyyy HH:mm:ss");
        try {
            return dateFormat.parse(text);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
