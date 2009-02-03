package commonline.query.sql;

import junit.framework.TestCase;
import commonline.core.layout.TextFieldDefinition;
import commonline.core.layout.DecimalFieldDefinition;
import commonline.core.layout.IntegerFieldDefinition;


public class TextTypeResolverTest extends TestCase {
    public void test_resolve() {
        TextTypeResolver resolver = new TextTypeResolver();
        assertEquals(SqlType.VARCHAR, resolver.resolve(new TextFieldDefinition("","", 1, "")));
        assertNull(resolver.resolve(new DecimalFieldDefinition("","", 1, "9v9")));
        assertNull(resolver.resolve(new IntegerFieldDefinition("","", 1, "9")));
    }
}
