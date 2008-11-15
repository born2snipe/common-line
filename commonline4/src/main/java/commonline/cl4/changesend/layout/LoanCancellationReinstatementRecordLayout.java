package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * LOAN CANCELLATION/REINSTATEMENT (@1-08) DETAIL RECORD(S)
 */
public class LoanCancellationReinstatementRecordLayout extends AbstractCommonLineRecordLayout {
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
        fixedNumber("Loan Period Begin Date", 8);
        fixedNumber("Loan Period End Date", 8);
        fixedText("School Designated Branch/Division Code", 2);
        fixedNumber("PLUS/Alternative Student SSN", 9);
        fixedText("CommonLine Unique Identifier", 17);
        fixedNumber("CommonLine Loan Sequence Number", 2);
        fixedNumber("Cancellation Date (CCYYMMDD)", 8);
        fixedNumber("Reinstated Loan Amount", 8);
        fixedText("Record Status", 1);
        fixedText("Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 20);
        fixedText("DUNS School ID", 9);
        fixedText("DUNS Recipient ID", 9);
        fixedText("DUNS Lender ID", 9);
        fixedText("DUNS Servicer ID", 9);
        filler(202);
        text("School Use Only", 23);
        text("Lender Use Only", 20);
        text("Guarantor Use Only", 23);
    }

    public String getCode() {
        return "@108";
    }
}
