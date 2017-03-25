package C_IteratorsAndComparators_Exercises.C_StackIterator;

public interface Stack<Integer> extends Iterable<Integer>{
    void push(int... elements);
    void pop();
}
