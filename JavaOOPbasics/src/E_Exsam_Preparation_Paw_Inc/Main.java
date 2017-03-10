package E_Exsam_Preparation_Paw_Inc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        AnimalCenterManager manager = new AnimalCenterManager();

        String input = reader.readLine();
        int age;
        int commands;
        String adoptionCenter;

        while (!"Paw Paw Pawah".equals(input)){
            String[] tokens = input.split("\\s+\\|\\s+");
            String command = tokens[0];
            String name = tokens[1];
            switch (command){
                case "RegisterAdoptionCenter":
                    manager.registerAdoptionCenter(name);
                    break;
                case "RegisterCleansingCenter":
                    manager.registerCleansingCenter(name);
                    break;
                case "RegisterDog":
                    age = Integer.parseInt(tokens[2]);
                    commands = Integer.parseInt(tokens[3]);
                    adoptionCenter = tokens[4];
                    manager.registerDog(name,age,commands,adoptionCenter);
                    break;
                case "RegisterCat":
                    age = Integer.parseInt(tokens[2]);
                    commands = Integer.parseInt(tokens[3]);
                    adoptionCenter = tokens[4];
                    manager.registerCat(name,age,commands,adoptionCenter);
                    break;
                case "SendForCleansing":
                    String cleanCenter = tokens[2];
                    manager.sendForCleansing(name,cleanCenter);
                    break;
                case "Cleanse":
                    manager.cleanse(name);
                    break;
                case "Adopt":
                    manager.adopt(name);
                    break;
                default:
                    break;
            }
            input = reader.readLine();
        }
        manager.printStatistics();
    }
}
