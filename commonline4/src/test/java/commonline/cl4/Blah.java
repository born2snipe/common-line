package commonline.cl4;

import commonline.cl4.changesend.layout.TrailerRecordLayout;
import commonline.cl4.changesend.layout.LoanPeriodChangeRecordLayout;
import commonline.cl4.response.layout.SupplementalBorrowerInformationRecordLayout;
import commonline.core.layout.DecimalFieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;
import commonline.core.layout.NewCommonlineFieldDefinition;
import commonline.core.layout.TextFieldDefinition;
import flapjack.layout.RecordLayout;

import java.util.Iterator;


public class Blah {
    public static void main(String args[]) {
        RecordLayout layout = new SupplementalBorrowerInformationRecordLayout();

        Iterator it = layout.getFieldDefinitions().iterator();
        while (it.hasNext()) {
            NewCommonlineFieldDefinition fieldDef = (NewCommonlineFieldDefinition) it.next();
            if (fieldDef instanceof DecimalFieldDefinition) {
                System.out.print("assertDecimal(");
            } else if (fieldDef instanceof IntegerFieldDefinition) {
                System.out.print("assertInteger(");
            } else if (fieldDef instanceof TextFieldDefinition) {
                System.out.print("assertText(");
            }

            System.out.print("\"" + fieldDef.getId() + "\", ");
            System.out.print("\"" + fieldDef.getName() + "\", ");
            System.out.print((fieldDef.getPosition() + 1) + ", ");
            System.out.println(fieldDef.getLength() + ");");
        }
    }
}
