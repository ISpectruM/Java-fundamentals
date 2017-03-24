package B_Generics_Exercises.J_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TupleImpl<?,?> tuple = null;

        for (int i = 0; i < 3; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            if (tokens.length == 3){
                String name = tokens[0] + " " + tokens[1];
                tuple = new TupleImpl<Object, Object>(name, tokens[2]);
            }else {
                try {
                    int integer = Integer.parseInt(tokens[0]);

                    tuple = new TupleImpl<Integer, Double>(integer,
                            Double.parseDouble(tokens[1]));

                }catch (NumberFormatException nfe){
                    tuple = new TupleImpl<String, String>(tokens[0], tokens[1]);
                }
            }
            System.out.println(tuple);
        }
    }
}
