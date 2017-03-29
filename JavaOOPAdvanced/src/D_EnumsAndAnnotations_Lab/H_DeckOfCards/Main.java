package D_EnumsAndAnnotations_Lab.H_DeckOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        Map<String, List<Card>> deck = new HashMap<>();
        for (CardSuits cardSuit : CardSuits.values()) {
            for (CardRanks cardRank : CardRanks.values()) {
                Card card = new Card(cardRank.name(),cardSuit.name());

                deck.put(cardSuit.name(),new ArrayList<>());
                deck.get(cardSuit.name()).add(card);
                System.out.printf("%s of %s%n",cardRank.name(), cardSuit.name());
            }
        }
    }
}
