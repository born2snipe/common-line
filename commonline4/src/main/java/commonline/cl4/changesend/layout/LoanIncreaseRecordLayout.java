package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class LoanIncreaseRecordLayout extends AbstractCommonLineRecordLayout {
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
        field("23", "Increased Loan Amount", "9(006)");
        field("24", "Revised Certification Amount", "9(006)");
        field("25", "Cost of Attendance", "9(005)");
        field("26", "Expected Family Contribution Amount", "9(005)");
        field("27", "Estimated Financial Aid Amount", "9(005)");
        field("28", "Disbursement Date 1 (CCYYMMDD)", "9(008)");
        field("29", "Disbursement Amount 1", "9(006)V99");
        field("30", "Disbursement Date 2 (CCYYMMDD)", "9(008)");
        field("31", "Disbursement Amount 2", "9(006)V99");
        field("32", "Disbursement Date 3 (CCYYMMDD)", "9(008)");
        field("33", "Disbursement Amount 3", "9(006)V99");
        field("34", "Disbursement Date 4 (CCYYMMDD)", "9(008)");
        field("35", "Disbursement Amount 4", "9(006)V99");
        field("36", "Record Status", "X(001)");
        field("37", "Change Certification Date(CCYYMMDD)", "9(008)");
        field("38", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(020)");
        field("39", "DUNS School ID", "X(009)");
        field("40", "DUNS Recipient ID", "X(009)");
        field("41", "DUNS Lender ID", "X(009)");
        field("42", "DUNS Servicer Code", "X(009)");
        field("43", "Lender Non-ED Branch ID", "X(004)");
        field("44", "Submittal As-Of Date", "9(008)");
        field("45", "Disbursement Identification Number 1", "9(002)");
        field("46", "Disbursement Identification Number 2", "9(002)");
        field("47", "Disbursement Identification Number 3", "9(002)");
        field("48", "Disbursement Identification Number 4", "9(002)");
        field("49", "Filler", "X(019)");
        field("50", "School Use Only", "X(023)");
        field("51", "Lender Use Only", "X(020)");
        field("52", "Guarantor Use Only", "X(023)");
        field("53", "Filler", "X(080)");
        recordTerminator("54");
    }

    public String getCode() {
        return "@124";
    }
}
