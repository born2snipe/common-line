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
        field("23", "Cancellation Date (CCYYMMDD)", "9(008)");
        field("24", "Reinstated Loan Amount", "9(006)V99");
        field("25", "Record Status", "X(001)");
        field("26", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(020)");
        field("27", "DUNS School ID", "X(009)");
        field("28", "DUNS Recipient ID", "X(009)");
        field("29", "DUNS Lender ID", "X(009)");
        field("30", "DUNS Servicer Code", "X(009)");
        field("31", "Filler", "X(202)");
        field("32", "School Use Only", "X(023)");
        field("33", "Lender Use Only", "X(020)");
        field("34", "Guarantor Use Only", "X(023)");
        recordTerminator("35");
    }

    public String getCode() {
        return "@108";
    }
}
