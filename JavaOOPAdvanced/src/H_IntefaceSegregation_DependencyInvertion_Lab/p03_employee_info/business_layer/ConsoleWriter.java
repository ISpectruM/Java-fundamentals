package H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.business_layer;

import H_IntefaceSegregation_DependencyInvertion_Lab.p03_employee_info.ui_layer.Writer;

public class ConsoleWriter implements Writer{
    @Override
    public void Write(String data) {
        System.out.println(data);
    }
}
