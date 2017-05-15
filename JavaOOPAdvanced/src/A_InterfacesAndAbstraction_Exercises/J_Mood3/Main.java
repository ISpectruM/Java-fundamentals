package A_InterfacesAndAbstraction_Exercises.J_Mood3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split("\\|");

        switch (tokens[1].trim()){
            case "Demon":
                Heroe demon = new Demon(tokens[0].trim(),
                        Integer.parseInt(tokens[3].trim()),
                        Double.parseDouble(tokens[2].trim()));
                System.out.println(demon.toString());
                break;
            case "Archangel":
                Heroe archangel = new Archangel(tokens[0].trim(),
                        Integer.parseInt(tokens[3].trim()),
                        Integer.parseInt(tokens[2].trim()));
                System.out.println(archangel.toString());
                break;
        }
    }
}
