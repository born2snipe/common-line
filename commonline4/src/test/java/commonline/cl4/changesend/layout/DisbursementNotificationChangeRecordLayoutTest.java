package commonline.cl4.changesend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class DisbursementNotificationChangeRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new DisbursementNotificationChangeRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 50;
    }

    protected String recordCode() {
        return "@110";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type", 3, 2);
        assertInteger("3", "Borrower SSN", 5, 9);
        assertInteger("4", "School ID", 14, 8);
        assertText("5", "Filler", 22, 3);
        assertText("6", "School Non-ED Branch ID", 25, 4);
        assertText("7", "Recipient ID", 29, 8);
        assertText("8", "Filler", 37, 3);
        assertText("9", "Recipient Non-ED Branch ID", 40, 4);
        assertText("10", "Unique Loan Identifier", 44, 16);
        assertInteger("11", "Guarantee Date (CCYYMMDD)", 60, 8);
        assertText("12", "Loan Type Code", 68, 2);
        assertText("13", "Alternative Loan Program Type Code", 70, 3);
        assertInteger("14", "First Disbursement Date(CCYYMMDD)", 73, 8);
        assertText("15", "Lender ID", 81, 6);
        assertText("16", "Servicer Code", 87, 6);
        assertInteger("17", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertInteger("18", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("19", "School Designated Branch/Division Code", 109, 2);
        assertInteger("20", "PLUS/Alternative Student SSN", 111, 9);
        assertText("21", "CommonLine Unique Identifier", 120, 17);
        assertInteger("22", "CommonLine Loan Sequence Number", 137, 2);
        assertText("23", "Disbursement Number", 139, 1);
        assertInteger("24", "Disbursement Number", 140, 1);
        assertInteger("25", "Disbursement Identifier Date (CCYYMMDD)", 141, 8);
        assertInteger("26", "Disbursement Date (CCYYMMDD)", 149, 8);
        assertDecimal("27", "Gross Disbursement Amount", 157, 8);
        assertInteger("28", "Cancellation Date (CCYYMMDD)", 165, 8);
        assertDecimal("29", "Cancellation Amount", 173, 8);
        assertText("30", "Disbursement Consummation Indicator Code", 181, 1);
        assertDecimal("31", "Actual Returned Amount", 182, 8);
        assertText("32", "Funds Return Method Code", 190, 1);
        assertText("33", "Funds Reissue Indicator Code", 191, 1);
        assertInteger("34", "Revised Disbursement Date(CCYYMMDD)", 192, 8);
        assertDecimal("35", "Revised Disbursement Amount", 200, 8);
        assertText("36", "Reinstatement Indicator Code", 208, 1);
        assertText("37", "Record Status", 209, 1);
        assertText("38", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 210, 20);
        assertText("39", "DUNS School ID", 230, 9);
        assertText("40", "DUNS Recipient ID", 239, 9);
        assertText("41", "DUNS Lender ID", 248, 9);
        assertText("42", "DUNS Servicer Code", 257, 9);
        assertText("43", "Lender Non-Ed Branch ID", 266, 4);
        assertInteger("44", "Submittal As-Of Date", 270, 8);
        assertText("45", "Filler", 278, 56);
        assertText("46", "School Use Only", 334, 23);
        assertText("47", "Lender Use Only", 357, 20);
        assertText("48", "Guarantor Use Only", 377, 23);
        assertText("49", "Filler", 400, 80);
        assertText("50", "Record Terminator", 480, 1);
    }
}
