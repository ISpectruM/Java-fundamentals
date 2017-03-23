package B_Generics_Exercises.G_CustomList;

public interface CustomList<T extends Comparable<T>> {

    void add(T element);
    T remove(int index);
	boolean contains(T element);
	void swap(int firstIndex, int secondIndex);
	int countGreaterThat(T element);
	T getMax();
	T getMin();
}
