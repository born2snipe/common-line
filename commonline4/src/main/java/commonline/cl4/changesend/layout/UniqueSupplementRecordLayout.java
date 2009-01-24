package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class UniqueSupplementRecordLayout extends AbstractCommonLineRecordLayout {
    
    protected void defineFields() {
        field("2", "Unique Supplemental Vendor Code R1", "X(004)");
        field("3", "Unique Supplemental Layout Identifier Code R 1", "X(002)");
        field("4", "Filler", "X(471)");
        recordTerminator("5");
    }

    public String getCode() {
        return "@2";
    }
}
