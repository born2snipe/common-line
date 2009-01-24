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

import java.util.Date;


public class Trailer {
    private int responseDetailRecordCount;
    private int uniqueSupplementalDetailRecordCount;
    private int specialMessagesDetailRecordCount;
    private Date fileCreation;
    private String fileIdentifierCode;
    private String recipientName;
    private String recipientId;
    private String sourceName;
    private String sourceId;
    private String sourceNonEdBranchId;
    private int alternativeLoanResponseDetailRecordCount;
    private int changeTransactionErrorDetailRecordCount;
    private int supplementalBorrowerInformationResponseDetailRecordCount;
    private String dunsRecipientId;
    private String dunsSourceId;
    private int referenceResponseDetailRecordCount;
    private String recipientNonEdBranchId;

    public int getReferenceResponseDetailRecordCount() {
        return referenceResponseDetailRecordCount;
    }

    public void setReferenceResponseDetailRecordCount(int referenceResponseDetailRecordCount) {
        this.referenceResponseDetailRecordCount = referenceResponseDetailRecordCount;
    }

    public void setRecipientNonEdBranchId(String recipientNonEdBranchId) {
        this.recipientNonEdBranchId = recipientNonEdBranchId;
    }


    public int getResponseDetailRecordCount() {
        return responseDetailRecordCount;
    }

    public void setResponseDetailRecordCount(int responseDetailRecordCount) {
        this.responseDetailRecordCount = responseDetailRecordCount;
    }

    public int getUniqueSupplementalDetailRecordCount() {
        return uniqueSupplementalDetailRecordCount;
    }

    public void setUniqueSupplementalDetailRecordCount(int uniqueSupplementalDetailRecordCount) {
        this.uniqueSupplementalDetailRecordCount = uniqueSupplementalDetailRecordCount;
    }

    public int getSpecialMessagesDetailRecordCount() {
        return specialMessagesDetailRecordCount;
    }

    public void setSpecialMessagesDetailRecordCount(int specialMessagesDetailRecordCount) {
        this.specialMessagesDetailRecordCount = specialMessagesDetailRecordCount;
    }

    public Date getFileCreation() {
        return fileCreation;
    }

    public void setFileCreation(Date fileCreation) {
        this.fileCreation = fileCreation;
    }

    public String getFileIdentifierCode() {
        return fileIdentifierCode;
    }

    public void setFileIdentifierCode(String fileIdentifierCode) {
        this.fileIdentifierCode = fileIdentifierCode;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceNonEdBranchId() {
        return sourceNonEdBranchId;
    }

    public void setSourceNonEdBranchId(String sourceNonEdBranchId) {
        this.sourceNonEdBranchId = sourceNonEdBranchId;
    }

    public int getAlternativeLoanResponseDetailRecordCount() {
        return alternativeLoanResponseDetailRecordCount;
    }

    public void setAlternativeLoanResponseDetailRecordCount(int alternativeLoanResponseDetailRecordCount) {
        this.alternativeLoanResponseDetailRecordCount = alternativeLoanResponseDetailRecordCount;
    }

    public int getChangeTransactionErrorDetailRecordCount() {
        return changeTransactionErrorDetailRecordCount;
    }

    public void setChangeTransactionErrorDetailRecordCount(int changeTransactionErrorDetailRecordCount) {
        this.changeTransactionErrorDetailRecordCount = changeTransactionErrorDetailRecordCount;
    }

    public int getSupplementalBorrowerInformationResponseDetailRecordCount() {
        return supplementalBorrowerInformationResponseDetailRecordCount;
    }

    public void setSupplementalBorrowerInformationResponseDetailRecordCount(int supplementalBorrowerInformationResponseDetailRecordCount) {
        this.supplementalBorrowerInformationResponseDetailRecordCount = supplementalBorrowerInformationResponseDetailRecordCount;
    }

    public String getDunsRecipientId() {
        return dunsRecipientId;
    }

    public void setDunsRecipientId(String dunsRecipientId) {
        this.dunsRecipientId = dunsRecipientId;
    }

    public String getDunsSourceId() {
        return dunsSourceId;
    }

    public void setDunsSourceId(String dunsSourceId) {
        this.dunsSourceId = dunsSourceId;
    }

    public String getRecipientNonEdBranchId() {
        return recipientNonEdBranchId;
    }
}
