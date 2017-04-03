package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core;

import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.CommandInterpreter;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Executable;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Repository;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter{
    private static final String COMMANDS_PACKAGE_NAME =
            "E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }


    @Override
    public Executable interpretCommand(String[] data, String commandName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        try {
            String parsedCommand = commandName.substring(0, 1).toUpperCase() + commandName.substring(1).toLowerCase();
            Class commandClass = Class.forName(COMMANDS_PACKAGE_NAME + parsedCommand + "Command");

            Constructor[] constructors = commandClass.getDeclaredConstructors();
            Executable instance = (Executable) constructors[0]
                    .newInstance(data, this.unitFactory, this.repository);
            return instance;

        }catch (ClassNotFoundException cnfe){
            throw new RuntimeException("Invalid command!");
        }

    }
}
