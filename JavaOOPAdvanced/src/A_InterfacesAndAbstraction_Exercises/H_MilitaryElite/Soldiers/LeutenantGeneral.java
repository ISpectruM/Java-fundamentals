package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.ILeutenantGeneral;
import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.ISoldier;

import java.util.ArrayList;
import java.util.List;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private List<ISoldier> privates;

    public LeutenantGeneral(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public List<ISoldier> getPrivates() {
        return this.privates;
    }

    @Override
    public void addPrivate(ISoldier soldier) {
        this.privates.add(soldier);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString())
                .append(System.lineSeparator())
                .append("Privates:");
        for (ISoldier aPrivate : this.getPrivates()) {
            result.append(System.lineSeparator())
                    .append("  ")
                    .append(aPrivate.toString());
        }
        return result.toString();
    }
}
