package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core.commands;

import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Repository;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Unit;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;


public class AddCommand extends Command{

    public AddCommand(String[] data, UnitFactory unitFactory, Repository repository) {
        super(data, unitFactory, repository);
    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
            String unitType = this.getData()[1];
            Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
            this.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
