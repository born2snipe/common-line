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

    protected void defineFields() {
        field("2", "Unique Supplemental Vendor Code", "X(4)");
        field("3", "Unique Supplemental Layout Identifier Code", "X(2)");
        field("4", "Filler", "X(1031)");
        recordTerminator("5");
    }

    public String getCode() {
        return "@2";
    }

}
