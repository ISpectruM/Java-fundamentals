package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.ISpy;

public class Spy extends Soldier implements ISpy {
    private int codeNumber;

    public Spy(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    private void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\nCode Number: %d",
                super.toString(),
                this.getCodeNumber());
    }

}
