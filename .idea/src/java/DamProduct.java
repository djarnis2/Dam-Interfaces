public class DamProduct {
    String productId;
    String[] documentsIds;
    String[] imageIds;

    public DamProduct(String productId, String[] documentsIds, String[] imageIds) {
        this.productId = productId;
        this.documentsIds = documentsIds;
        this.imageIds = imageIds;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String[] getDocumentsIds() {
        return documentsIds;
    }

    public void setDocumentsIds(String[] documentsIds) {
        this.documentsIds = documentsIds;
    }

    public String[] getImageIds() {
        return imageIds;
    }

    public void setImageIds(String[] imageIds) {
        this.imageIds = imageIds;
    }
}
