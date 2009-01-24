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

    protected void defineFields() {
        field("2", "Supplemental Borrower Information Layout Owner Code R", "X(004)");
        field("3", "Supplemental Borrower Information Layout Identifier Code R", "X(002)");
        field("4", "E-mail Address R1", "X(256)");
        field("5", "E-mail Address Validity Indicator R", "X(001)");
        field("6", "E-mail Address Effective Date(CCYYMMDD)", "9(008)");
        field("7", "Temporary Borrower Address(line 1)", "X(030)");
        field("8", "Temporary Borrower Address(line 2)", "X(030)");
        field("9", "Temporary Borrower City R1", "X(024)");
        field("10", "Temporary Borrower State R1", "X(002)");
        field("11", "Temporary Borrower Zip Code R1", "9(005)");
        field("12", "Temporary Borrower Zip Code Suffix R 1", "9(004)");
        field("13", "Foreign Postal Code R1", "X(014)");
        field("14", "Filler", "X(657)");
        recordTerminator("15");
    }

    public String getCode() {
        return "@7";
    }

}
