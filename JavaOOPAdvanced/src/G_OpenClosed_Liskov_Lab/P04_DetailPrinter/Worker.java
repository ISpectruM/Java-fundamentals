package G_OpenClosed_Liskov_Lab.P04_DetailPrinter;

public class Worker extends Employee{

    private int id;


    public Worker(String name, int id) {
        super(name);
        this.id = id;
    }
}
