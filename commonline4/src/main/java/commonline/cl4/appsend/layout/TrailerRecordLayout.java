package commonline.cl4.appsend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine� Network for FFELP and Alternative Loans
 * <p/>
 * Application Send File
 * <p/>
 * Trailer (@T) Detail Record(s) Addendum
 */
public class TrailerRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Application Send (@1) Detail Record Count", "9(006)");
        field("3", "Unique Supplemental (@2) Detail Record Count", "9(006)");
        field("4", "File Creation Date (CCYYMMDD)", "9(008)");
        field("5", "File Creation Time (HHMMSS)", "9(006)");
        field("6", "File Identifier Code", "X(005)");
        field("7", "Source Name", "X(032)");
        field("8", "Source ID", "X(008)");
        field("9", "Filler", "X(002)");
        field("10", "Source Non-ED Branch ID", "X(004)");
        field("11", "Recipient Name", "X(032)");
        field("12", "Recipient ID", "X(008)");
        field("13", "Filler", "X(002)");
        field("14", "Recipient Non-ED Branch ID", "X(004)");
        field("15", "Alternative Loan (@4) Detail Record Count", "9(006)");
        field("16", "Reference (@5) Detail Record Count", "9(006)");
        field("17", "Supplemental Borrower Information (@7) Record Count", "9(006)");
        field("18", "DUNS Source ID", "X(009)");
        field("19", "DUNS Recipient ID", "X(009)");
        field("20", "Filler", "X(718)");
        recordTerminator("21");
    }

    public String getCode() {
        return "@T";
    }
}