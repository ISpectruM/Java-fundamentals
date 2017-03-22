package B_Generics_Lab.E_NullFinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1,null,2);
        System.out.println(ListUtils.getNullIndices(integers));
    }
}
