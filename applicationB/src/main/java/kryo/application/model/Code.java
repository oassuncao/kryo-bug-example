package kryo.application.model;

public class Code {
// ------------------------------ FIELDS ------------------------------

    private System system;
    private String value;

// --------------------------- CONSTRUCTORS ---------------------------

    public Code() {

    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Code)) return false;

        Code code = (Code) o;

        if (system != null ? !system.equals(code.system) : code.system != null) return false;
        return value != null ? value.equals(code.value) : code.value == null;

    }

    @Override
    public final int hashCode() {
        int result = system != null ? system.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
