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


public class AlternativeLoanDetailLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new AlternativeLoanDetailLayout();
    }

    protected int recordLength() {
        return 960;
    }

    protected int fieldCount() {
        return 86;
    }

    protected String recordCode() {
        return "@4";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Alternative Loan Layout Owner Code", 3, 4);
        assertText("3", "Alternative Loan Layout Identifier Code", 7, 2);
        assertText("4", "Federal Stafford Loan Debt", 9, 5);
        assertText("5", "Federal SLS Debt", 14, 5);
        assertText("6", "HEAL Debt", 19, 6);
        assertText("7", "Perkins Debt", 25, 5);
        assertText("8", "Other Debt", 30, 6);
        assertText("9", "Other Loans this Period", 36, 7);
        assertText("10", "Credit Under Different Name Code", 43, 1);
        assertText("11", "Cosigner 1 Last Name", 44, 35);
        assertText("12", "Cosigner 1 First Name", 79, 12);
        assertText("13", "Cosigner 1 Middle Initial", 91, 1);
        assertInteger("14", "Cosigner 1 SSN", 92, 9);
        assertText("15", "Cosigner 1 U.S. Citizenship Status Code", 101, 1);
        assertText("16", "Cosigner 1 Address (line 1)", 102, 30);
        assertText("17", "Cosigner 1 Address (line 2)", 132, 30);
        assertText("18", "Cosigner 1 City", 162, 24);
        assertText("19", "Filler", 186, 6);
        assertText("20", "Cosigner 1 State", 192, 2);
        assertInteger("21", "Cosigner 1 Zip Code", 194, 5);
        assertInteger("22", "Cosigner 1 Zip Code Suffix", 199, 4);
        assertText("23", "Cosigner 1 Telephone Number", 203, 10);
        assertText("24", "Cosigner 1 Signature Code", 213, 1);
        assertText("25", "Cosigner 2 Last Name", 214, 35);
        assertText("26", "Cosigner 2 First Name", 249, 12);
        assertText("27", "Cosigner 2 Middle Initial", 261, 1);
        assertInteger("28", "Cosigner 2 SSN", 262, 9);
        assertText("29", "Cosigner 2 U.S. Citizenship Status Code", 271, 1);
        assertText("30", "Cosigner 2 Address (line 1)", 272, 30);
        assertText("31", "Cosigner 2 Address (line 2)", 302, 30);
        assertText("32", "Cosigner 2 City", 332, 24);
        assertText("33", "Filler", 356, 6);
        assertText("34", "Cosigner 2 State", 362, 2);
        assertInteger("35", "Cosigner 2 Zip Code", 364, 5);
        assertInteger("36", "Cosigner 2 Zip Code Suffix", 369, 4);
        assertText("37", "Cosigner 2 Telephone Number", 373, 10);
        assertText("38", "Cosigner 2 Signature Code", 383, 1);
        assertInteger("39", "Borrower Gross Annual Salary", 384, 7);
        assertInteger("40", "Borrower Other Income", 391, 7);
        assertInteger("41", "Cosigner 1 Gross Annual Salary", 398, 7);
        assertInteger("42", "Cosigner 1 Other Income", 405, 7);
        assertInteger("43", "Cosigner 2 Gross Annual Salary", 412, 7);
        assertInteger("44", "Cosigner 2 Other Income", 419, 7);
        assertText("45", "Cosigner 1 Foreign Postal Code", 426, 14);
        assertText("46", "Cosigner 2 Foreign Postal Code", 440, 14);
        assertText("47", "Student Major", 454, 15);
        assertInteger("48", "Cosigner 1 Date of Birth", 469, 8);
        assertText("49", "Cosigner 1 Driver’s License State", 477, 2);
        assertText("50", "Cosigner 1 Driver’s License Number", 479, 20);
        assertInteger("51", "Cosigner 2 Date of Birth", 499, 8);
        assertText("52", "Cosigner 2 Driver’s License State", 507, 2);
        assertText("53", "Cosigner 2 Driver’s License Number", 509, 20);
        assertText("54", "Filler", 529, 20);
        assertText("55", "Student School Phone", 549, 10);
        assertText("56", "Cosigner 1 Relationship to Student", 559, 1);
        assertText("57", "Filler", 560, 3);
        assertText("58", "Cosigner 1 Years at Address", 563, 2);
        assertText("59", "Cosigner 2 Relationship to Student", 565, 1);
        assertText("60", "Filler", 566, 3);
        assertText("61", "Cosigner 2 Years at Address", 569, 2);
        assertText("62", "Interest Rate Option", 571, 1);
        assertText("63", "Repayment Option Code", 572, 1);
        assertText("64", "Cosigner 1 Foreign Telephone Number Prefix", 573, 10);
        assertText("65", "Cosigner 2 Foreign Telephone Number Prefix", 583, 10);
        assertText("66", "Student Monthly Housing Payment", 593, 5);
        assertText("67", "Student Monthly Credit Card Payment", 598, 5);
        assertText("68", "Student Monthly Auto Payment", 603, 5);
        assertText("69", "Student Monthly Educational Loan Payment", 608, 5);
        assertText("70", "Student Monthly Other Payment", 613, 5);
        assertText("71", "Cosigner 1 Monthly Housing Payment", 618, 5);
        assertText("72", "Cosigner 1 Monthly Credit Card Payment", 623, 5);
        assertText("73", "Cosigner 1 Monthly Auto Payment", 628, 5);
        assertText("74", "Cosigner 1 Monthly Educational Loan Payment", 633, 5);
        assertText("75", "Cosigner 1 Monthly Other Payment", 638, 5);
        assertText("76", "Cosigner 2 Monthly Housing Payment", 643, 5);
        assertText("77", "Cosigner 2 Monthly Credit Card Payment", 648, 5);
        assertText("78", "Cosigner 2 Monthly Auto Payment", 653, 5);
        assertText("79", "Cosigner 2 Monthly Educational Loan Payment", 658, 5);
        assertText("80", "Cosigner 2 Monthly Other Payment", 663, 5);
        assertText("81", "Cosigner 1 Credit Authorization Code", 668, 1);
        assertText("82", "Cosigner 2 Credit Authorization Code", 669, 1);
        assertText("83", "Cosigner 1 Electronic Signature Indicator Code", 670, 1);
        assertText("84", "Cosigner 2 Electronic Signature Indicator Code", 671, 1);
        assertText("85", "Filler", 672, 288);
        assertText("86", "Record Terminator", 960, 1);
    }
}
                 