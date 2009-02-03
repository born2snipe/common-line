package commonline.query.sql;

import junit.framework.TestCase;
import commonline.core.layout.DecimalFieldDefinition;
import commonline.core.layout.TextFieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;


public class DecimalTypeResolverTest extends TestCase {
    public void test_resolve() {
        DecimalTypeResolver resolver = new DecimalTypeResolver();
        assertEquals(SqlType.DOUBLE, resolver.resolve(new DecimalFieldDefinition("", "", 0, "9v9")));
        assertNull(resolver.resolve(new TextFieldDefinition("", "", 0, "9v9")));
        assertNull(resolver.resolve(new IntegerFieldDefinition("", "", 0, "9")));
    }
}
