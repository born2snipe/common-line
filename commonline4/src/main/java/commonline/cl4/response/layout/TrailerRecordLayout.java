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
        field("2", "Response (@1) Detail Record Count", "9(006)");
        field("3", "Unique Supplemental (@2) Detail Record Count", "9(006)");
        field("4", "Special Messages (@3) Detail Record Count", "9(006)");
        field("5", "File Creation Date (CCYYMMDD)", "9(008)");
        field("6", "File Creation Time (HHMMSS)", "9(006)");
        field("7", "File Identifier Code", "X(005)");
        field("8", "Recipient Name", "X(032)");
        field("9", "Recipient ID", "X(008)");
        field("10", "Filler", "X(002)");
        field("11", "Recipient Non-ED Branch ID", "X(004)");
        field("12", "Source Name", "X(032)");
        field("13", "Source ID", "X(008)");
        field("14", "Filler", "X(002)");
        field("15", "Source Non-ED Branch ID", "X(004)");
        field("16", "Alternative Loan Response (@4) Detail Record Count", "9(006)");
        field("17", "Reference Response (@5) Detail Record Count", "9(006)");
        field("18", "Change Transaction Error (@6) Detail Record Count", "9(006)");
        field("19", "Supplemental Borrower Information Response (@7) Detail Record Count", "9(006)");
        field("20", "DUNS Recipient ID", "X(009)");
        field("21", "DUNS Source ID", "X(009)");
        field("22", "Filler", "X(866)");
        recordTerminator("23");
    }

    public String getCode() {
        return "@T";
    }
}
