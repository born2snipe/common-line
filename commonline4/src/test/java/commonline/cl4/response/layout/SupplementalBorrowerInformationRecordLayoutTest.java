package commonline.cl4.response.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;


public class SupplementalBorrowerInformationRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        SupplementalBorrowerInformationRecordLayout layout = new SupplementalBorrowerInformationRecordLayout();

        assertEquals("@7", layout.getCode());
        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertFixedTextField("Supplemental Borrower Information Layout Owner Code", 3, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Supplemental Borrower Information Layout Identifier Code", 7, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("E-mail Address", 9, 256, layout.getFieldDefinitions().get(i++));
        assertTextField("E-mail Address Validity Indicator", 265, 1, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("E-mail Address Effective Date (CCYYMMDD)", 266, 8, layout.getFieldDefinitions().get(i++));
        assertTextField("Temporary Borrower Address (line 1)", 274, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Temporary Borrower Address (line 2)", 304, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Temporary Borrower City", 334, 24, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Temporary Borrower State", 358, 2, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Temporary Borrower Zip Code", 360, 5, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Temporary Borrower Zip Code Suffix", 365, 4, layout.getFieldDefinitions().get(i++));
        assertTextField("Foreign Postal Code", 369, 14, layout.getFieldDefinitions().get(i++));
        assertFillerField(383, 657, layout.getFieldDefinitions().get(i++));
        assertRecordTerminatorField(1040, layout.getFieldDefinitions());

        assertEquals(1040, layout.getLength());
        assertEquals(15, layout.getFieldDefinitions().size());
    }
}
