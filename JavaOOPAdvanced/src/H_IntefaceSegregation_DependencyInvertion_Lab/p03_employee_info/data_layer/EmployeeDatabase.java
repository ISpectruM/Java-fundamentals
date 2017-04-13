package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.data_layer;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer.Database;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabase implements Database{

    public List<Employee> readEmployees() {
        List<Employee> employees = new ArrayList<>();
        Collections.addAll(employees,
                new Employee("Pesho", 20),
                new Employee("Gosho", 40));

        return employees;
    }
}
