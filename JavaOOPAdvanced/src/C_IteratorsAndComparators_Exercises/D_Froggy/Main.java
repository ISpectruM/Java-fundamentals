package C_IteratorsAndComparators_Exercises.D_Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lake lake = null;
        String input;
        while (!"END".equals(input = reader.readLine())){
            Integer[] tokens = Stream.of(input.split(", | "))
                    .map(Integer::parseInt).toArray(Integer[]::new);
            lake = new Lake(tokens);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer integer : lake) {
            sb.append(integer);
            if (lake.getLenghtCounter()< lake.getLake().size()){
                sb.append(", ");
            }
            lake.increaseIndex(2);
        }
        System.out.println(sb);
    }
}
