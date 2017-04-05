package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.commands;

import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Repository;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.Inject;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.InvocationTargetException;

public class RetireCommand extends Command{
    @Inject
    private Repository repository;


    public RetireCommand(String[] data) {
        super(data);
    }

    public Repository getRepository() {
        return this.repository;
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
