package kryo.application.model;

public class System {
// ------------------------------ FIELDS ------------------------------

    private String name;
    private String code;

// --------------------------- CONSTRUCTORS ---------------------------

    public System() {

    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof System)) return false;

        System system = (System) o;

        if (name != null ? !name.equals(system.name) : system.name != null) return false;
        return code != null ? code.equals(system.code) : system.code == null;

    }

    @Override
    public final int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
