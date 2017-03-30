package B_Generics_Exercises.G_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomListImpl<String> custom = new CustomListImpl();

        String input;
        while (!"END".equals(input = reader.readLine())){

            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command){
                case "Add":
                    custom.add(tokens[1]);
                    break;
                case "Remove":
                    custom.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(custom.contains(tokens[1]));
                    break;
                case "Swap":
                    custom.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(custom.countGreaterThat(tokens[1]));
                    break;
                case "Max":
                    System.out.println(custom.getMax());
                    break;
                case "Min":
                    System.out.println(custom.getMin());
                    break;
                case "Print":
                    System.out.println(custom);
                    default:
                        break;
            }
        }
    }
}
