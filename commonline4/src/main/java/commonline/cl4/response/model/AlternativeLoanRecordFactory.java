package commonline.cl4.response.model;

import commonline.core.model.CommonlineRecordFactory;

import java.util.List;

import flapjack.layout.RecordLayout;


public class AlternativeLoanRecordFactory extends CommonlineRecordFactory {
    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        AlternativeLoan loan = new AlternativeLoan();

        int i=1;
        loan.setAlternativeLoanLayoutOwnerCode(text(fields.get(i++)));
        loan.setAlternativeLoanLayoutIdentfierCode(text(fields.get(i++)));
        loan.setFederalStaffordLoanDebt(number(fields.get(i++)));
        loan.setFederalSlsDebt(number(fields.get(i++)));
        loan.setHealDebt(number(fields.get(i++)));
        loan.setPerkinsDebt(number(fields.get(i++)));
        loan.setOtherDebt(number(fields.get(i++)));
        loan.setOtherLoansThisPeriod(number(fields.get(i++)));
        loan.setCreditUnderDifferentNameCode(text(fields.get(i++)));
        loan.setCosigner1LastName(text(fields.get(i++)));
        loan.setCosigner1FirstName(text(fields.get(i++)));
        loan.setCosigner1MiddleInitial(text(fields.get(i++)));
        loan.setCosigner1Ssn(text(fields.get(i++)));
        loan.setCosigner1UsCitizenshipStatusCode(text(fields.get(i++)));
        loan.setCosigner1AddressLine1(text(fields.get(i++)));
        loan.setCosigner1AddressLine2(text(fields.get(i++)));
        loan.setCosigner1City(text(fields.get(i++)));
        i++;
        loan.setCosigner1State(text(fields.get(i++)));
        loan.setCosigner1ZipCode(number(fields.get(i++)));        
        loan.setCosigner1ZipCodeSuffix(number(fields.get(i++)));        
        loan.setCosigner1TelephoneNumber(text(fields.get(i++)));
        loan.setCosigner1SignatureCode(text(fields.get(i++)));
        loan.setCosigner2LastName(text(fields.get(i++)));
        loan.setCosigner2FirstName(text(fields.get(i++)));
        loan.setCosigner2MiddleInitial(text(fields.get(i++)));
        loan.setCosigner2Ssn(text(fields.get(i++)));
        loan.setCosigner2UsCitizenshipStatusCode(text(fields.get(i++)));
        loan.setCosigner2AddressLine1(text(fields.get(i++)));
        loan.setCosigner2AddressLine2(text(fields.get(i++)));
        loan.setCosigner2City(text(fields.get(i++)));
        i++;
        loan.setCosigner2State(text(fields.get(i++)));
        loan.setCosigner2ZipCode(number(fields.get(i++)));
        loan.setCosigner2ZipCodeSuffix(number(fields.get(i++)));
        loan.setCosigner2TelephoneNumber(text(fields.get(i++)));
        loan.setCosigner2SignatureCode(text(fields.get(i++)));
        loan.setBorrowerGrossAnnualSalary(number(fields.get(i++)));
        loan.setBorrowerOtherIncome(number(fields.get(i++)));
        loan.setCosigner1GrossAnnualSalary(number(fields.get(i++)));
        loan.setCosigner1OtherIncome(number(fields.get(i++)));
        loan.setCosigner2GrossAnnualSalary(number(fields.get(i++)));
        loan.setCosigner2OtherIncome(number(fields.get(i++)));
        loan.setCosigner1ForeignPostalCode(text(fields.get(i++)));
        loan.setCosigner2ForeignPostalCode(text(fields.get(i++)));
        loan.setStudentMajor(text(fields.get(i++)));
        loan.setCosigner1DateOfBirth(date(fields.get(i++)));
        loan.setCosigner1DriversLicenseState(text(fields.get(i++)));
        loan.setCosigner1DriversLicenseNumber(text(fields.get(i++)));
        loan.setCosigner2DateOfBirth(date(fields.get(i++)));
        loan.setCosigner2DriversLicenseState(text(fields.get(i++)));
        loan.setCosigner2DriversLicenseNumber(text(fields.get(i++)));
        i++;
        loan.setStudentSchoolPhone(text(fields.get(i++)));
        loan.setCosigner1RelationshipToStudent(text(fields.get(i++)));
        loan.setCosigner1Suffix(text(fields.get(i++)));
        loan.setCosigner1YearsAtAddress(number(fields.get(i++)));
        loan.setCosigner2RelationshipToStudent(text(fields.get(i++)));
        loan.setCosigner2Suffix(text(fields.get(i++)));
        loan.setCosigner2YearsAtAddress(number(fields.get(i++)));
        loan.setInterestRateOption(text(fields.get(i++)));
        loan.setRepaymentOptionCode(text(fields.get(i++)));

        return loan;
    }
}
