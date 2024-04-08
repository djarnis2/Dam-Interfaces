public interface ImageMetadata {
    // This interface is Intended for CMS so that Arne can download and transform
    // the relevant Images for his presentaion of the product in his shop
    // He can also get and set markerIDs for the images

    /**
     *
     * @param productId
     * @return String of Image-Ids that belong to that productId
     *
     *
     */
    String[] productImageRequest(String productId);

    /**
     *
     * @param documentId
     * @return String of document-Ids with the relevant documents that concerns a product
     */
    String[] productDocumentRequest(String documentId);

    /**
     * To set a new markerId for a given Image
     * @param imageId
     * @param markerId
     * @return true if markerId is set
     */
    boolean setMarkerId(String imageId, int markerId);

    /**
     *
     * @param imageId
     * @return markerId for a given Image
     */
    int getMarkerId(String imageId);

    /**
     *
     * @param productId
     * @param markerId
     * @return Id of an Image of a product where you know the markerId
     */
    String getImageId(String productId, int markerId);
}
