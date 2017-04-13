package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.models.Employee;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer.InfoProvider;

import java.util.Comparator;
import java.util.stream.Collectors;

public class EmployeeInfoProvider implements InfoProvider{

    private Database database;

    public EmployeeInfoProvider(Database database) {
        this.database = database;
    }

    public Iterable<Employee> getEmployeesBy(Comparator<Employee> comparator) {
        return this.database.readEmployees().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
