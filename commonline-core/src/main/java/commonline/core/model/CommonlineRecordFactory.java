package commonline.core.model;

import flapjack.model.RecordFactory;
import flapjack.util.TypeConverter;
import flapjack.util.DateValueConverter;
import flapjack.util.ValueConverter;

import java.util.Date;


public abstract class CommonlineRecordFactory implements RecordFactory {
    private TypeConverter typeConverter = new TypeConverter();

    protected CommonlineRecordFactory() {
        registerConverter(new DateValueConverter(new String[]{"yyyyMMddhhmmss", "yyyyMMdd"}));
    }

    private void registerConverter(ValueConverter converter) {
        typeConverter.registerConverter(converter);
    }
    
    protected Date date(Object obj, Object obj2) {
        return date(text(obj) + text(obj2));
    }

    protected Date date(Object obj) {
        return (Date) typeConverter.convert(Date.class, text(obj));
    }

    protected String text(Object obj) {
        return ((String) obj).trim();
    }

    protected int number(Object obj) {
        return ((Integer)typeConverter.convert(Integer.class, text(obj))).intValue();
    }
}
