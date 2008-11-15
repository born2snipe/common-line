package commonline.cl4.response.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * Alternative Loan Response (@4) Detail Record(s) Addendum
 */
public class AlternativeLoanRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        fixedText("Alternative Loan Layout Owner Code", 4);
        fixedText("Alternative Loan Layout Identifier Code", 2);
        number("Federal Stafford Loan Debt", 5);
        number("Federal SLS Debt", 5);
        number("HEAL Debt", 6);
        number("Perkins Debt", 5);
        number("Other Debt", 6);
        number("Other Loans this Period", 7);
        fixedText("Credit Under Different Name Code", 1);
        text("Cosigner 1 Last Name", 35);
        text("Cosigner 1 First Name", 12);
        fixedText("Cosigner 1 Middle Initial", 1);
        fixedText("Cosigner 1 SSN", 9);
        fixedText("Cosigner 1 U.S. Citizenship", 1);
        text("Cosigner 1 Address (line 1)", 30);
        text("Cosigner 1 Address (line 2)", 30);
        text("Cosigner 1 City", 24);
        filler(6);
        fixedText("Cosigner 1 State", 2);
        fixedText("Cosigner 1 Zip Code", 5);
        fixedText("Cosigner 1 Zip Code Suffix", 4);
        fixedText("Cosigner 1 Telephone Number", 10);
        fixedText("Cosigner 1 Signature Code", 1);
        text("Cosigner 2 Last Name", 35);
        text("Cosigner 2 First Name", 12);
        fixedText("Cosigner 2 Middle Initial", 1);
        fixedText("Cosigner 2 SSN", 9);
        fixedText("Cosigner 2 U.S. Citizenship", 1);
        text("Cosigner 2 Address (line 1)", 30);
        text("Cosigner 2 Address (line 2)", 30);
        text("Cosigner 2 City", 24);
        filler(6);
        fixedText("Cosigner 2 State", 2);
        fixedText("Cosigner 2 Zip Code", 5);
        fixedText("Cosigner 2 Zip Code Suffix", 4);
        fixedText("Cosigner 2 Telephone Number", 10);
        fixedText("Cosigner 2 Signature Code", 1);
        number("Borrower Gross Annual Salary", 7);
        number("Borrower Other Income", 7);
        number("Cosigner 1 Gross Annual Salary", 7);
        number("Cosigner 1 Other Income", 7);
        number("Cosigner 2 Gross Annual Salary", 7);
        number("Cosigner 2 Other Income", 7);
        text("Cosigner 1 Foreign Postal Code", 14);
        text("Cosigner 2 Foreign Postal Code", 14);
        text("Student Major", 15);
        fixedNumber("Cosigner 1 Date of Birth", 8);
        fixedText("Cosigner 1 Driver’s License State", 2);
        text("Cosigner 1 Driver’s License Number", 20);
        fixedNumber("Cosigner 2 Date of Birth", 8);
        fixedText("Cosigner 2 Driver’s License State", 2);
        text("Cosigner 2 Driver’s License Number", 20);
        filler(20);
        fixedText("Student School Phone", 10);
        fixedText("Cosigner 1 Relationship to Student", 1);
        text("Cosigner 1 Suffix", 3);
        number("Cosigner 1 Years at Address", 2);
        fixedText("Cosigner 2 Relationship to Student", 1);
        text("Cosigner 2 Suffix", 3);
        number("Cosigner 2 Years at Address", 2);
        fixedText("Interest Rate Option", 1);
        fixedText("Repayment Option Code", 1);
        filler(467);
    }

    public String getCode() {
        return "@4";
    }
}
