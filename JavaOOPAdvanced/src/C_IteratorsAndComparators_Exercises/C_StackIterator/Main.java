package C_IteratorsAndComparators_Exercises.C_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StackImpl stack = new StackImpl();
        String input;
        while (!"END".equals(input = reader.readLine())){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command){
                case "Push":
                    int[] elements = Arrays.stream(tokens)
                            .skip(1)
                            .map(e -> e.replaceAll(",",""))
                            .mapToInt(Integer::parseInt).toArray();
                        stack.push(elements);
                    break;
                case "Pop":
                    try{
                        stack.pop();
                    }catch (IndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }

    }
}
