package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * DISBURSEMENT CANCELLATION/CHANGE (@1-09) DETAIL RECORD(S)
 */
public class DisbursementCancellationChangeDetailRecordLayout extends AbstractCommonLineRecordLayout{
    protected void defineFields() {
        fixedNumber("Record Type", 2);
        fixedNumber("Borrower SSN", 9);
        fixedNumber("School ID", 8);
        filler(3);
        fixedText("School Non-ED Branch ID", 4);
        text("Recipient ID", 8);
        filler(3);
        text("Recipient Non-ED Branch ID", 4);
        fixedText("Unique Loan Identifier", 16);
        fixedNumber("Guarantee Date (CCYYMMDD)", 8);
        fixedText("Loan Type Code", 2);
        fixedText("Alternative Loan Program Type Code", 3);
        fixedNumber("First Disbursement Date (CCYYMMDD)", 8);
        fixedText("Lender ID", 6);
        fixedText("Servicer Code", 6);
    }

    public String getCode() {
        return "@109";
    }
}
