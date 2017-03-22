package B_Generics_Exercises.B_GenericBoxOfInteger;

public class Box<T> {

    private T anyType;

    public Box(T anyType) {
        this.setAnyType(anyType);
    }

    public T getAnyType() {
        return anyType;
    }

    private void setAnyType(T anyType) {
        this.anyType = anyType;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.getAnyType().getClass().getTypeName(),
                this.getAnyType());
    }
}
