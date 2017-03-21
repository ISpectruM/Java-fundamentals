package B_Generics_Lab.D_ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a","z","b");
        System.out.println(ListUtils.getMin(list));
    }
}
