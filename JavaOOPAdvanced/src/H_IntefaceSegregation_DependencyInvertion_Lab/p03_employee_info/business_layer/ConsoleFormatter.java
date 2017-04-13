package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.models.Employee;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer.Formatter;

public class ConsoleFormatter implements Formatter{

    public String format(Iterable<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
