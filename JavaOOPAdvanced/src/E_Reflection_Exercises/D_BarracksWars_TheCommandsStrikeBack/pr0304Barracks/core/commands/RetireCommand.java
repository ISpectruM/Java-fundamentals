package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core.commands;

import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Repository;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.UnitFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.InvocationTargetException;

public class RetireCommand extends Command{

    public RetireCommand(String[] data, UnitFactory unitFactory, Repository repository) {
        super(data, unitFactory, repository);
    }

    @Override
    public String execute() throws ClassNotFoundException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException {
        String unitType = this.getData()[1];
        try {
            this.getRepository().removeUnit(unitType);
            return unitType + " retired!";

        } catch (NotImplementedException nie){
            return "No such units in repository.";
        }
    }
}
