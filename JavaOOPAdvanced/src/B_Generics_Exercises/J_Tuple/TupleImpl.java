package B_Generics_Exercises.J_Tuple;

public class TupleImpl<T,P> implements Tuple<T,P>{
    private T item1;
    private P item2;

    public TupleImpl(T item1, P item2) {
        this.setItem1(item1);
        this.setItem2(item2);
    }

    @Override
    public String toString() {
        return String.format("%s -> %s",
                this.getItem1().toString(),
                this.getItem2().toString()
                );
    }

    public T getItem1() {
        return this.item1;
    }

    private void setItem1(T item1) {
        this.item1 = item1;
    }

    public P getItem2() {
        return this.item2;
    }

    private void setItem2(P item2) {
        this.item2 = item2;
    }
}
