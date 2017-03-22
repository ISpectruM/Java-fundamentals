package B_Generics_Exercises.A_GenericBox;

public class Box<T> {

    private T anyType;

    public Box(T anyType) {
        this.setAnyType(anyType);
    }

    public T getAnyType() {
        return anyType;
    }

    public void setAnyType(T anyType) {
        this.anyType = anyType;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.getAnyType().getClass().getTypeName(),
                this.getAnyType());
    }
}
