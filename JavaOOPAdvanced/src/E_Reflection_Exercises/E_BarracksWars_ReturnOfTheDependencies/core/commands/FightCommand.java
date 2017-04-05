package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.commands;

import java.lang.reflect.InvocationTargetException;

public class FightCommand extends Command{

    public FightCommand(String[]data) {
        super(data);
    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return "fight";
    }
}
