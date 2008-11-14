package commonline.cl4.changesend.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;

import java.util.List;


public class LoanPeriodChangeRecordLayoutTest extends CommonLineRecordLayoutTestCase {
    public void test() {
        LoanPeriodChangeRecordLayout layout = new LoanPeriodChangeRecordLayout();

        assertEquals("@107", layout.getCode());

        List fields = layout.getFieldDefinitions();
        int i = 1;

        assertRecordCodeField(fields);
        assertFixedNumberField("Record Type", 3, 2, fields.get(i++));
        assertFixedNumberField("Borrower SSN", 5, 9, fields.get(i++));
        assertFixedNumberField("School ID", 14, 8, fields.get(i++));
        assertFillerField(22, 3, fields.get(i++));
        assertFixedTextField("School Non-ED Branch Id", 25, 4, fields.get(i++));
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
        assertFixedNumberField("Loan Period Begin Date (CCYYMMDD)", 93, 8, fields.get(i++));
        assertFixedNumberField("Loan Period End Date (CCYYMMDD)", 101, 8, fields.get(i++));
        assertFixedTextField("School Designated Branch/Division Code", 109, 2, fields.get(i++));
        assertFixedNumberField("PLUS/Alternative Student SSN", 111, 9, fields.get(i++));
        assertFixedTextField("CommonLine Unique Identifier", 120, 17, fields.get(i++));
        assertFixedNumberField("CommonLine Loan Sequence Number", 137, 2, fields.get(i++));
        assertFixedNumberField("Revised Loan Period Begin Date (CCYYMMDD)", 139, 8, fields.get(i++));
        assertFixedNumberField("Revised Loan Period End Date (CCYYMMDD)", 147, 8, fields.get(i++));
        assertFixedTextField("Grade Level Code", 155, 1, fields.get(i++));
        assertFixedNumberField("Change Certification Date (CCYYMMDD)", 156, 8, fields.get(i++));
        assertFillerField(164, 1, fields.get(i++));
        assertFixedNumberField("Anticipated Completion Date (CCYYMMDD)", 165, 8, fields.get(i++));
        assertFixedTextField("Record Status", 173, 1, fields.get(i++));
        assertFixedNumberField("Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 174, 20, fields.get(i++));
        assertFixedTextField("DUNS School ID", 194, 9, fields.get(i++));
        assertFixedTextField("DUNS Recipient ID", 203, 9, fields.get(i++));
        assertFixedTextField("DUNS Lender ID", 212, 9, fields.get(i++));
        assertFixedTextField("DUNS Servicer ID", 221, 9, fields.get(i++));
        assertFixedTextField("Lender Non-ED Branch ID", 230, 4, fields.get(i++));
        assertFillerField(234, 100, fields.get(i++));
        assertTextField("School Use Only", 334, 23, fields.get(i++));
        assertTextField("Lender Use Only", 357, 20, fields.get(i++));
        assertTextField("Guarantor Use Only", 377, 23, fields.get(i++));
        assertFillerField(400, 80, fields.get(i++));

        assertRecordTerminatorField(480, layout.getFieldDefinitions());

        assertEquals(480, layout.getLength());
        assertEquals(41, layout.getFieldDefinitions().size());
    }
}
