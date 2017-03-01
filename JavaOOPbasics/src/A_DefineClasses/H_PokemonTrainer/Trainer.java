package A_DefineClasses.H_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name){
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void addPokemons(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public void increaseBadges(){
        this.badges ++;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
