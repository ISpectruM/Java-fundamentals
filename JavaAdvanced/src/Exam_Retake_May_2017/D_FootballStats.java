package Exam_Retake_May_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_FootballStats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Map<String,List<String>>> matches = new HashMap<>();

        String input;
        while (!"Season End".equals(input= reader.readLine())){
            String[] tokens = input.split(" ");

            String team = tokens[0];
            String opponent = tokens[2];

            String[] results = tokens[4].split(":");
            String teamResultToken = results[0];
            String opponentResultToken = results[1];

            String teamResult = getResult(teamResultToken, opponentResultToken);
            String opponentResult = getResult(opponentResultToken,teamResultToken);

            fillStats(matches, team, opponent, teamResult);
            fillStats(matches, opponent,team, opponentResult);
        }

        String[] neededStats = reader.readLine().split(", ");
        StringBuilder stats = new StringBuilder();

        for (String team : neededStats) {

            Map<String,List<String>> currTeam = matches.get(team);

            for (String opponent : currTeam.keySet()) {

                List<String> results = currTeam.get(opponent);
                for (String result : results) {

                    stats.append(team).append(" - ").append(opponent)
                            .append(" -> ").append(result)
                            .append(System.lineSeparator());
                }
            }
        }
        System.out.println(stats);
    }

    private static void fillStats(
            Map<String, Map<String, List<String>>> matches,
            String team,
            String opponent,
            String teamResult) {

        if (!matches.containsKey(team)){
            matches.put(team, new TreeMap<>());
            matches.get(team).put(opponent,new ArrayList<>());
            matches.get(team).get(opponent).add(teamResult);
        } else {
            if (!matches.get(team).containsKey(opponent)){
                matches.get(team).put(opponent,new ArrayList<>());
                matches.get(team).get(opponent).add(teamResult);
            }else {
                matches.get(team).get(opponent).add(teamResult);
            }
        }
    }

    private static String getResult(String team, String opponent) {
            StringBuilder result = new StringBuilder();
            result.append(team).append(":").append(opponent);
            return result.toString();
        }
}
