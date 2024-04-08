public interface ImageEditor {
    /**
     * Intended for shop to receive transformed pictures and logos
     * @param imageId
     * @param size
     * @param sticker
     * @return
     */
    byte[] getTransformedImage(String imageId, ImageSize size, StickerType sticker);
    byte[] getTransformedImage(String imageId, ImageSize size, StickerType sticker1, StickerType sticker2);
    byte[] getLogo(String logoId);
}
