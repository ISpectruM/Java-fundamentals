package B_Generics_Exercises.E_GenericCountMethod_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        List<Box<String>> boxes = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String strings = reader.readLine();
            Box<String> box = new Box<>(strings);
            boxes.add(box);
        }

        Box<String> valueToCompare = new Box<>(reader.readLine());

        System.out.println(getGreaterElementsCount(boxes, valueToCompare));

    }

    private static <T extends Comparable<T>> int getGreaterElementsCount(List<Box<T>> boxes, Box<T> valueToCompare) {
        int count = 0;
        for (Box<T> box : boxes) {
            if (box.getAnyType().compareTo(valueToCompare.getAnyType()) > 0){
                count++;
            }
        }
        return count;
    }


}
