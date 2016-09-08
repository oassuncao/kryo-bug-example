package kryo.application.model;

/**
 * @author Silvio Assunção
 * @since #
 */
public class Supplier {
// ------------------------------ FIELDS ------------------------------

    private String name;
    private String code;
    private String clientCode;
    private Country country;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// ------------------------ CANONICAL METHODS ------------------------

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier)) return false;

        Supplier supplier = (Supplier) o;

        if (name != null ? !name.equals(supplier.name) : supplier.name != null) return false;
        return code != null ? code.equals(supplier.code) : supplier.code == null;
    }

    @Override
    public final int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
