package commonline.cl4.changesend.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;

import java.util.List;


public class DisbursementCancellationChangeDetailRecordLayoutTest extends CommonLineRecordLayoutTestCase {
    public void test() {
        DisbursementCancellationChangeDetailRecordLayout layout = new DisbursementCancellationChangeDetailRecordLayout();

        assertEquals("@109", layout.getCode());

        List fields = layout.getFieldDefinitions();
        int i = 1;

        assertRecordCodeField(fields);
        assertFixedNumberField("Record Type", 3, 2, fields.get(i++));
        assertFixedNumberField("Borrower SSN", 5, 9, fields.get(i++));
        assertFixedNumberField("School ID", 14, 8, fields.get(i++));
        assertFillerField(22, 3, fields.get(i++));
        assertFixedTextField("School Non-ED Branch ID", 25, 4, fields.get(i++));
        assertTextField("Recipient ID", 29, 8, fields.get(i++));
        assertFillerField(37, 3, fields.get(i++));
        assertTextField("Recipient Non-ED Branch ID", 40, 4, fields.get(i++));
        assertFixedTextField("Unique Loan Identifier", 44, 16, fields.get(i++));
        assertFixedNumberField("Guarantee Date (CCYYMMDD)", 60, 8, fields.get(i++));
        assertFixedTextField("Loan Type Code", 68, 2, fields.get(i++));
        assertFixedTextField("Alternative Loan Program Type Code", 70, 3, fields.get(i++));
        assertFixedNumberField("First Disbursement Date (CCYYMMDD)", 73, 8, fields.get(i++));
        assertFixedTextField("Lender ID", 81, 6, fields.get(i++));
        assertFixedTextField("Servicer Code", 87, 6, fields.get(i++));

        /**
         */
    }
}
