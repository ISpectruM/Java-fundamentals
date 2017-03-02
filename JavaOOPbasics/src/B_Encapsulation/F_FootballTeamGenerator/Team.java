package B_Encapsulation.F_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0){
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public double getRating() {
        double playersRating = 0;
        for (Player player : players) {
            playersRating += player.getSkillLevel();
        }
        if (playersRating == 0){
            return 0;
        }else {
            return playersRating/players.size();
        }
    }

    public void addPlayer(Player player) {
        if (!players.contains(player)){
            this.players.add(player);
        }
    }

    public void removePlayer(String player){
        if (player == null || player.trim().length() == 0){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        if (players.stream()
                .noneMatch(player1 -> player1.getName()
                        .equals(player))){
            throw new IllegalArgumentException("Player "+player+ " is not in "+this.name+" team.");
        }
        players.removeIf(player1 -> player1.getName().equals(player));
    }

}
