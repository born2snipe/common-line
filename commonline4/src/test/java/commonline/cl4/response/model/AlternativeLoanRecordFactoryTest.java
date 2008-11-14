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

        fields.addAll(Arrays.asList(new String[]{
            "@4",
            "ownerCode",
            "identifierCode",
            "01234",
            "00123",
            "00012",
            "00001",
            "00000",
            "1234567",
            "Y",
            "c1LastName",
            "c1FirstName",
            "c1MI",
            "123456789",
            "0",
            "c1Line1",
            "c1Line2",
            "c1City",
            "filler",
            "c1State",
            "12345",
            "1234",
            "1234567890",
            "1",
            "c2LastName",
            "c2FirstName",
            "c2MI",
            "223456789",
            "7",
            "c2Line1",
            "c2Line2",
            "c2City",
            "filler",
            "c2State",
            "12345",
            "1234",
            "1234567890",
            "2",
            "0000012",
            "0011",
            "1000012",
            "1011",
            "2000012",
            "2011",
            "c1ForeignPostal",
            "c2ForeignPostal",
            "studentMajor",
            "19700120",
            "c1State",
            "c1DLNumber",
            "19600120",
            "c2State",
            "c2DLNumber",
            "filler",
            "studentSchoolPhone",
            "c1Relationship",
            "c1Suffix",
            "10",
            "c2Relationship",
            "c2Suffix",
            "20",
            "X",
            "repaymentOptionCode",
            "filler",
            "*",
            "\r\n"
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
