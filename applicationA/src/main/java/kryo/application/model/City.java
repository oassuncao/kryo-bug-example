package kryo.application.model;

public class City {
// ------------------------------ FIELDS ------------------------------

    private String id;
    private String externalId;
    private String name;
    private State state;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

// ------------------------ CANONICAL METHODS ------------------------

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (id != null ? !id.equals(city.id) : city.id != null) return false;
        if (externalId != null ? !externalId.equals(city.externalId) : city.externalId != null) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        return state != null ? state.equals(city.state) : city.state == null;
    }

    @Override
    public final int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}