package D_EnumsAndAnnotations_Lab.C_CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        String input;
        while (!"END".equals(input = reader.readLine())){
            String[] tokens = input.split(" ");

            if (tokens.length == 1){
                coffeeMachine.insertCoin(tokens[0]);
            } else {
                coffeeMachine.buyCoffee(tokens[0],tokens[1]);
            }
        }

        for (Coffee coffee : coffeeMachine.coffeesSold()) {
            System.out.println(coffee + " sold");
        }
    }
}
