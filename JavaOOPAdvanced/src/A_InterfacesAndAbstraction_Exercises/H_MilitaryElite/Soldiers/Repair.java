package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.IRepair;

public class Repair implements IRepair{
    private String name;
    private int hoursWorked;

    public Repair(String name, int hoursWorked) {
        this.setName(name);
        this.setHoursWorked(hoursWorked);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.name;
    }

    @Override
    public int getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d",
                this.getPartName(), this.getHoursWorked());
    }
}
