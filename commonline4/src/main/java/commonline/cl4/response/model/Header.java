package commonline.cl4.response.model;

import java.util.Date;


public class Header {
    private String softwareProductCode;
    private String softwareVersion;
    private String batchId;
    private Date fileCreation;
    private Date fileTransmission;
    private String fileIdentifierName;
    private String fileIdentifierCode;
    private String recipientName;
    private String recipientId;
    private String recipientNonEdBranchId;
    private String recipientTypeCode;
    private String sourceName;
    private String sourceId;
    private String sourceNonEdBranchId;
    private String mediaTypeCode;
    private String dunsRecipientId;
    private String dunsSourceId;

    public String getSoftwareProductCode() {
        return softwareProductCode;
    }

    public void setSoftwareProductCode(String softwareProductCode) {
        this.softwareProductCode = softwareProductCode;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Date getFileCreation() {
        return fileCreation;
    }

    public void setFileCreation(Date fileCreation) {
        this.fileCreation = fileCreation;
    }

    public Date getFileTransmission() {
        return fileTransmission;
    }

    public void setFileTransmission(Date fileTransmission) {
        this.fileTransmission = fileTransmission;
    }

    public String getFileIdentifierName() {
        return fileIdentifierName;
    }

    public void setFileIdentifierName(String fileIdentifierName) {
        this.fileIdentifierName = fileIdentifierName;
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

    public String getRecipientNonEdBranchId() {
        return recipientNonEdBranchId;
    }

    public void setRecipientNonEdBranchId(String recipientNonEdBranchId) {
        this.recipientNonEdBranchId = recipientNonEdBranchId;
    }

    public String getRecipientTypeCode() {
        return recipientTypeCode;
    }

    public void setRecipientTypeCode(String recipientTypeCode) {
        this.recipientTypeCode = recipientTypeCode;
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

    public String getMediaTypeCode() {
        return mediaTypeCode;
    }

    public void setMediaTypeCode(String mediaTypeCode) {
        this.mediaTypeCode = mediaTypeCode;
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
}
