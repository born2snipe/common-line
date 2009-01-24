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
package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import commonline.test.util.DateUtil;

public class TrailerRecordFactoryTest extends TestCase {
    public void test() {
        TrailerRecordFactory factory = new TrailerRecordFactory();

        List fields = Arrays.asList(new byte[][]{
                "@T".getBytes(),
                "1".getBytes(),
                "2".getBytes(),
                "3".getBytes(),
                "20000101".getBytes(),
                "000000".getBytes(),
                "fileIdCode".getBytes(),
                "recipientName".getBytes(),
                "recipientId".getBytes(),
                "filler".getBytes(),
                "recipientNonEdBranchId".getBytes(),
                "sourceName".getBytes(),
                "sourceId".getBytes(),
                "filler".getBytes(),
                "sourceNonEdBranchId".getBytes(),
                "4".getBytes(),
                "5".getBytes(),
                "6".getBytes(),
                "7".getBytes(),
                "dunsRecipientId".getBytes(),
                "dunsSourceId".getBytes(),
                "filler".getBytes(),
                "*".getBytes(),
                "\r\n".getBytes()
        });

        Object obj = factory.build(fields, null);

        assertNotNull(obj);
        assertTrue(obj instanceof Trailer);

        Trailer trailer = (Trailer) obj;
        
        assertEquals(1, trailer.getResponseDetailRecordCount());
        assertEquals(2, trailer.getUniqueSupplementalDetailRecordCount());
        assertEquals(3, trailer.getSpecialMessagesDetailRecordCount());
        assertEquals(DateUtil.createCommon("01/01/2000"), trailer.getFileCreation());
        assertEquals("fileIdCode", trailer.getFileIdentifierCode());
        assertEquals("recipientName", trailer.getRecipientName());
        assertEquals("recipientId", trailer.getRecipientId());
        assertEquals("recipientNonEdBranchId", trailer.getRecipientNonEdBranchId());
        assertEquals("sourceName", trailer.getSourceName());
        assertEquals("sourceId", trailer.getSourceId());
        assertEquals("sourceNonEdBranchId", trailer.getSourceNonEdBranchId());
        assertEquals(4, trailer.getAlternativeLoanResponseDetailRecordCount());
        assertEquals(5, trailer.getReferenceResponseDetailRecordCount());
        assertEquals(6, trailer.getChangeTransactionErrorDetailRecordCount());
        assertEquals(7, trailer.getSupplementalBorrowerInformationResponseDetailRecordCount());
        assertEquals("dunsRecipientId", trailer.getDunsRecipientId());
        assertEquals("dunsSourceId", trailer.getDunsSourceId());
    }
}
