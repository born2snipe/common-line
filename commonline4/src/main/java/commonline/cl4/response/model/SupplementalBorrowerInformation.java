package commonline.cl4.response.model;

import java.util.Date;


public class SupplementalBorrowerInformation {
    private String supplementalBorrowerInformationLayoutOwnerCode;
    private String supplementalBorrowerInformationLayoutIdentifierCode;
    private String emailAddress;
    private String emailAddressValidityIndicator;
    private Date emailAddressEffectiveDate;
    private String temporaryBorrowerAddressLine1;
    private String temporaryBorrowerAddressLine2;
    private String temporaryBorrowerCity;
    private String temporaryBorrowerState;
    private int temporaryBorrowerZipCode;
    private int temporaryBorrowerZipCodeSuffix;
    private String foreignPostalCode;

    public String getSupplementalBorrowerInformationLayoutOwnerCode() {
        return supplementalBorrowerInformationLayoutOwnerCode;
    }

    public void setSupplementalBorrowerInformationLayoutOwnerCode(String supplementalBorrowerInformationLayoutOwnerCode) {
        this.supplementalBorrowerInformationLayoutOwnerCode = supplementalBorrowerInformationLayoutOwnerCode;
    }

    public String getSupplementalBorrowerInformationLayoutIdentifierCode() {
        return supplementalBorrowerInformationLayoutIdentifierCode;
    }

    public void setSupplementalBorrowerInformationLayoutIdentifierCode(String supplementalBorrowerInformationLayoutIdentifierCode) {
        this.supplementalBorrowerInformationLayoutIdentifierCode = supplementalBorrowerInformationLayoutIdentifierCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddressValidityIndicator() {
        return emailAddressValidityIndicator;
    }

    public void setEmailAddressValidityIndicator(String emailAddressValidityIndicator) {
        this.emailAddressValidityIndicator = emailAddressValidityIndicator;
    }

    public Date getEmailAddressEffectiveDate() {
        return emailAddressEffectiveDate;
    }

    public void setEmailAddressEffectiveDate(Date emailAddressEffectiveDate) {
        this.emailAddressEffectiveDate = emailAddressEffectiveDate;
    }

    public String getTemporaryBorrowerAddressLine1() {
        return temporaryBorrowerAddressLine1;
    }

    public void setTemporaryBorrowerAddressLine1(String temporaryBorrowerAddressLine1) {
        this.temporaryBorrowerAddressLine1 = temporaryBorrowerAddressLine1;
    }

    public String getTemporaryBorrowerAddressLine2() {
        return temporaryBorrowerAddressLine2;
    }

    public void setTemporaryBorrowerAddressLine2(String temporaryBorrowerAddressLine2) {
        this.temporaryBorrowerAddressLine2 = temporaryBorrowerAddressLine2;
    }

    public String getTemporaryBorrowerCity() {
        return temporaryBorrowerCity;
    }

    public void setTemporaryBorrowerCity(String temporaryBorrowerCity) {
        this.temporaryBorrowerCity = temporaryBorrowerCity;
    }

    public String getTemporaryBorrowerState() {
        return temporaryBorrowerState;
    }

    public void setTemporaryBorrowerState(String temporaryBorrowerState) {
        this.temporaryBorrowerState = temporaryBorrowerState;
    }

    public int getTemporaryBorrowerZipCode() {
        return temporaryBorrowerZipCode;
    }

    public void setTemporaryBorrowerZipCode(int temporaryBorrowerZipCode) {
        this.temporaryBorrowerZipCode = temporaryBorrowerZipCode;
    }

    public int getTemporaryBorrowerZipCodeSuffix() {
        return temporaryBorrowerZipCodeSuffix;
    }

    public void setTemporaryBorrowerZipCodeSuffix(int temporaryBorrowerZipCodeSuffix) {
        this.temporaryBorrowerZipCodeSuffix = temporaryBorrowerZipCodeSuffix;
    }

    public String getForeignPostalCode() {
        return foreignPostalCode;
    }

    public void setForeignPostalCode(String foreignPostalCode) {
        this.foreignPostalCode = foreignPostalCode;
    }
}
