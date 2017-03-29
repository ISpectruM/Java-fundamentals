package D_EnumsAndAnnotations_Lab.G_CustomEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        EnumAnnotation annotation = getNeededAnnotation(input);
        System.out.printf("Type = %s, Description = %s",
                annotation.type(),
                annotation.description());
    }

    private static EnumAnnotation getNeededAnnotation(String input) {
        Class cl = null;

        if (input.equals("Rank")) {
            cl= CardRanks.class;
        }

        if (input.equals("Suit")) {
            cl = CardSuits.class;
        }
        EnumAnnotation annotation = (EnumAnnotation)cl.getAnnotation(EnumAnnotation.class);

        return annotation;
    }
}
