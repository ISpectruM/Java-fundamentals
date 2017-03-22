package B_Generics_Exercises.C_GenericSwapMethodString;

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

        String[] indexes = reader.readLine().split(" ");
        swapElements(boxes, indexes);

        for (Box box : boxes) {
            System.out.println(box);
        }
    }

    private static <T> void swapElements(List<T> list, String[] indexes) {
        int fromIndex = Integer.parseInt(indexes[0]);
        int toIndex = Integer.parseInt(indexes[1]);

        T temp =  list.get(fromIndex);
        list.set(fromIndex, list.get(toIndex));
        list.set(toIndex,temp);
    }
}
