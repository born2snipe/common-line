package commonline.query.sql;

import commonline.core.layout.IntegerFieldDefinition;
import commonline.core.layout.TextFieldDefinition;
import commonline.core.layout.DecimalFieldDefinition;
import junit.framework.TestCase;


public class IntegerTypeResolverTest extends TestCase {
    public void test_resolve() {
        assertEquals(SqlType.INT, new IntegerTypeResolver().resolve(new IntegerFieldDefinition("", "", 1, "")));
        assertNull(new IntegerTypeResolver().resolve(new TextFieldDefinition("", "", 1, "")));
        assertNull(new IntegerTypeResolver().resolve(new DecimalFieldDefinition("", "", 1, "9v9")));
    }
}
