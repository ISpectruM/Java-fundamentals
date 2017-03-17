package A_InterfacesAndAbstraction_Exercises.F_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthable> habitants = new ArrayList<>();

        String input;
        while (!"End".equals(input = reader.readLine())){
            String[] tokens = input.split("\\s+");
            String name;
            String id;
            Integer age;
            String birthdate;

            switch (tokens[0]){
                case "Pet":
                    name = tokens[1];
                    birthdate = tokens[2];
                    Birthable pet = new Pet(name,birthdate);
                    habitants.add(pet);
                    break;
                case "Citizen":
                    name = tokens[1];
                    age = Integer.parseInt(tokens[2]);
                    id = tokens[3];
                    birthdate = tokens[4];
                    Birthable citizen = new Citizen(name,age,id,birthdate);
                    habitants.add(citizen);
                    break;
                default:
                    break;
            }
        }

        String year = reader.readLine();
        for (Birthable habitant : habitants) {
            if (habitant.isYearMaching(year)){
                System.out.println(habitant.getBirthDate());
            }
        }
    }
}
