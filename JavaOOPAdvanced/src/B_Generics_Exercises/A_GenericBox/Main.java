package B_Generics_Exercises.A_GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String strings = reader.readLine();
            Box box = new Box(strings);
            System.out.println(box);

        }
    }
}
