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
package commonline.query.sql;

import java.sql.Types;
import java.text.MessageFormat;


public enum SqlType {
    VARCHAR("varchar({0})", true),
    INT("int"),
    DOUBLE("double"),
    DATE("datetime");

    private String formatted;
    private boolean lengthRequired;


    SqlType(String formatted) {
        this(formatted, false);
    }

    SqlType(String formatted, boolean lengthRequired) {
        this.formatted = formatted;
        this.lengthRequired = lengthRequired;
    }

    public String format(int length) {
        MessageFormat formatter = new MessageFormat(this.formatted);
        return formatter.format(new Object[]{String.valueOf(length)});
    }

    public boolean isLengthRequired() {
        return lengthRequired;
    }

    public static SqlType convert(int sqlType) {
        switch (sqlType) {
            case Types.VARCHAR:
                return VARCHAR;
            case Types.INTEGER:
                return INT;
            case Types.DOUBLE:
                return DOUBLE;
            case Types.DATE:
                return DATE;
            default:
                return null;
        }
    }
}
