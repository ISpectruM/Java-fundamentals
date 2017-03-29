package D_EnumsAndAnnotations_Lab.H_DeckOfCards;

public class Card implements Comparable<Card>{
    private CardRanks cardRank;
    private CardSuits cardSuit;
    private int cardPower;

    public Card(String cardRank, String cardSuit) {
        this.cardRank = CardRanks.valueOf(cardRank);
        this.cardSuit = CardSuits.valueOf(cardSuit);
        this.setCardPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.cardRank.name(),
                this.cardSuit.name(),
                (this.cardRank.getPower()+this.cardSuit.getPower()));
    }

    @Override
    public int compareTo(Card o) {
        return this.getCardPower()-o.getCardPower();
    }

    private int getCardPower() {
        return this.cardPower;
    }

    private void setCardPower() {
        this.cardPower = this.cardRank.getPower()+this.cardSuit.getPower();
    }
}
