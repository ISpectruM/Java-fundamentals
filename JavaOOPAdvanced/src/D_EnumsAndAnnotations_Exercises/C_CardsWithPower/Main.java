package D_EnumsAndAnnotations_Exercises.C_CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rank = reader.readLine();
        String suit = reader.readLine();
        CardRanks cardRank = CardRanks.valueOf(rank);
        CardSuits cardSuit = CardSuits.valueOf(suit);

        System.out.printf("Card name: %s of %s; Card power: %d",
                cardRank.name(),
                cardSuit.name(),
                (cardRank.getPower()+cardSuit.getPower()));


    }
}
