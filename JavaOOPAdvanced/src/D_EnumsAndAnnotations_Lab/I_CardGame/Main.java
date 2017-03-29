package D_EnumsAndAnnotations_Lab.I_CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Card> deck = new HashMap<>();
        for (CardSuits cardSuit : CardSuits.values()) {
            for (CardRanks cardRank : CardRanks.values()) {
                Card card = new Card(cardRank.name(),cardSuit.name());
                deck.put(card.toString(),card);
            }
        }

        String firstName = reader.readLine();
        Player firstPlayer = new Player(firstName);
        String secondName = reader.readLine();
        Player secPlayer = new Player(secondName);


            while (firstPlayer.getHand().size() + secPlayer.getHand().size() != 10) {
                String[] cardArgs = reader.readLine().split(" ");

                String rank = cardArgs[0];
                String suit = cardArgs[2];
                try {
                    Card card = new Card(rank, suit);
                    if (firstPlayer.getHand().size() < 5) {
                        if (deck.containsKey(card.toString())) {
                            firstPlayer.addCard(card);
                            deck.remove(card.toString());
                        } else {
                            System.out.println("Card is not in the deck.");
                        }
                    } else {
                        if (deck.containsKey(card.toString())) {
                            secPlayer.addCard(card);
                            deck.remove(card.toString());
                        } else {
                            System.out.println("Card is not in the deck.");
                        }
                    }
                }catch (IllegalArgumentException iae){
                    System.out.println("No such card exists.");
                }
            }


        int firstPlayerPower = firstPlayer.getMaxPowerCard().getCardPower();
        int secPlayerPower = secPlayer.getMaxPowerCard().getCardPower();
        Card winnerCard = firstPlayerPower>secPlayerPower ?
                firstPlayer.getMaxPowerCard() :
                secPlayer.getMaxPowerCard();

        System.out.printf("%s wins with %s.",
                    firstPlayerPower>secPlayerPower ? firstPlayer.getName(): secPlayer.getName(),
                    winnerCard);
    }
}
