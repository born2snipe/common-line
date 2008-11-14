package commonline.cl4.response.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;


public class TrailerRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        TrailerRecordLayout layout = new TrailerRecordLayout();

        assertEquals("@T", layout.getCode());
        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertNumberField("Response (@1) Detail Record Count", 3, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Unique Supplemental (@2) Detail Record Count", 9, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Special Messages (@3) Detail Record Count", 15, 6, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("File Creation Date (CCYYMMDD)", 21, 8, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("File Creation Time (HHMMSS)", 29, 6, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("File Identifier Code", 35, 5, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient Name", 40, 32, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient ID", 72, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(80, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient Non-ED Branch ID", 82, 4, layout.getFieldDefinitions().get(i++));
        assertTextField("Source Name", 86, 32, layout.getFieldDefinitions().get(i++));
        assertTextField("Source ID", 118, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(126, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("Source Non-ED Branch ID", 128, 4, layout.getFieldDefinitions().get(i++));
        assertNumberField("Alternative Loan Response (@4) Detail Record Count", 132, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Reference Response (@5) Detail Record Count", 138, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Change Transaction Error (@6) Detail Record Count", 144, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Supplemental Borrower Information Response (@7) Detail Record Count", 150, 6, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS Recipient ID", 156, 9, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS Source ID", 165, 9, layout.getFieldDefinitions().get(i++));
        assertFillerField(174, 866, layout.getFieldDefinitions().get(i++));
        assertRecordTerminatorField(1040, layout.getFieldDefinitions());

        assertEquals(1040, layout.getLength());
        assertEquals(23, layout.getFieldDefinitions().size());
    }
}
