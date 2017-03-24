package B_Generics_Exercises.I_CustomListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomListImpl<T extends Comparable<T>> implements CustomList<T>, Iterable<T> {
    private List<T> data;

    public CustomListImpl() {
        this.data = new ArrayList<>();
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (T data : this.getData()) {
//            sb.append(data).append(System.lineSeparator());
//        }
//        return sb.toString().trim();
//
//    }

    public List<T> getData() {
        return this.data;
    }

    @Override
    public void add(T element) {
        this.getData().add(element);
    }

    @Override
    public T remove(int index) {
        return this.getData().remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.data.contains(element);
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        T temp =  this.data.get(firstIndex);
        this.data.set(firstIndex, this.data.get(secondIndex));
        this.data.set(secondIndex,temp);

    }

    @Override
    public int countGreaterThat(T element) {
        int count = 0;
        for (T value : this.getData()) {
            if (value.compareTo(element) > 0){
                count++;
            }
        }

        return count;
    }

    @Override
    public T getMax() {
        T max = this.getData().get(0);
        for (int i = 1; i < this.getData().size(); i++) {
            if (max.compareTo(this.getData().get(i)) < 0){
                max = this.getData().get(i);
            }
        }
        return max;
    }

    @Override
    public T getMin() {
        T min = this.getData().get(0);
        for (int i = 1; i < this.getData().size(); i++) {
            if (min.compareTo(this.getData().get(i)) > 0){
                min = this.getData().get(i);
            }
        }
        return min;
    }

    @Override
    public void sort() {
        this.getData().sort(Comparable::compareTo);
    }

    @Override
    public Iterator<T> iterator() {
        return this.getData().iterator();
    }
}
