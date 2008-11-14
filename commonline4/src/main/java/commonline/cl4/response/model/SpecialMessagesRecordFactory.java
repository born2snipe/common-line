package commonline.cl4.response.model;

import commonline.core.model.CommonlineRecordFactory;

import java.util.List;

import flapjack.layout.RecordLayout;


public class SpecialMessagesRecordFactory extends CommonlineRecordFactory {
    public Object build(Object obj, RecordLayout recordLayout) {
        List fields = (List) obj;
        SpecialMessages messages = new SpecialMessages();
        int i=1;
        messages.setMessage1(text(fields.get(i++)));
        messages.setMessage2(text(fields.get(i++)));
        messages.setMessage3(text(fields.get(i++)));
        messages.setMessage4(text(fields.get(i++)));
        messages.setMessage5(text(fields.get(i++)));
        return messages;
    }
}
