package B_Generics_Lab.G_GenericAddAllMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1,3,2);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 2.5,3.6,4.5);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings,"a","c");

        List<? super Object> dest = new ArrayList<>();
        ListUtils.addAll(dest,integers);
        ListUtils.addAll(dest, doubles);
        ListUtils.addAll(dest, strings);
        System.out.println(dest);
    }
}
