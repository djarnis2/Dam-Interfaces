public interface ImageMetadata {
    // This interface is Intended for CMS so that Arne can download and transform
    // the relevant Images for his presentaion of the product in his shop
    // He can also get and set markerIDs for the images


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

}
