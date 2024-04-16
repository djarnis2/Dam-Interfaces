public class DamSticker {
    private String stickerId;
    private Enum<StickerType> stickerType;

    // Konstruktør der initialiserer DamSticker med stickerId og stickerType
    public DamSticker(String stickerId, StickerType stickerType) {
        this.stickerId = stickerId;
        this.stickerType = stickerType;
    }

    // Getter-metode for stickerId
    public String getStickerId() {
        return stickerId;
    }

    // Setter-metode for stickerId
    public void setStickerId(String stickerId) {
        this.stickerId = stickerId;
    }

    // Getter-metode for stickerType
    public StickerType getStickerType() {
        return (StickerType) stickerType;
    }

    // Setter-metode for stickerType
    public void setStickerType(StickerType stickerType) {
        this.stickerType = stickerType;
    }
}
