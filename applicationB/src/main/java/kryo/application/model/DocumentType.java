package kryo.application.model;

public class DocumentType {
// ------------------------------ FIELDS ------------------------------

    private NatureType type;
    private String name;
    private String code;

// --------------------------- CONSTRUCTORS ---------------------------

    public DocumentType() {
    }

    public DocumentType(NatureType type, String code) {
        this.type = type;
        this.code = code;
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

    public NatureType getType() {
        return type;
    }

    public void setType(NatureType type) {
        this.type = type;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocumentType)) return false;

        DocumentType that = (DocumentType) o;

        if (type != that.type) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return code != null ? code.equals(that.code) : that.code == null;

    }

    @Override
    public final int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
