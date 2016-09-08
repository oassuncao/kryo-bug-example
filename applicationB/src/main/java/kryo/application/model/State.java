package kryo.application.model;

public class State {
// ------------------------------ FIELDS ------------------------------

    private String id;
    private String externalId;
    private String name;
    private String shortName;
    private Country country;

// --------------------- GETTER / SETTER METHODS ---------------------

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;

        State state = (State) o;

        if (id != null ? !id.equals(state.id) : state.id != null) return false;
        if (externalId != null ? !externalId.equals(state.externalId) : state.externalId != null) return false;
        if (name != null ? !name.equals(state.name) : state.name != null) return false;
        if (shortName != null ? !shortName.equals(state.shortName) : state.shortName != null) return false;
        return country != null ? country.equals(state.country) : state.country == null;

    }

    @Override
    public final int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}