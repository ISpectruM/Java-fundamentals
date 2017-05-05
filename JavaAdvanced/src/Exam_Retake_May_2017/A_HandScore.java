package Exam_Retake_May_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class A_HandScore {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> hand = new ArrayDeque<>();
        List<Integer> sequential = new ArrayList<>();

        int totalSum = 0;

        String[] cards = reader.readLine().split(" ");
        for (String card : cards) {
            hand.offer(card);
        }
        boolean isEqual = true;
        int currSum = 0;
        int sequentialCount = 1;

        while (!hand.isEmpty()){
            String currCard = hand.pollFirst();
            String face = currCard.substring(0,currCard.length()-1);
            String suit = currCard.substring(currCard.length()-1);

            int currValue = getCurrValue(face);
            currSum += currValue;

            if (hand.size()>0) {
                String nextCard = hand.peekFirst();
                String nextSuit = nextCard.substring(nextCard.length()-1);

                if (nextSuit.equals(suit)){
                    sequentialCount++;
                } else {
                    totalSum += currSum*sequentialCount;
                    sequentialCount = 1;
                    currSum = 0;
                }
            }else {
                totalSum += currSum*sequentialCount;
                currSum = 0;
            }
        }
        System.out.println(totalSum);

    }

    private static int getCurrValue(String face) {
        int value = 0;
        try {
            value = Integer.parseInt(face);
        } catch (NumberFormatException e){
            switch (face){
                case "J":
                    value = 12;
                    break;
                case "Q":
                    value = 13;
                    break;
                case "K":
                    value = 14;
                    break;
                default:
                    value = 15;
                    break;
            }
        }
        return value;
    }
}
