package D_EnumsAndAnnotations_Lab.I_CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Card> getHand() {
        return this.hand;
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public Card getMaxPowerCard(){
        Card powerCard=this.hand.get(0);
        for (Card card : this.hand) {
            if (powerCard.getCardPower()<card.getCardPower()){
                powerCard = card;
            }
        }
        return powerCard;
    }
}
