package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.commands;

import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Repository;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Unit;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.UnitFactory;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.Inject;

import java.lang.reflect.InvocationTargetException;


public class AddCommand extends Command{
    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;


    public AddCommand(String[]data) {
        super(data);
    }

    public Repository getRepository() {
        return this.repository;
    }

    public UnitFactory getUnitFactory() {
        return this.unitFactory;
    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
            String unitType = this.getData()[1];
            Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
            this.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
