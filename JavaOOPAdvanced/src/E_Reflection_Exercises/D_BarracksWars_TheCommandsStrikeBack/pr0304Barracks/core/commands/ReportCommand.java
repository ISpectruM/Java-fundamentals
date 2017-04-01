package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core.commands;

import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Repository;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class ReportCommand extends Command{

    public ReportCommand(String[] data, UnitFactory unitFactory, Repository repository) {
        super(data, unitFactory, repository);
    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String output = this.getRepository().getStatistics();
        return output;
    }
}
