package kryo.application.model;

public class Address {
// ------------------------------ FIELDS ------------------------------

    private String name;
    private AddressType type;
    private City city;
    private Integer number;
    private String complement;
    private String postalCode;
    private String region;

// --------------------------- CONSTRUCTORS ---------------------------

    public Address() {
    }


// --------------------- GETTER / SETTER METHODS ---------------------

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (name != null ? !name.equals(address.name) : address.name != null) return false;
        if (type != address.type) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (number != null ? !number.equals(address.number) : address.number != null) return false;
        if (complement != null ? !complement.equals(address.complement) : address.complement != null) return false;
        if (postalCode != null ? !postalCode.equals(address.postalCode) : address.postalCode != null) return false;
        return region != null ? region.equals(address.region) : address.region == null;

    }

    @Override
    public final int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (complement != null ? complement.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        return result;
    }
}
