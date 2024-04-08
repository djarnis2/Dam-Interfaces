public class DamImage {
    String productId;
    String imageId;

    public DamImage(String productId, String imageId, String markerId) {
        this.productId = productId;
        this.imageId = imageId;
        this.markerId = markerId;
    }

    public DamImage(String productId, String markerId) {
        this.productId = productId;
        this.markerId = markerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getMarkerId() {
        return markerId;
    }

    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    String markerId;

}
