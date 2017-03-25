package C_IteratorsAndComparators_Exercises.A_ListyIterator;

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
                        System.out.println(list.move());
                        break;
                    case "Print":
                        System.out.println(list);
                        break;
                    case "HasNext":
                        System.out.println(list.hasNext());
                        break;
                        default:
                            break;
                }
            }

    }
}
