package commonline.cl4.response.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * Supplemental Borrower Information Response (@7) Detail Record(s) Addendum
 */
public class SupplementalBorrowerInformationRecordLayout extends AbstractCommonLineRecordLayout {

    public SupplementalBorrowerInformationRecordLayout() {
        super();
        fixedText("Supplemental Borrower Information Layout Owner Code", 4);
        fixedText("Supplemental Borrower Information Layout Identifier Code", 2);
        text("E-mail Address", 256);
        text("E-mail Address Validity Indicator", 1);
        fixedNumber("E-mail Address Effective Date (CCYYMMDD)", 8);
        text("Temporary Borrower Address (line 1)", 30);
        text("Temporary Borrower Address (line 2)", 30);
        text("Temporary Borrower City", 24);
        fixedText("Temporary Borrower State", 2);
        fixedNumber("Temporary Borrower Zip Code", 5);
        fixedNumber("Temporary Borrower Zip Code Suffix", 4);
        text("Foreign Postal Code", 14);
        filler(657);
    }

    public String getCode() {
        return "@7";
    }

}
