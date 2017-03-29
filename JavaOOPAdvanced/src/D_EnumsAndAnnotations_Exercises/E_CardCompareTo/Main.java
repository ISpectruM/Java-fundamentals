package D_EnumsAndAnnotations_Exercises.E_CardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            String rank = reader.readLine();
            String suit = reader.readLine();
            Card card = new Card(rank,suit);
            cards.add(card);
        }

        Card powerCard =cards.get(0);

        for (Card card : cards) {
            if (card.compareTo(powerCard) > 0){
                powerCard = card;
            }
        }
        System.out.println(powerCard);
    }
}
