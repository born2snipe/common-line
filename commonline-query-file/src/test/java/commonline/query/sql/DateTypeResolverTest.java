package commonline.query.sql;

import commonline.core.layout.IntegerFieldDefinition;
import junit.framework.TestCase;


public class DateTypeResolverTest extends TestCase {
    public void test_resolver() {
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (CCYYMMDDHHMMSSNNNNNN)", 0, "x(1)")));
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (CCYYMMDD)", 0, "x(1)")));
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (HHMMSS)", 0, "x(1)")));
        assertEquals(SqlType.DATE, new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name (CCYYMM)", 0, "x(1)")));
        assertNull(new DateTypeResolver().resolve(new IntegerFieldDefinition("1", "name", 0, "x(1)")));
    }
}
