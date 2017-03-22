package B_Generics_Lab.G_GenericAddAllMethod;

import java.util.ArrayList;
import java.util.List;

public  class ListUtils {

    public static  <T> void addAll(List<? super T> destination, List<T> source){
        destination.addAll(source);
    }

    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source){
        for (List<? extends T > list : source) {
            destination.addAll(list);
        }
    }

    public static <T> List<Integer> getNullIndices(List<T> list){
        List<Integer> nulls = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null){
                nulls.add(i);
            }
        }
        return nulls;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        T max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMin (List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }

        T min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0){
                min = list.get(i);
            }
        }
        return min;
    }
}
