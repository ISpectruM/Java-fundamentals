package B_Encapsulation.F_FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Team> teams = new LinkedHashMap<>();

        String input;
        while (!"END".equals(input=reader.readLine())){
            String[] tokens = input.split(";");
            Team team = null;
            String teamName=tokens[1];

            switch (tokens[0]){
                case "Team":
                    addTeam(teams, teamName);
                    break;

                case "Add":
                    addPlayer(teams, tokens, teamName);
                    break;

                case "Remove":
                    removePlayer(teams, tokens, teamName);
                    break;

                case "Rating":
                    displayTeamRating(teams, teamName);
                    break;

                default:
                        break;
            }
        }
    }

    private static void displayTeamRating(LinkedHashMap<String, Team> teams, String teamName) {
        if (!teams.containsKey(teamName)){
            System.out.printf("Team %s does not exist.%n", teamName);
            return;
        }
        System.out.printf("%s - %.0f%n",teamName,teams.get(teamName).getRating());
        return;
    }

    private static void removePlayer(LinkedHashMap<String, Team> teams, String[] tokens, String teamName) {
        if (!teams.containsKey(teamName)){
            System.out.printf("Team %s does not exist.%n", teamName);
            return;
        }
        try {
            String playerName = tokens[2];
            teams.get(teamName).removePlayer(playerName);

        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void addPlayer(LinkedHashMap<String, Team> teams, String[] tokens, String teamName) {
        try{
        Team team = new Team(teamName);
        if (!teams.containsKey(teamName)){
            System.out.printf("Team %s does not exist.%n", teamName);
            return;
        }
            String playerName = tokens[2];
            int endurance = Integer.parseInt(tokens[3]);
            int sprint = Integer.parseInt(tokens[4]);
            int dribble = Integer.parseInt(tokens[5]);
            int passing = Integer.parseInt(tokens[6]);
            int shooting = Integer.parseInt(tokens[7]);
            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
            teams.get(teamName).addPlayer(player);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void addTeam(LinkedHashMap<String, Team> teams, String teamName) {
        Team team;
        team = new Team(teamName);
        teams.putIfAbsent(teamName,team);
    }
}
