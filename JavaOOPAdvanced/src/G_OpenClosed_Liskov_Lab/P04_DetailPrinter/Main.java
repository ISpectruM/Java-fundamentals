package G_OpenClosed_Liskov_Lab.P04_DetailPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Worker("sasho", 2));
        employees.add(new Manager("Simo", "Docs","Doc1"));
        DetailsPrinter printer = new DetailsPrinter(employees);
        printer.printDetails();
    }
}
