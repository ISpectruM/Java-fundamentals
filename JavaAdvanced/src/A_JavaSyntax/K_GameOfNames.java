package A_JavaSyntax;

import java.text.MessageFormat;
import java.util.Scanner;

public class K_GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playersCount = Integer.parseInt(scanner.nextLine());

        String bestPlayer = "";
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i <playersCount ; i++) {

            String player = scanner.nextLine();
            String score = scanner.nextLine();

            int initialScore = Integer.parseInt(score);

            for (int j = 0; j < player.length(); j++) {
                int charValue = player.charAt(j);

                if (charValue%2==0){
                    initialScore+=charValue;
                }
                else if(charValue%2!=0){
                    initialScore-=charValue;
                }
            }

            if (initialScore>bestScore){
                bestPlayer=player;
                bestScore=initialScore;
            }
        }
        System.out.println(MessageFormat.format("The winner is {0} - {1} points",
                bestPlayer,
                Integer.toString(bestScore)));
    }
}
