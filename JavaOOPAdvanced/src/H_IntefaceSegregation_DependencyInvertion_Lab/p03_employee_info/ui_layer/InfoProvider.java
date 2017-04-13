package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.models.Employee;

import java.util.Comparator;

public interface InfoProvider {
    Iterable<Employee> getEmployeesBy(Comparator<Employee> comparable);
}
