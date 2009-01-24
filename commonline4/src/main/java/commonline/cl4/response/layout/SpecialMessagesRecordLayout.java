package commonline.cl4.response.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * SPECIAL MESSAGES (@3) DETAIL RECORD(S)
 */
public class SpecialMessagesRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        field("2", "Message 1", "X(160)");
        field("3", "Message 2", "X(160)");
        field("4", "Message 3", "X(160)");
        field("5", "Message 4", "X(160)");
        field("6", "Message 5", "X(160)");
        field("7", "Filler", "X(237)");
        recordTerminator("8");
    }

    public String getCode() {
        return "@3";
    }
}
