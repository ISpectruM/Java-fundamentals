package B_Generics_Exercises.K_Threeuple;

public class ThreeupleImpl<T,P,E> implements Threeuple<T,P,E>{
    private T item1;
    private P item2;
    private E item3;

    public ThreeupleImpl(T item1, P item2, E item3) {
        this.setItem3(item3);
        this.setItem1(item1);
        this.setItem2(item2);
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",
                this.getItem1().toString(),
                this.getItem2().toString(),
                this.getitem3().toString()
                );
    }
    @Override
    public T getItem1() {
        return this.item1;
    }

    private void setItem1(T item1) {
        this.item1 = item1;
    }

    @Override
    public P getItem2() {
        return this.item2;
    }

    private void setItem2(P item2) {
        this.item2 = item2;
    }

    @Override
    public E getitem3() {
        return this.item3;
    }

    private void setItem3(E item3) {
        this.item3 = item3;
    }

    public boolean isDrunk(){
        if (this.getitem3().equals("drunk")){
            return true;
        }
        return false;
    }
}
