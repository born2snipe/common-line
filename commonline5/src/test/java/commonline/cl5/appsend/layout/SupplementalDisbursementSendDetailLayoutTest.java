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
package commonline.cl5.appsend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class SupplementalDisbursementSendDetailLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new SupplementalDisbursementSendDetailLayout();
    }

    protected int recordLength() {
        return 960;
    }

    protected int fieldCount() {
        return 53;
    }

    protected String recordCode() {
        return "@8";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Supplemental Disbursement Layout Owner Code", 3, 4);
        assertText("3", "Supplemental Disbursement Layout Identifier Code", 7, 2);
        assertInteger("4", "Recommended Disbursement Date 5 (CCYYMMDD)", 9, 8);
        assertInteger("5", "Recommended Disbursement Date 6 (CCYYMMDD)", 17, 8);
        assertInteger("6", "Recommended Disbursement Date 7 (CCYYMMDD)", 25, 8);
        assertInteger("7", "Recommended Disbursement Date 8 (CCYYMMDD)", 33, 8);
        assertInteger("8", "Recommended Disbursement Date 9 (CCYYMMDD)", 41, 8);
        assertInteger("9", "Recommended Disbursement Date 10 (CCYYMMDD)", 49, 8);
        assertInteger("10", "Recommended Disbursement Date 11 (CCYYMMDD)", 57, 8);
        assertInteger("11", "Recommended Disbursement Date 12 (CCYYMMDD)", 65, 8);
        assertInteger("12", "Recommended Disbursement Date 13 (CCYYMMDD)", 73, 8);
        assertInteger("13", "Recommended Disbursement Date 14 (CCYYMMDD)", 81, 8);
        assertInteger("14", "Recommended Disbursement Date 15 (CCYYMMDD)", 89, 8);
        assertInteger("15", "Recommended Disbursement Date 16 (CCYYMMDD)", 97, 8);
        assertInteger("16", "Recommended Disbursement Date 17 (CCYYMMDD)", 105, 8);
        assertInteger("17", "Recommended Disbursement Date 18 (CCYYMMDD)", 113, 8);
        assertInteger("18", "Recommended Disbursement Date 19 (CCYYMMDD)", 121, 8);
        assertInteger("19", "Recommended Disbursement Date 20 (CCYYMMDD)", 129, 8);
        assertText("20", "Disbursement 5 Hold/Release Indicator Code", 137, 1);
        assertText("21", "Disbursement 6 Hold/Release Indicator Code", 138, 1);
        assertText("22", "Disbursement 7 Hold/Release Indicator Code", 139, 1);
        assertText("23", "Disbursement 8 Hold/Release Indicator Code", 140, 1);
        assertText("24", "Disbursement 9 Hold/Release Indicator Code", 141, 1);
        assertText("25", "Disbursement 10 Hold/Release Indicator Code", 142, 1);
        assertText("26", "Disbursement 11 Hold/Release Indicator Code", 143, 1);
        assertText("27", "Disbursement 12 Hold/Release Indicator Code", 144, 1);
        assertText("28", "Disbursement 13 Hold/Release Indicator Code", 145, 1);
        assertText("29", "Disbursement 14 Hold/Release Indicator Code", 146, 1);
        assertText("30", "Disbursement 15 Hold/Release Indicator Code", 147, 1);
        assertText("31", "Disbursement 16 Hold/Release Indicator Code", 148, 1);
        assertText("32", "Disbursement 17 Hold/Release Indicator Code", 149, 1);
        assertText("33", "Disbursement 18 Hold/Release Indicator Code", 150, 1);
        assertText("34", "Disbursement 19 Hold/Release Indicator Code", 151, 1);
        assertText("35", "Disbursement 20 Hold/Release Indicator Code", 152, 1);
        assertInteger("36", "Disbursement Amount 5", 153, 5);
        assertInteger("37", "Disbursement Amount 6", 158, 5);
        assertInteger("38", "Disbursement Amount 7", 163, 5);
        assertInteger("39", "Disbursement Amount 8", 168, 5);
        assertInteger("40", "Disbursement Amount 9", 173, 5);
        assertInteger("41", "Disbursement Amount 10", 178, 5);
        assertInteger("42", "Disbursement Amount 11", 183, 5);
        assertInteger("43", "Disbursement Amount 12", 188, 5);
        assertInteger("44", "Disbursement Amount 13", 193, 5);
        assertInteger("45", "Disbursement Amount 14", 198, 5);
        assertInteger("46", "Disbursement Amount 15", 203, 5);
        assertInteger("47", "Disbursement Amount 16", 208, 5);
        assertInteger("48", "Disbursement Amount 17", 213, 5);
        assertInteger("49", "Disbursement Amount 18", 218, 5);
        assertInteger("50", "Disbursement Amount 19", 223, 5);
        assertInteger("51", "Disbursement Amount 20", 228, 5);
        assertText("52", "Filler", 233, 727);
        assertText("53", "Record Terminator", 960, 1);
    }
}
