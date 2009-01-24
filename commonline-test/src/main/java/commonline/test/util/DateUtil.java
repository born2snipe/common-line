/**
 * Copyright 2008-2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
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
