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

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class SupplementalDisbursementSendDetailLayout extends AbstractCommonLineRecordLayout {
    public SupplementalDisbursementSendDetailLayout() {
        super("@8");
    }

    protected void defineFields() {
        field("2", "Supplemental Disbursement Layout Owner Code", "X(4)");
        field("3", "Supplemental Disbursement Layout Identifier Code", "X(2)");
        field("4", "Recommended Disbursement Date 5 (CCYYMMDD)", "9(8)");
        field("5", "Recommended Disbursement Date 6 (CCYYMMDD)", "9(8)");
        field("6", "Recommended Disbursement Date 7 (CCYYMMDD)", "9(8)");
        field("7", "Recommended Disbursement Date 8 (CCYYMMDD)", "9(8)");
        field("8", "Recommended Disbursement Date 9 (CCYYMMDD)", "9(8)");
        field("9", "Recommended Disbursement Date 10 (CCYYMMDD)", "9(8)");
        field("10", "Recommended Disbursement Date 11 (CCYYMMDD)", "9(8)");
        field("11", "Recommended Disbursement Date 12 (CCYYMMDD)", "9(8)");
        field("12", "Recommended Disbursement Date 13 (CCYYMMDD)", "9(8)");
        field("13", "Recommended Disbursement Date 14 (CCYYMMDD)", "9(8)");
        field("14", "Recommended Disbursement Date 15 (CCYYMMDD)", "9(8)");
        field("15", "Recommended Disbursement Date 16 (CCYYMMDD)", "9(8)");
        field("16", "Recommended Disbursement Date 17 (CCYYMMDD)", "9(8)");
        field("17", "Recommended Disbursement Date 18 (CCYYMMDD)", "9(8)");
        field("18", "Recommended Disbursement Date 19 (CCYYMMDD)", "9(8)");
        field("19", "Recommended Disbursement Date 20 (CCYYMMDD)", "9(8)");
        field("20", "Disbursement 5 Hold/Release Indicator Code", "X(1)");
        field("21", "Disbursement 6 Hold/Release Indicator Code", "X(1)");
        field("22", "Disbursement 7 Hold/Release Indicator Code", "X(1)");
        field("23", "Disbursement 8 Hold/Release Indicator Code", "X(1)");
        field("24", "Disbursement 9 Hold/Release Indicator Code", "X(1)");
        field("25", "Disbursement 10 Hold/Release Indicator Code", "X(1)");
        field("26", "Disbursement 11 Hold/Release Indicator Code", "X(1)");
        field("27", "Disbursement 12 Hold/Release Indicator Code", "X(1)");
        field("28", "Disbursement 13 Hold/Release Indicator Code", "X(1)");
        field("29", "Disbursement 14 Hold/Release Indicator Code", "X(1)");
        field("30", "Disbursement 15 Hold/Release Indicator Code", "X(1)");
        field("31", "Disbursement 16 Hold/Release Indicator Code", "X(1)");
        field("32", "Disbursement 17 Hold/Release Indicator Code", "X(1)");
        field("33", "Disbursement 18 Hold/Release Indicator Code", "X(1)");
        field("34", "Disbursement 19 Hold/Release Indicator Code", "X(1)");
        field("35", "Disbursement 20 Hold/Release Indicator Code", "X(1)");
        field("36", "Disbursement Amount 5", "9(5)");
        field("37", "Disbursement Amount 6", "9(5)");
        field("38", "Disbursement Amount 7", "9(5)");
        field("39", "Disbursement Amount 8", "9(5)");
        field("40", "Disbursement Amount 9", "9(5)");
        field("41", "Disbursement Amount 10", "9(5)");
        field("42", "Disbursement Amount 11", "9(5)");
        field("43", "Disbursement Amount 12", "9(5)");
        field("44", "Disbursement Amount 13", "9(5)");
        field("45", "Disbursement Amount 14", "9(5)");
        field("46", "Disbursement Amount 15", "9(5)");
        field("47", "Disbursement Amount 16", "9(5)");
        field("48", "Disbursement Amount 17", "9(5)");
        field("49", "Disbursement Amount 18", "9(5)");
        field("50", "Disbursement Amount 19", "9(5)");
        field("51", "Disbursement Amount 20", "9(5)");
        field("52", "Filler", "X(727)");
        recordTerminator("53");
    }
}
