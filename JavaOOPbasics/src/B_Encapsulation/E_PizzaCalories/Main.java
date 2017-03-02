package B_Encapsulation.E_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input;
            while (!"END".equals(input = reader.readLine())) {
                String[] tokens = input.split("\\s+");

                if ("Dough".equals(tokens[0])){
                    String flourType = tokens[1];
                    String bakeType = tokens[2];
                    double flourWeight = Double.parseDouble(tokens[3]);

                    Dough dough = new Dough(flourType, bakeType, flourWeight);
                    System.out.printf("%.2f%n",dough.getCalories());

                } else if ("Topping".equals(tokens[0])){
                    String toppingType = tokens[1];
                    double toppingWeight = Double.parseDouble(tokens[2]);

                    Topping topping = new Topping(toppingType, toppingWeight);
                    System.out.printf("%.2f%n",topping.getTotalCalories());

                }else if ("Pizza".equals(tokens[0])) {
                    String pizzaName = tokens[1];
                    int toppingsCount = Integer.parseInt(tokens[2]);

                    Pizza pizza = new Pizza(pizzaName);
                    pizza.setToppingsCount(toppingsCount);

                    String[] doughTokens = reader.readLine().split("\\s+");
                    String flourType = doughTokens[1];
                    String bakeType = doughTokens[2];
                    double flourWeight = Double.parseDouble(doughTokens[3]);

                    Dough currDough = new Dough(flourType, bakeType, flourWeight);

                    pizza.setDough(currDough);

                    for (int i = 0; i < toppingsCount; i++) {
                        String[] toppingInput = reader.readLine().split("\\s+");
                        String toppingType = toppingInput[1];
                        double toppingWeight = Double.parseDouble(toppingInput[2]);

                        Topping currTopping = new Topping(toppingType, toppingWeight);
                        pizza.addTopping(currTopping);
                    }

                    System.out.printf("%s - %.2f", pizza.getName(), pizza.getCalories());
                }
            }
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
