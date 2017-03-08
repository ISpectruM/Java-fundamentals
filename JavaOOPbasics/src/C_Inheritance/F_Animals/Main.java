package C_Inheritance.F_Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String type;
        while (!"Beast!".equals(type = reader.readLine())){
            String[] tokens = reader.readLine().split("\\s+");
            Animal animal = null;
            try {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);

                switch (type) {
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                    case "Cat":
                        animal = new Cat(name, age);
                        animal.setGender(tokens[2]);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, tokens[2]);
                        break;
                    case "Dog":
                        animal = new Dog(name, age, tokens[2]);
                        break;
                    case "Animal":
                        animal = new Animal(name,age);
                        animal.setGender(tokens[2]);
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }
                System.out.println(type);
                System.out.println(animal);
                animal.produceSound();

            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
    }
}
