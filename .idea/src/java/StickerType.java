public enum StickerType {
    SALE("Sale", "Markerer produkter på udsalg."),
    FAVORITE("Favorite", "Markerer brugerens favoritprodukter.");

    private final String label;
    private final String description;

    // Konstruktør for StickerType enum
    StickerType(String label, String description) {
        this.label = label;
        this.description = description;
    }

    // Getter-metode for label
    public String getLabel() {
        return label;
    }

    // Getter-metode for beskrivelse
    public String getDescription() {
        return description;
    }
}
