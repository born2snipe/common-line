package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import commonline.test.util.DateUtil;

public class AlternativeLoanRecordFactoryTest extends TestCase {
    private List fields;
    private AlternativeLoanRecordFactory factory;

    public void setUp() {
        factory = new AlternativeLoanRecordFactory();
        fields = new ArrayList();

        fields.addAll(Arrays.asList(new byte[][]{
            "@4".getBytes(),
            "ownerCode".getBytes(),
            "identifierCode".getBytes(),
            "01234".getBytes(),
            "00123".getBytes(),
            "00012".getBytes(),
            "00001".getBytes(),
            "00000".getBytes(),
            "1234567".getBytes(),
            "Y".getBytes(),
            "c1LastName".getBytes(),
            "c1FirstName".getBytes(),
            "c1MI".getBytes(),
            "123456789".getBytes(),
            "0".getBytes(),
            "c1Line1".getBytes(),
            "c1Line2".getBytes(),
            "c1City".getBytes(),
            "filler".getBytes(),
            "c1State".getBytes(),
            "12345".getBytes(),
            "1234".getBytes(),
            "1234567890".getBytes(),
            "1".getBytes(),
            "c2LastName".getBytes(),
            "c2FirstName".getBytes(),
            "c2MI".getBytes(),
            "223456789".getBytes(),
            "7".getBytes(),
            "c2Line1".getBytes(),
            "c2Line2".getBytes(),
            "c2City".getBytes(),
            "filler".getBytes(),
            "c2State".getBytes(),
            "12345".getBytes(),
            "1234".getBytes(),
            "1234567890".getBytes(),
            "2".getBytes(),
            "0000012".getBytes(),
            "0011".getBytes(),
            "1000012".getBytes(),
            "1011".getBytes(),
            "2000012".getBytes(),
            "2011".getBytes(),
            "c1ForeignPostal".getBytes(),
            "c2ForeignPostal".getBytes(),
            "studentMajor".getBytes(),
            "19700120".getBytes(),
            "c1State".getBytes(),
            "c1DLNumber".getBytes(),
            "19600120".getBytes(),
            "c2State".getBytes(),
            "c2DLNumber".getBytes(),
            "filler".getBytes(),
            "studentSchoolPhone".getBytes(),
            "c1Relationship".getBytes(),
            "c1Suffix".getBytes(),
            "10".getBytes(),
            "c2Relationship".getBytes(),
            "c2Suffix".getBytes(),
            "20".getBytes(),
            "X".getBytes(),
            "repaymentOptionCode".getBytes(),
            "filler".getBytes(),
            "*".getBytes(),
            "\r\n".getBytes()
        }));
    }
    
    public void test() {
        Object obj = factory.build(fields, null);
        assertNotNull(obj);
        assertTrue(obj instanceof AlternativeLoan);

        AlternativeLoan loan = (AlternativeLoan) obj;

        assertEquals("ownerCode", loan.getAlternativeLoanLayoutOwnerCode());
        assertEquals("identifierCode", loan.getAlternativeLoanLayoutIdentfierCode());
        assertEquals(1234, loan.getFederalStaffordLoanDebt());
        assertEquals(123, loan.getFederalSlsDebt());
        assertEquals(12, loan.getHealDebt());
        assertEquals(1, loan.getPerkinsDebt());
        assertEquals(0, loan.getOtherDebt());
        assertEquals(1234567, loan.getOtherLoansThisPeriod());
        assertEquals("Y", loan.getCreditUnderDifferentNameCode());
        assertEquals("c1LastName", loan.getCosigner1LastName());
        assertEquals("c1FirstName", loan.getCosigner1FirstName());
        assertEquals("c1MI", loan.getCosigner1MiddleInitial());
        assertEquals("123456789", loan.getCosigner1Ssn());
        assertEquals("0", loan.getCosigner1UsCitizenshipStatusCode());
        assertEquals("c1Line1", loan.getCosigner1AddressLine1());
        assertEquals("c1Line2", loan.getCosigner1AddressLine2());
        assertEquals("c1City", loan.getCosigner1City());
        assertEquals("c1State", loan.getCosigner1State());
        assertEquals(12345, loan.getCosigner1ZipCode());
        assertEquals(1234, loan.getCosigner1ZipCodeSuffix());
        assertEquals("1234567890", loan.getCosigner1TelephoneNumber());
        assertEquals("1", loan.getCosigner1SignatureCode());
        assertEquals("c2LastName", loan.getCosigner2LastName());
        assertEquals("c2FirstName", loan.getCosigner2FirstName());
        assertEquals("c2MI", loan.getCosigner2MiddleInitial());
        assertEquals("223456789", loan.getCosigner2Ssn());
        assertEquals("7", loan.getCosigner2UsCitizenshipStatusCode());
        assertEquals("c2Line1", loan.getCosigner2AddressLine1());
        assertEquals("c2Line2", loan.getCosigner2AddressLine2());
        assertEquals("c2City", loan.getCosigner2City());
        assertEquals("c2State", loan.getCosigner2State());
        assertEquals(12345, loan.getCosigner2ZipCode());
        assertEquals(1234, loan.getCosigner2ZipCodeSuffix());
        assertEquals("1234567890", loan.getCosigner2TelephoneNumber());
        assertEquals("2", loan.getCosigner2SignatureCode());
        assertEquals(12, loan.getBorrowerGrossAnnualSalary());
        assertEquals(11, loan.getBorrowerOtherIncome());
        assertEquals(1000012, loan.getCosigner1GrossAnnualSalary());
        assertEquals(1011, loan.getCosigner1OtherIncome());
        assertEquals(2000012, loan.getCosigner2GrossAnnualSalary());
        assertEquals(2011, loan.getCosigner2OtherIncome());
        assertEquals("c1ForeignPostal", loan.getCosigner1ForeignPostalCode());
        assertEquals("c2ForeignPostal", loan.getCosigner2ForeignPostalCode());
        assertEquals("studentMajor", loan.getStudentMajor());
        assertEquals(DateUtil.createCommon("01/20/1970"), loan.getCosigner1DateOfBirth());
        assertEquals("c1State", loan.getCosigner1DriversLicenseState());
        assertEquals("c1DLNumber", loan.getCosigner1DriversLicenseNumber());
        assertEquals(DateUtil.createCommon("01/20/1960"), loan.getCosigner2DateOfBirth());
        assertEquals("c2State", loan.getCosigner2DriversLicenseState());
        assertEquals("c2DLNumber", loan.getCosigner2DriversLicenseNumber());
        assertEquals("studentSchoolPhone", loan.getStudentSchoolPhone());
        assertEquals("c1Relationship", loan.getCosigner1RelationshipToStudent());
        assertEquals("c1Suffix", loan.getCosigner1Suffix());
        assertEquals(10, loan.getCosigner1YearsAtAddress());
        assertEquals("c2Relationship", loan.getCosigner2RelationshipToStudent());
        assertEquals("c2Suffix", loan.getCosigner2Suffix());
        assertEquals(20, loan.getCosigner2YearsAtAddress());
        assertEquals("X", loan.getInterestRateOption());
        assertEquals("repaymentOptionCode", loan.getRepaymentOptionCode());
    }
}
