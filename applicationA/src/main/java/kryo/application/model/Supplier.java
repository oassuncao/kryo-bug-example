package kryo.application.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.joda.time.DateTime;

import java.util.List;

public class Supplier {
// ------------------------------ FIELDS ------------------------------

    private String link;
    private String id;
    private Integer version;
    private Boolean active;
    private String name;
    private String tradingName;
    private NatureType nature;
    private AdditionalInformation additionalInformation;
    private Country country;
    private DateTime created;
    private DateTime updated;
    private Statistics statistics;
    private List<Document> documents;
    private List<Address> addresses;
    private List<Contact> contacts;
    private List<Code> codes;
    @JsonIgnore
    private String ignoreField;

// --------------------------- CONSTRUCTORS ---------------------------

    public Supplier() {
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Code> getCodes() {
        return codes;
    }

    public void setCodes(List<Code> codes) {
        this.codes = codes;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIgnoreField() {
        return ignoreField;
    }

    public void setIgnoreField(String ignoreField) {
        this.ignoreField = ignoreField;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NatureType getNature() {
        return nature;
    }

    public void setNature(NatureType nature) {
        this.nature = nature;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public DateTime getUpdated() {
        return updated;
    }

    public void setUpdated(DateTime updated) {
        this.updated = updated;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

// ------------------------ CANONICAL METHODS ------------------------

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier)) return false;

        Supplier supplier = (Supplier) o;

        if (link != null ? !link.equals(supplier.link) : supplier.link != null) return false;
        if (id != null ? !id.equals(supplier.id) : supplier.id != null) return false;
        if (version != null ? !version.equals(supplier.version) : supplier.version != null) return false;
        if (active != null ? !active.equals(supplier.active) : supplier.active != null) return false;
        if (name != null ? !name.equals(supplier.name) : supplier.name != null) return false;
        if (tradingName != null ? !tradingName.equals(supplier.tradingName) : supplier.tradingName != null)
            return false;
        if (nature != supplier.nature) return false;
        if (additionalInformation != null ? !additionalInformation.equals(supplier.additionalInformation) : supplier.additionalInformation != null)
            return false;
        if (country != null ? !country.equals(supplier.country) : supplier.country != null) return false;
        if (created != null ? !created.equals(supplier.created) : supplier.created != null) return false;
        if (updated != null ? !updated.equals(supplier.updated) : supplier.updated != null) return false;
        if (statistics != null ? !statistics.equals(supplier.statistics) : supplier.statistics != null) return false;
        if (documents != null ? !documents.equals(supplier.documents) : supplier.documents != null) return false;
        if (addresses != null ? !addresses.equals(supplier.addresses) : supplier.addresses != null) return false;
        if (contacts != null ? !contacts.equals(supplier.contacts) : supplier.contacts != null) return false;
        return codes != null ? codes.equals(supplier.codes) : supplier.codes == null;
    }

    @Override
    public final int hashCode() {
        int result = link != null ? link.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tradingName != null ? tradingName.hashCode() : 0);
        result = 31 * result + (nature != null ? nature.hashCode() : 0);
        result = 31 * result + (additionalInformation != null ? additionalInformation.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (statistics != null ? statistics.hashCode() : 0);
        result = 31 * result + (documents != null ? documents.hashCode() : 0);
        result = 31 * result + (addresses != null ? addresses.hashCode() : 0);
        result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        result = 31 * result + (codes != null ? codes.hashCode() : 0);
        return result;
    }
}
