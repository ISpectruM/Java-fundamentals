package Exam_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class D_Highscore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,Long> playersTotal = new LinkedHashMap<>();
        LinkedHashMap<String,String> playersDuels = new LinkedHashMap<>();

        String input;
        while (!(input=reader.readLine()).equals("osu!")){

            String[] players = input.split("<->");
            String[] firstPlayerStats = players[0].split(" ");
            String[] secondPlayerStats = players[1].split(" ");

            int firstPlayerScore = Integer.parseInt(firstPlayerStats[0]);
            String firstPlayer = firstPlayerStats[1];
            int secondPlayerScore = Integer.parseInt(secondPlayerStats[1]);
            String secondPlayer = secondPlayerStats[0];

            int firstPlayerResult = firstPlayerScore-secondPlayerScore;
            int secondPlayerResult = secondPlayerScore-firstPlayerScore;

            insertResults(playersTotal, playersDuels, firstPlayer, secondPlayer, firstPlayerResult);
            insertResults(playersTotal, playersDuels, secondPlayer, firstPlayer, secondPlayerResult);
        }

        LinkedHashMap<String, Long> sorted = playersTotal.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String player : sorted.keySet()) {
            System.out.printf("%s - (%d)%n",player,sorted.get(player));
            System.out.print(playersDuels.get(player));
        }
    }

    private static void insertResults(LinkedHashMap<String,Long> playersTotal,
                                      LinkedHashMap<String,String> playersDuels,
                                      String player,
                                      String opponent,
                                      long playerResult) {
        if (!playersTotal.containsKey(player)){
            playersTotal.put(player,playerResult);
            String currDuel = String.format("*   %s <-> %d%n",opponent,playerResult);
            playersDuels.put(player,currDuel);

        } else {
            long result = playersTotal.get(player)+ playerResult;
            playersTotal.put(player,result);

            String nextDuel = playersDuels.get(player)+
                    String.format("*   %s <-> %d%n",opponent,playerResult);
            playersDuels.put(player,nextDuel);
        }
    }
}
