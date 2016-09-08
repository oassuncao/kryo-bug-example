package kryo.application.model;

public class Country {
// ------------------------------ FIELDS ------------------------------

    private String id;
    private String externalId;
    private String name;
    private String shortISO;
    private String longISO;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongISO() {
        return longISO;
    }

    public void setLongISO(String longISO) {
        this.longISO = longISO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortISO() {
        return shortISO;
    }

    public void setShortISO(String shortISO) {
        this.shortISO = shortISO;
    }

// ------------------------ CANONICAL METHODS ------------------------


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (id != null ? !id.equals(country.id) : country.id != null) return false;
        if (externalId != null ? !externalId.equals(country.externalId) : country.externalId != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (shortISO != null ? !shortISO.equals(country.shortISO) : country.shortISO != null) return false;
        return longISO != null ? longISO.equals(country.longISO) : country.longISO == null;

    }

    @Override
    public final int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortISO != null ? shortISO.hashCode() : 0);
        result = 31 * result + (longISO != null ? longISO.hashCode() : 0);
        return result;
    }
}
