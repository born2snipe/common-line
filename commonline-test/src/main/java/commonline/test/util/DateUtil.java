package commonline.test.util;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class DateUtil {

    public static Date create(String text, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        try {
            return formatter.parse(text);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static Date createCommon(String text) {
        return create(text, "MM/dd/yyyy");
    }
}
