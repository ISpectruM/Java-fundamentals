package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers;


import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.IEngineer;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends SpecialisedSoldier implements IEngineer {
    private List<Repair> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    public void addRepair(Repair repair) {
        if (repair != null){
            this.repairs.add(repair);
        }
    }

    @Override
    public List<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(super.toString())
                .append("Repairs:");
        for (Repair repair : this.getRepairs()) {
            result.append(System.lineSeparator())
                    .append("  ")
                    .append(repair.toString());
        }

        return result.toString();
    }
}
