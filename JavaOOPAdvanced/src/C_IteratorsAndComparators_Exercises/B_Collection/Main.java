package C_IteratorsAndComparators_Exercises.B_Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .skip(1)
                .toArray(String[]::new);

            ListyIterator list = new ListyIterator(strings);
            String input;
            while (!"END".equals(input = reader.readLine())){

                switch (input){
                    case "Move":
                        boolean move = list.move();
                        System.out.println(move);
                        break;

                    case "Print":
                        System.out.println(list);
                        break;

                    case "HasNext":
                        System.out.println(list.hasNext());
                        break;

                    case "PrintAll":
                        list.printAll();
                        System.out.println();
                        break;

                        default:
                            break;
                }
            }

    }
}
