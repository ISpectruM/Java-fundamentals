package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.ISpecialisedSoldier;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    private String corps;

    protected SpecialisedSoldier(int id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        if ("Airforces".equals(corps) || "Marines".equals(corps)) {
            this.corps = corps;
        }
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return String.format("%s\nCorps: %s\n",
                super.toString(),
                this.getCorps());
    }
}
