public enum ImageSize {
    THUMBNAIL("thumbnail", 500, 500),
    MEDIUM("medium", 1000, 1000),
    FULL("full",2000,2000);
    private final String label;
    private final int width;
    private final int height;

    ImageSize(String label, int width, int height) {
        this.label = label;
        this.width = width;
        this.height = height;
    }

    public String getLabel() {
        return label;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}