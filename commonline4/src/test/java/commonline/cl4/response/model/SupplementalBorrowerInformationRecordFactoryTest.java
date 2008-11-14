package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import commonline.test.util.DateUtil;

public class SupplementalBorrowerInformationRecordFactoryTest extends TestCase {

    public void test() {
        SupplementalBorrowerInformationRecordFactory factory = new SupplementalBorrowerInformationRecordFactory();

        List fields = Arrays.asList(new String[]{
            "@7",
            "ownerCode",
            "idCode",
            "emailAddress",
            "emailAddressValidityIndicator",
            "20001120",
            "line1",
            "line2",
            "city",
            "state",
            "12345",
            "1234",
            "foreignPostal",
            "filler",
            "*",
            "\r\n"
        });

        Object obj = factory.build(fields, null);

        assertNotNull(obj);
        assertTrue(obj instanceof SupplementalBorrowerInformation);

        SupplementalBorrowerInformation info = (SupplementalBorrowerInformation) obj;

        assertEquals("ownerCode", info.getSupplementalBorrowerInformationLayoutOwnerCode());
        assertEquals("idCode", info.getSupplementalBorrowerInformationLayoutIdentifierCode());
        assertEquals("emailAddress", info.getEmailAddress());
        assertEquals("emailAddressValidityIndicator", info.getEmailAddressValidityIndicator());
        assertEquals(DateUtil.createCommon("11/20/2000"), info.getEmailAddressEffectiveDate());
        assertEquals("line1", info.getTemporaryBorrowerAddressLine1());
        assertEquals("line2", info.getTemporaryBorrowerAddressLine2());
        assertEquals("city", info.getTemporaryBorrowerCity());
        assertEquals("state", info.getTemporaryBorrowerState());
        assertEquals(12345, info.getTemporaryBorrowerZipCode());
        assertEquals(1234, info.getTemporaryBorrowerZipCodeSuffix());
        assertEquals("foreignPostal", info.getForeignPostalCode());
    }
}
