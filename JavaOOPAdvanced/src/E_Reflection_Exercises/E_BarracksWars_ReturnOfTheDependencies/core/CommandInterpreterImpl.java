package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core;

import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.CommandInterpreter;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Executable;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Repository;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter{
    private static final String COMMANDS_PACKAGE_NAME =
            "E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }


    @Override
    public Executable interpretCommand(String[] data, String commandName) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchMethodException {
        Executable instance = null;
        try {
            String parsedCommand = commandName.substring(0, 1).toUpperCase() + commandName.substring(1).toLowerCase();
            Class commandClass = Class.forName(COMMANDS_PACKAGE_NAME + parsedCommand + "Command");

            Constructor constructor = commandClass.getConstructor(String[].class);

            instance = (Executable) constructor.newInstance(new Object[]{data});

            this.injectDependancies(instance,commandClass);


        }catch (ClassNotFoundException cnfe){
            throw new RuntimeException("Invalid command!");
        }
        return instance;
    }

    private void injectDependancies(Executable instance, Class commandClass) throws IllegalAccessException {

        Field[] comFields = commandClass.getDeclaredFields();
        for (Field comField : comFields) {
            if (!comField.isAnnotationPresent(Inject.class)){
                continue;
            }

            comField.setAccessible(true);

            Field[] interpreterFields = CommandInterpreterImpl.class.getDeclaredFields();
            for (Field interpreterField : interpreterFields) {
                if (!interpreterField.getType().equals(comField.getType())){
                    continue;
                }

                interpreterField.setAccessible(true);
                comField.set(instance,interpreterField.get(this));
            }
        }
    }
}
