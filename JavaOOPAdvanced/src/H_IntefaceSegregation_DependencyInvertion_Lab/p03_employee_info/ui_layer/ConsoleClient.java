package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer;


import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.models.Employee;

import java.util.Comparator;

public class ConsoleClient {
    private Formatter formatter;
    private InfoProvider infoProvider;

    public ConsoleClient(Formatter formatter, InfoProvider infoProvider) {
        this.formatter = formatter;
        this.infoProvider = infoProvider;
    }

    public String formatByName(){
        return (this.formatter.format(infoProvider.getEmployeesBy(
                Comparator.comparing(Employee::getName))));
    }

    public String formatBySalary(){
        return (this.formatter.format(infoProvider.getEmployeesBy(
                Comparator.comparingInt(Employee::getSalary))));

    }
}
