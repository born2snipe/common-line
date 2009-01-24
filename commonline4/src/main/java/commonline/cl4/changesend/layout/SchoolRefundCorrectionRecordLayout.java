package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class SchoolRefundCorrectionRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Record Type", "9(002)");
        field("3", "Borrower SSN", "9(009)");
        field("4", "School ID", "9(008)");
        field("5", "Filler", "X(003)");
        field("6", "School Non-ED Branch ID", "X(004)");
        field("7", "Recipient ID", "X(008)");
        field("8", "Filler", "X(003)");
        field("9", "Recipient Non-ED Branch ID", "X(004)");
        field("10", "Unique Loan Identifier", "X(016)");
        field("11", "Guarantee Date (CCYYMMDD)", "9(008)");
        field("12", "Loan Type Code", "X(002)");
        field("13", "Alternative Loan Program Type Code", "X(003)");
        field("14", "First Disbursement Date(CCYYMMDD)", "9(008)");
        field("15", "Lender ID", "X(006)");
        field("16", "Servicer Code", "X(006)");
        field("17", "Loan Period Begin Date (CCYYMMDD)", "9(008)");
        field("18", "Loan Period End Date (CCYYMMDD)", "9(008)");
        field("19", "School Designated Branch/Division Code", "X(002)");
        field("20", "PLUS/Alternative Student SSN", "9(009)");
        field("21", "CommonLine Unique Identifier", "X(017)");
        field("22", "CommonLine Loan Sequence Number", "9(002)");
        field("23", "Last School Refund Date (CCYYMMDD)", "9(008)");
        field("24", "Cumulative School Refund Amount", "9(006)V99");
        field("25", "Revised School Refund Date", "9(008)");
        field("26", "Revised School Refund Amount", "9(006)V99");
        field("27", "Record Status", "X(001)");
        field("28", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(020)");
        field("29", "DUNS School ID", "X(009)");
        field("30", "DUNS Recipient ID", "X(009)");
        field("31", "DUNS Lender ID", "X(009)");
        field("32", "DUNS Servicer Code", "X(009)");
        field("33", "Filler", "X(186)");
        field("34", "School Use Only", "X(023)");
        field("35", "Lender Use Only", "X(020)");
        field("36", "Guarantor Use Only", "X(023)");
        recordTerminator("37");
    }

    public String getCode() {
        return "@112";
    }
}
