package D_EnumsAndAnnotations_Lab.I_CardGame;

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
        return String.format("%s of %s",
                this.cardRank.name(),
                this.cardSuit.name()
                );
    }

    @Override
    public int compareTo(Card o) {
        return this.getCardPower()-o.getCardPower();
    }

    public int getCardPower() {
        return this.cardPower;
    }

    private void setCardPower() {
        this.cardPower = this.cardRank.getPower()+this.cardSuit.getPower();
    }
}
