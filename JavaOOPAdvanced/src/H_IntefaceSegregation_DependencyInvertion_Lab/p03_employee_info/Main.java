package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer.ConsoleFormatter;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer.ConsoleWriter;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer.EmployeeInfoProvider;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.data_layer.EmployeeDatabase;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer.ConsoleClient;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer.Formatter;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer.InfoProvider;
import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer.Writer;

public class Main {

    public static void main(String[] args) {
        InfoProvider employeeInfo = new EmployeeInfoProvider(new EmployeeDatabase());
        Formatter formatter = new ConsoleFormatter();
        ConsoleClient client = new ConsoleClient(formatter, employeeInfo);
        Writer consoleWriter = new ConsoleWriter();

        consoleWriter.Write(client.formatByName());
        consoleWriter.Write(client.formatBySalary());
    }
}
