package B_Generics_Exercises.K_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ThreeupleImpl<?,?,?> tuple = null;

        for (int i = 0; i < 3; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens.length == 4){
                String name = tokens[0] + " " + tokens[1];
                tuple = new ThreeupleImpl<>(name, tokens[2], tokens[3]);
            }else {
                try {
                    Integer beers = Integer.parseInt(tokens[1]);
                    tuple = new ThreeupleImpl<>(tokens[0], tokens[1], isDrink(tokens[2]));


                }catch (NumberFormatException nfe){
                    Double account = Double.parseDouble(tokens[1]);
                    tuple = new ThreeupleImpl<>(tokens[0],
                            account, tokens[2]);
                }
            }
            System.out.println(tuple);
        }
    }

    private static boolean isDrink(String token) {
        if (token.equals("drunk")) return true;
        return false;
    }
}
