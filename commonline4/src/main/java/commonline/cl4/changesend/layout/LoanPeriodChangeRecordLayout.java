package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * LOAN PERIOD CHANGE (@1-07) DETAIL RECORD(S)
 */
public class LoanPeriodChangeRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        field("2", "Record Type R", "9(002)");
        field("3", "Borrower SSN R", "9(009)");
        field("4", "School ID R", "9(008)");
        field("5", "Filler", "X(003)");
        field("6", "School Non-ED Branch ID", "X(004)");
        field("7", "Recipient ID R", "X(008)");
        field("8", "Filler", "X(003)");
        field("9", "Recipient Non-ED Branch ID R1", "X(004)");
        field("10", "Unique Loan Identifier", "X(016)");
        field("11", "Guarantee Date (CCYYMMDD)", "9(008)");
        field("12", "Loan Type Code R", "X(002)");
        field("13", "Alternative Loan Program Type Code R1", "X(003)");
        field("14", "First Disbursement Date(CCYYMMDD)", "9(008)");
        field("15", "Lender ID R", "X(006)");
        field("16", "Servicer Code", "X(006)");
        field("17", "Loan Period Begin Date (CCYYMMDD)", "9(008)");
        field("18", "Loan Period End Date (CCYYMMDD)", "9(008)");
        field("19", "School Designated Branch/Division Code", "X(002)");
        field("20", "PLUS/Alternative Student SSN", "9(009)");
        field("21", "CommonLine Unique Identifier R", "X(017)");
        field("22", "CommonLine Loan Sequence Number R1", "9(002)");
        field("23", "Revised Loan Period Begin Date(CCYYMMDD)", "9(008)");
        field("24", "Revised Loan Period End Date(CCYYMMDD)", "9(008)");
        field("25", "Grade Level Code R", "X(001)");
        field("26", "Change Certification Date(CCYYMMDD)", "9(008)");
        field("27", "Filler", "X(001)");
        field("28", "Anticipated Completion Date(CCYYMMDD)", "9(008)");
        field("29", "Record Status", "X(001)");
        field("30", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(020)");
        field("31", "DUNS School ID O", "X(009)");
        field("32", "DUNS Recipient ID O", "X(009)");
        field("33", "DUNS Lender ID O", "X(009)");
        field("34", "DUNS Servicer Code", "X(009)");
        field("35", "Lender Non-ED Branch ID", "X(004)");
        field("36", "Filler", "X(100)");
        field("37", "School Use Only O", "X(023)");
        field("38", "Lender Use Only O", "X(020)");
        field("39", "Guarantor Use Only O", "X(023)");
        field("40", "Filler", "X(080)");
        recordTerminator("41");
    }

    public String getCode() {
        return "@107";
    }
}
