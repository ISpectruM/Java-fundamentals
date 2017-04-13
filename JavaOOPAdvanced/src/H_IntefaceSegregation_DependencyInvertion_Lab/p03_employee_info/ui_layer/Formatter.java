package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.models.Employee;

public interface Formatter {
    String format(Iterable<Employee> employees);
}
