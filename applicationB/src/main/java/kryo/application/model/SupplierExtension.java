package kryo.application.model;

/**
 * @author Silvio Assunção
 * @since #
 */
public class SupplierExtension extends Supplier {
// ------------------------------ FIELDS ------------------------------

    private String clientCode;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }
}
