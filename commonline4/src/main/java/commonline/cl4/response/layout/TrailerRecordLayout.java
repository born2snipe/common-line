package commonline.cl4.response.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * Trailer
 */
public class TrailerRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        number("Response (@1) Detail Record Count", 6);
        number("Unique Supplemental (@2) Detail Record Count", 6);
        number("Special Messages (@3) Detail Record Count", 6);
        fixedNumber("File Creation Date (CCYYMMDD)", 8);
        fixedNumber("File Creation Time (HHMMSS)", 6);
        fixedText("File Identifier Code", 5);
        text("Recipient Name", 32);
        text("Recipient ID", 8);
        filler(2);
        text("Recipient Non-ED Branch ID", 4);
        text("Source Name", 32);
        text("Source ID", 8);
        filler(2);
        text("Source Non-ED Branch ID", 4);
        number("Alternative Loan Response (@4) Detail Record Count", 6);
        number("Reference Response (@5) Detail Record Count", 6);
        number("Change Transaction Error (@6) Detail Record Count", 6);
        number("Supplemental Borrower Information Response (@7) Detail Record Count", 6);
        fixedText("DUNS Recipient ID", 9);
        fixedText("DUNS Source ID", 9);
        filler(866);
    }

    public String getCode() {
        return "@T";
    }
}
