package Exam_Retake_08052017_Avatar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        WarCommander warCommander = new WarCommander();
        int warCount = 0;
        String input = "";

        while (!"Quit".equals(input = reader.readLine())){

            String[] tokens = input.split(" ");
            String command = tokens[0];
            String type = tokens[1];
            String name;

            switch (command){
                case "Bender":
                    name = tokens[2];
                    int power =Integer.parseInt(tokens[3]);
                    double secondParam = Double.parseDouble(tokens[4]);
                    warCommander.createBender(type,name,power,secondParam);
                    break;

                case "Monument":
                    name = tokens[2];
                    int bonus = Integer.parseInt(tokens[3]);
                    warCommander.createMonument(type,name,bonus);
                    break;

                case "Status":
                    System.out.print(warCommander.getStatus(type));
                    break;

                case "War":
                    warCount++;
                    warCommander.startWar(type,warCount);
                    break;
            }
        }

        System.out.print(warCommander.quit());
    }
}
