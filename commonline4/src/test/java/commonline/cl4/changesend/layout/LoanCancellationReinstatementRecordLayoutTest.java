package commonline.cl4.changesend.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;

import java.util.List;


public class LoanCancellationReinstatementRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        LoanCancellationReinstatementRecordLayout layout = new LoanCancellationReinstatementRecordLayout();

        assertEquals("@108", layout.getCode());

        int i = 1;
        List fields = layout.getFieldDefinitions();

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
        assertFixedNumberField("Loan Period Begin Date", 93, 8, fields.get(i++));
        assertFixedNumberField("Loan Period End Date", 101, 8, fields.get(i++));
        assertFixedTextField("School Designated Branch/Division Code", 109, 2, fields.get(i++));
        assertFixedNumberField("PLUS/Alternative Student SSN", 111, 9, fields.get(i++));
        assertFixedTextField("CommonLine Unique Identifier", 120, 17, fields.get(i++));
        assertFixedNumberField("CommonLine Loan Sequence Number", 137, 2, fields.get(i++));
        assertFixedNumberField("Cancellation Date (CCYYMMDD)", 139, 8, fields.get(i++));
        assertFixedNumberField("Reinstated Loan Amount", 147, 8, fields.get(i++));
        assertFixedTextField("Record Status", 155, 1, fields.get(i++));
        assertFixedTextField("Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 156, 20, fields.get(i++));
        assertFixedTextField("DUNS School ID", 176, 9, fields.get(i++));
        assertFixedTextField("DUNS Recipient ID", 185, 9, fields.get(i++));
        assertFixedTextField("DUNS Lender ID", 194, 9, fields.get(i++));
        assertFixedTextField("DUNS Servicer ID", 203, 9, fields.get(i++));
        assertFillerField(212, 202, fields.get(i++));
        assertTextField("School Use Only", 414, 23, fields.get(i++));
        assertTextField("Lender Use Only", 437, 20, fields.get(i++));
        assertTextField("Guarantor Use Only", 457, 23, fields.get(i++));
        assertRecordTerminatorField(480, fields);
        assertEquals(480, layout.getLength());
        assertEquals(35, fields.size());
    }
}
