package commonline.cl4.response.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;


public class AlternativeLoanRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        AlternativeLoanRecordLayout layout = new AlternativeLoanRecordLayout();

        assertEquals("@4", layout.getCode());
        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertFixedTextField("Alternative Loan Layout Owner Code", 3, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Alternative Loan Layout Identifier Code", 7, 2, layout.getFieldDefinitions().get(i++));
        assertNumberField("Federal Stafford Loan Debt", 9, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Federal SLS Debt", 14, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("HEAL Debt", 19, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Perkins Debt", 25, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Other Debt", 30, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Other Loans this Period", 36, 7, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Credit Under Different Name Code", 43, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 Last Name", 44, 35, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 First Name", 79, 12, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 Middle Initial", 91, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 SSN", 92, 9, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 U.S. Citizenship", 101, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 Address (line 1)", 102, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 Address (line 2)", 132, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 City", 162, 24, layout.getFieldDefinitions().get(i++));
        assertFillerField(186, 6, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 State", 192, 2, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 Zip Code", 194, 5, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 Zip Code Suffix", 199, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 Telephone Number", 203, 10, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 Signature Code", 213, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 Last Name", 214, 35, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 First Name", 249, 12, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 Middle Initial", 261, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 SSN", 262, 9, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 U.S. Citizenship", 271, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 Address (line 1)", 272, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 Address (line 2)", 302, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 City", 332, 24, layout.getFieldDefinitions().get(i++));
        assertFillerField(356, 6, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 State", 362, 2, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 Zip Code", 364, 5, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 Zip Code Suffix", 369, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 Telephone Number", 373, 10, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 Signature Code", 383, 1, layout.getFieldDefinitions().get(i++));
        assertNumberField("Borrower Gross Annual Salary", 384, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Borrower Other Income", 391, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Cosigner 1 Gross Annual Salary", 398, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Cosigner 1 Other Income", 405, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Cosigner 2 Gross Annual Salary", 412, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Cosigner 2 Other Income", 419, 7, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 Foreign Postal Code", 426, 14, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 Foreign Postal Code", 440, 14, layout.getFieldDefinitions().get(i++));
        assertTextField("Student Major", 454, 15, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Cosigner 1 Date of Birth", 469, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 Driver’s License State", 477, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 Driver’s License Number", 479, 20, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Cosigner 2 Date of Birth", 499, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 Driver’s License State", 507, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 Driver’s License Number", 509, 20, layout.getFieldDefinitions().get(i++));
        assertFillerField(529, 20, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Student School Phone", 549, 10, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 1 Relationship to Student", 559, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 1 Suffix", 560, 3, layout.getFieldDefinitions().get(i++));
        assertNumberField("Cosigner 1 Years at Address", 563, 2, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Cosigner 2 Relationship to Student", 565, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Cosigner 2 Suffix", 566, 3, layout.getFieldDefinitions().get(i++));
        assertNumberField("Cosigner 2 Years at Address", 569, 2, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Interest Rate Option", 571, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Repayment Option Code", 572, 1, layout.getFieldDefinitions().get(i++));
        assertFillerField(573, 467, layout.getFieldDefinitions().get(i));
        assertRecordTerminatorField(1040, layout.getFieldDefinitions());

        assertEquals(1040, layout.getLength());
        assertEquals(65, layout.getFieldDefinitions().size());
    }


}
