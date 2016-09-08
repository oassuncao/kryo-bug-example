package kryo.application.model;

/**
 * @author Silvio Assunção
 * @since #
 */
public class Country {
// ------------------------------ FIELDS ------------------------------

    private String name;
    private String code;

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

// ------------------------ CANONICAL METHODS ------------------------

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        return code != null ? code.equals(country.code) : country.code == null;
    }

    @Override
    public final int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}
