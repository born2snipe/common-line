package commonline.cl4.response.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Response File
 * <p/>
 * UNIQUE SUPPLEMENTAL (@2) DETAIL RECORD(S)
 */
public class UniqueSupplementDetailRecordLayout extends AbstractCommonLineRecordLayout {

    public UniqueSupplementDetailRecordLayout() {
        text("Unique Supplemental Vendor Code", 4);
        fixedText("Unique Supplemental Layout Identifier Code", 2);
        filler(1031);
    }

    public String getCode() {
        return "@2";
    }
}
