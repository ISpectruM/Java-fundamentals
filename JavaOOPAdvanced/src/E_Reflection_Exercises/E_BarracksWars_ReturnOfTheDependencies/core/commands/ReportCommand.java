package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.commands;

import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Repository;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.Inject;

import java.lang.reflect.InvocationTargetException;

public class ReportCommand extends Command{
    @Inject
    private Repository repository;


    public ReportCommand(String[]data) {
        super(data);
    }

    public Repository getRepository() {
        return this.repository;
    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String output = this.getRepository().getStatistics();
        return output;
    }
}
