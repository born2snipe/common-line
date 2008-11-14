package commonline.cl4.changesend.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;

public class BorrowerDetailRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        BorrowerDetailRecordLayout layout = new BorrowerDetailRecordLayout();

        assertEquals("@102", layout.getCode());
        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertFixedNumberField("Record Type", 3, 2, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Borrower SSN", 5, 9, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("School ID", 14, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(22, 3, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("School Non-ED Branch ID", 25, 4, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient ID", 29, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(37, 3, layout.getFieldDefinitions().get(i++));
        assertTextField("Recipient Non-ED Branch ID", 40, 4, layout.getFieldDefinitions().get(i++));
        assertFillerField(44, 12, layout.getFieldDefinitions().get(i++));
        assertTextField("Borrower Last Name", 56, 35, layout.getFieldDefinitions().get(i++));
        assertTextField("Borrower First Name", 91, 12, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower Middle Initial", 103, 1, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Borrower Date of Birth (CCYYMMDD)", 104, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Record Status", 112, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 113, 20, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS School ID", 133, 9, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS Recipient ID", 142, 9, layout.getFieldDefinitions().get(i++));
        assertFillerField(151, 183, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("School Use Only", 334, 23, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Lender Use Only", 357, 20, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Guarantor Use Only", 377, 23, layout.getFieldDefinitions().get(i++));
        assertFillerField(400, 80, layout.getFieldDefinitions().get(i++));

        assertRecordTerminatorField(480, layout.getFieldDefinitions());

        assertEquals(480, layout.getLength());
        assertEquals(24, layout.getFieldDefinitions().size());

    }

}
