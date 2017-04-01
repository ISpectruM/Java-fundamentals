package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core.commands;


import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Executable;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Repository;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.UnitFactory;

public abstract class Command implements Executable {
    private String[]data;
    private UnitFactory unitFactory;
    private Repository repository;

    public Command(String[] data, UnitFactory unitFactory, Repository repository) {
        this.data = data;
        this.unitFactory = unitFactory;
        this.repository = repository;
    }

    protected String[] getData() {
        return this.data;
    }

    protected UnitFactory getUnitFactory() {
        return this.unitFactory;
    }

    protected Repository getRepository() {
        return this.repository;
    }
}
