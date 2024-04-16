public interface ImageUploader {
    /**
     * Intended for Arne to Upload new pictures when he adds new products to his shop
     *
     * @param imageData
     * @param productId - The product it belongs to
     * @param markerId - The angle or other description of the Image
     * @return
     */
    boolean uploadImage(byte[] imageData, String productId, int markerId);
    boolean uploadImage(byte[] imageData, String productId);
    boolean uploadSticker(byte[] imageData, String stickerId);
}

