package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * BORROWER (@1-02) DETAIL RECORD(S)
 */
public class BorrowerDetailRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        fixedNumber("Record Type", 2);
        fixedNumber("Borrower SSN", 9);
        fixedNumber("School ID", 8);
        filler(3);
        fixedText("School Non-ED Branch ID", 4);
        text("Recipient ID", 8);
        filler(3);
        text("Recipient Non-ED Branch ID", 4);
        filler(12);
        text("Borrower Last Name", 35);
        text("Borrower First Name", 12);
        fixedText("Borrower Middle Initial", 1);
        fixedNumber("Borrower Date of Birth (CCYYMMDD)", 8);
        fixedText("Record Status", 1);
        fixedText("Date/Time Stamp (CCYYMMDDHHMMSSNNNNNN)", 20);
        fixedText("DUNS School ID", 9);
        fixedText("DUNS Recipient ID", 9);
        filler(183);
        fixedText("School Use Only", 23);
        fixedText("Lender Use Only", 20);
        fixedText("Guarantor Use Only", 23);
        filler(80);
    }

    public String getCode() {
        return "@102";
    }

}
