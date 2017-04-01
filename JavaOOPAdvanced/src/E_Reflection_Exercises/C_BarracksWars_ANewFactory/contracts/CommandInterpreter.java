package E_Reflection_Exercises.C_BarracksWars_ANewFactory.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
