public class DamDocument {
    String productId;
    String documentId;

    public DamDocument(String productId, String documentId) {
        this.productId = productId;
        this.documentId = documentId;
    }

    public DamDocument(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
