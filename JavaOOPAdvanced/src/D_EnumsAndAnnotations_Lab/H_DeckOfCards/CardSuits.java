package D_EnumsAndAnnotations_Lab.H_DeckOfCards;

@EnumAnnotation(type = "Enumeration", category = "Suit", description = "Provides suit constants for a Card class.")
public enum CardSuits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
    private int power;

    CardSuits(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
