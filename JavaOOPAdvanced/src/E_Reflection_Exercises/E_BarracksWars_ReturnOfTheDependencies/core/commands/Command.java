package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.commands;


import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Executable;

public abstract class Command implements Executable {
    private String[] data;

    public Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return this.data;
    }

}
