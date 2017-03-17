package A_InterfacesAndAbstraction_Exercises.E_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Identity> habitants = new ArrayList<>();

        String input;
        while (!"End".equals(input = reader.readLine())){
            String[] tokens = input.split("\\s+");
            String model;
            String id;
            String name;
            Integer age;

            switch (tokens.length){
                case 2:
                    model = tokens[0];
                    id = tokens[1];
                    Identity robot = new Robot(model,id);
                    habitants.add(robot);
                    break;
                case 3:
                    name = tokens[0];
                    age = Integer.parseInt(tokens[1]);
                    id = tokens[2];
                    Identity citizen = new Citizen(name,age,id);
                    habitants.add(citizen);
                    break;
                default:
                    break;
            }
        }

        String fakeId = reader.readLine();
        for (Identity habitant : habitants) {
            if ("fake".equals(habitant.check(fakeId))){
                System.out.println(habitant.getId());
            }
        }
    }
}
