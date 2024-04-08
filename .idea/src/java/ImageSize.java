public enum ImageSize {
    THUMBNAIL(500, 500),
    MEDIUM(1000, 1000),
    FULL(2000, 2000);

    private final int width;
    private final int height;

    ImageSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}