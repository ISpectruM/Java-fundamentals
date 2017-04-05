package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts;

import java.lang.reflect.InvocationTargetException;

public interface Executable {

	String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException;

}
