package A_DefineClasses.H_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

        String input;
        while (!"Tournament".equals(input=reader.readLine())){
            if (!input.isEmpty()) {
                String[] tokens = input.split("\\s+");
                String trainerName = tokens[0];
                String pokemonName = tokens[1];
                String pokemonElement = tokens[2];
                int pokemonHealth = Integer.parseInt(tokens[3]);

                addTrainersPokemons(trainers, trainerName, pokemonName, pokemonElement, pokemonHealth);
            }
        }

        while (!"End".equals(input=reader.readLine())){
            startBattle(trainers, input);
        }

        printResults(trainers);
    }

    private static void printResults(LinkedHashMap<String, Trainer> trainers) {
        trainers.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().getBadges(),e1.getValue().getBadges()))
                .forEach(e -> {
                    e.getValue().getPokemons().removeIf(pokemon -> pokemon.getHealth()<=0);
                    System.out.printf("%1$s %2$d %3$d%n",
                            e.getKey(),
                            e.getValue().getBadges(),
                            e.getValue().getPokemons().size());
                });
    }

    private static void startBattle(LinkedHashMap<String, Trainer> trainers, String input) {
        for (String trainer : trainers.keySet()) {
            List<Pokemon> currTrainerPokemons = trainers.get(trainer).getPokemons();
            String finalInput = input;
            boolean isContainingElement = currTrainerPokemons.stream()
                    .anyMatch(pokemon -> pokemon.getElement().equals(finalInput));
            if (isContainingElement){
                trainers.get(trainer).increaseBadges();
            }else {
                trainers.get(trainer).getPokemons().forEach(Pokemon::decreaseHealth);
                trainers.get(trainer).getPokemons().removeIf(pokemon -> pokemon.getHealth()<=0);
            }
        }
    }

    private static void addTrainersPokemons(LinkedHashMap<String, Trainer> trainers, String trainerName, String pokemonName, String pokemonElement, int pokemonHealth) {
        Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);

        if (!trainers.containsKey(trainerName)){
            Trainer trainer = new Trainer(trainerName);
            trainer.addPokemons(pokemon);
            trainers.put(trainerName,trainer);
        }
        if (!trainers.get(trainerName).getPokemons().contains(pokemon)){
            trainers.get(trainerName).addPokemons(pokemon);
        }
    }
}
