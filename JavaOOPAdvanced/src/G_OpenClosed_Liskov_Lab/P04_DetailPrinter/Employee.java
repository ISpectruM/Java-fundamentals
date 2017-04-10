package G_OpenClosed_Liskov_Lab.P04_DetailPrinter;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
