package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class TrailerRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "@1 Detail Record Count", "9(006)");
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
        field("15", "DUNS Source ID", "X(009)");
        field("16", "DUNS Recipient ID", "X(009)");
        field("17", "Filler", "X(336)");
        recordTerminator("18");
    }

    public String getCode() {
        return "@T";
    }
}
