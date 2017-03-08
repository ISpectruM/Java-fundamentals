package D_Polymorphism.C_Wildfarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.DoubleSummaryStatistics;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split("\\s+");
        while (!"End".equals(tokens[0])){
            String animalType = tokens[0];
            String animalName = tokens[1];
            double weight = Double.parseDouble(tokens[2]);
            String livingRegion = tokens[3];

            String[] foodTokens = reader.readLine().split("\\s+");
            String foodType = foodTokens[0];
            int foodAmount = Integer.parseInt(foodTokens[1]);


            Food food = null;
            if (foodType.equals("Vegetable")){
                food = new Vegetable(foodAmount);
            } else {
                food = new Meat(foodAmount);
            }

            Animal animal=null;
                switch (animalType) {
                    case "Mouse":
                        animal = new Mouse(animalName, animalType, weight, 0, livingRegion);
                        break;
                    case "Zebra":
                        animal = new Zebra(animalName,animalType,weight,0, livingRegion);
                        break;
                    case "Tiger":
                        animal = new Tiger(animalName,animalType,weight,0,livingRegion);
                        break;
                    case "Cat":
                        String breed = tokens[4];
                        animal = new Cat(animalName,animalType,weight,0,livingRegion,breed);
                        break;
                        default:
                            break;
                }
            animal.makeSound();
            animal.eat(food);
            System.out.println(animal);

            tokens = reader.readLine().split("\\s+");
        }
    }
}
