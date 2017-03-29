package D_EnumsAndAnnotations_Exercises.D_CardToString;

public class Card {
    private CardRanks cardRank;
    private CardSuits cardSuit;

    public Card(String cardRank, String cardSuit) {
        this.cardRank = CardRanks.valueOf(cardRank);
        this.cardSuit = CardSuits.valueOf(cardSuit);
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.cardRank.name(),
                this.cardSuit.name(),
                (this.cardRank.getPower()+this.cardSuit.getPower()));
    }
}
