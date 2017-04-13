package H_IntefaceSegregation_DependencyInvertion_Lab.p04_recharge.models;

import H_IntefaceSegregation_DependencyInvertion_Lab.p04_recharge.Rechargeable;
import H_IntefaceSegregation_DependencyInvertion_Lab.p04_recharge.Worker;

public class Robot extends Worker implements Rechargeable {

    private int capacity;
    private int currentPower;

    public Robot(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCurrentPower() {
        return this.currentPower;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    public void work(int hours) {
        if (hours > this.currentPower) {
            hours = this.currentPower;
        }

        super.work(hours);
        this.currentPower -= hours;
    }

    public void recharge() {
        this.currentPower = this.capacity;
    }

}
