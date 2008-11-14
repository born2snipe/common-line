package commonline.cl4.changesend.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;

public class HeaderRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        HeaderRecordLayout layout = new HeaderRecordLayout();

        assertEquals("@H", layout.getCode());

        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertTextField("Software Product Code", 3, 4, layout.getFieldDefinitions().get(i++));
        assertTextField("Software Version", 7, 4, layout.getFieldDefinitions().get(i++));
        assertTextField("Batch ID", 11, 12, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("File Creation Date (CCYYMMDD)", 23, 8, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("File Creation Time (HHMMSS)", 31, 6, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("File Transmission Date (CCYYMMDD)", 37, 8, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("File Transmission Time (HHMMSS)", 45, 6, layout.getFieldDefinitions().get(i++));
        assertTextField("File Identifier Name", 51, 19, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("File Identifier Code", 70, 5, layout.getFieldDefinitions().get(i++));
        assertTextField("Source Name", 75, 32, layout.getFieldDefinitions().get(i++));
        assertTextField("Source ID", 107, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(115, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("Source Non-ED Branch ID", 117, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Source Type Code", 121, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient Name", 122, 32, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient ID", 154, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(162, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient Non-ED Branch ID", 164, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Media Type Code", 168, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS Source ID", 169, 9, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS Recipient ID", 178, 9, layout.getFieldDefinitions().get(i++));
        assertFillerField(187, 293, layout.getFieldDefinitions().get(i++));

        assertRecordTerminatorField(480, layout.getFieldDefinitions());

        assertEquals(480, layout.getLength());
        assertEquals(24, layout.getFieldDefinitions().size());
    }
}
