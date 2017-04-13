package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.models.Employee;

import java.util.List;

public interface Database {
    List<Employee> readEmployees();
}
