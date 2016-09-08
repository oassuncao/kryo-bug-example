package kryo.application.model;

public class Document {
// ------------------------------ FIELDS ------------------------------

    private String value;
    private DocumentType type;
    private Boolean main;

// --------------------------- CONSTRUCTORS ---------------------------

    public Document() {
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean isMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (value != null ? !value.equals(document.value) : document.value != null) return false;
        if (type != null ? !type.equals(document.type) : document.type != null) return false;
        return main != null ? main.equals(document.main) : document.main == null;

    }

    @Override
    public final int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (main != null ? main.hashCode() : 0);
        return result;
    }
}
