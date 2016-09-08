package kryo.application.model;

public class AdditionalInformation {
// ------------------------------ FIELDS ------------------------------

    private String internetAddress;
    private Integer employeesNumber;
    private String linkedInAddress;
    private String facebookAddress;
    private String office365Address;
    private String twitterAddress;
    private String googlePlusAddress;

// --------------------- GETTER / SETTER METHODS ---------------------

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public String getFacebookAddress() {
        return facebookAddress;
    }

    public void setFacebookAddress(String facebookAddress) {
        this.facebookAddress = facebookAddress;
    }

    public String getGooglePlusAddress() {
        return googlePlusAddress;
    }

    public void setGooglePlusAddress(String googlePlusAddress) {
        this.googlePlusAddress = googlePlusAddress;
    }

    public String getInternetAddress() {
        return internetAddress;
    }

    public void setInternetAddress(String internetAddress) {
        this.internetAddress = internetAddress;
    }

    public String getLinkedInAddress() {
        return linkedInAddress;
    }

    public void setLinkedInAddress(String linkedInAddress) {
        this.linkedInAddress = linkedInAddress;
    }

    public String getOffice365Address() {
        return office365Address;
    }

    public void setOffice365Address(String office365Address) {
        this.office365Address = office365Address;
    }

    public String getTwitterAddress() {
        return twitterAddress;
    }

    public void setTwitterAddress(String twitterAddress) {
        this.twitterAddress = twitterAddress;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdditionalInformation)) return false;

        AdditionalInformation that = (AdditionalInformation) o;

        if (internetAddress != null ? !internetAddress.equals(that.internetAddress) : that.internetAddress != null)
            return false;
        if (employeesNumber != null ? !employeesNumber.equals(that.employeesNumber) : that.employeesNumber != null)
            return false;
        if (linkedInAddress != null ? !linkedInAddress.equals(that.linkedInAddress) : that.linkedInAddress != null)
            return false;
        if (facebookAddress != null ? !facebookAddress.equals(that.facebookAddress) : that.facebookAddress != null)
            return false;
        if (office365Address != null ? !office365Address.equals(that.office365Address) : that.office365Address != null)
            return false;
        if (twitterAddress != null ? !twitterAddress.equals(that.twitterAddress) : that.twitterAddress != null)
            return false;
        return googlePlusAddress != null ? googlePlusAddress.equals(that.googlePlusAddress) : that.googlePlusAddress == null;

    }

    @Override
    public final int hashCode() {
        int result = internetAddress != null ? internetAddress.hashCode() : 0;
        result = 31 * result + (employeesNumber != null ? employeesNumber.hashCode() : 0);
        result = 31 * result + (linkedInAddress != null ? linkedInAddress.hashCode() : 0);
        result = 31 * result + (facebookAddress != null ? facebookAddress.hashCode() : 0);
        result = 31 * result + (office365Address != null ? office365Address.hashCode() : 0);
        result = 31 * result + (twitterAddress != null ? twitterAddress.hashCode() : 0);
        result = 31 * result + (googlePlusAddress != null ? googlePlusAddress.hashCode() : 0);
        return result;
    }
}
