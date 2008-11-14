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

    public SpecialMessagesRecordLayout() {
        text("Message 1", 160);
        text("Message 2", 160);
        text("Message 3", 160);
        text("Message 4", 160);
        text("Message 5", 160);
        filler(237);
    }

    public String getCode() {
        return "@3";
    }
}
