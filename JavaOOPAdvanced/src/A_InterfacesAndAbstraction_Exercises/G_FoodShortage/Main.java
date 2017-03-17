package A_InterfacesAndAbstraction_Exercises.G_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Buyer> peoples = new HashMap<>();

        int numBuyers = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numBuyers; i++) {
            Buyer buyer = null;
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens.length == 4){
                buyer = new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2], tokens[3]);
            }else {
                buyer = new Rebel(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
            }
            peoples.put(buyer.getName(),buyer);
        }

        String input;
        while (!"End".equals(input = reader.readLine())){
            String name  = input;
                if (peoples.containsKey(name)) {
                    peoples.get(name).buyFood();
                }
        }

        int sum = 0;

        for (Buyer buyer : peoples.values()) {
            sum += buyer.getFood();
        }

        System.out.println(sum);
    }
}
