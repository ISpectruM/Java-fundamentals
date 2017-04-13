package H_IntefaceSegregation_DependencyInvertion_Lab.p04_recharge.models;

import H_IntefaceSegregation_DependencyInvertion_Lab.p04_recharge.Sleeper;
import H_IntefaceSegregation_DependencyInvertion_Lab.p04_recharge.Worker;

public class Employee extends Worker implements Sleeper {

    public Employee(String id) {
        super(id);
    }

    public void sleep() {
        // sleep...
    }
}
