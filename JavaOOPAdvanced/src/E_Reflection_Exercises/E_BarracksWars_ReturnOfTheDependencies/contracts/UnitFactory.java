package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts;

import java.lang.reflect.InvocationTargetException;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException;
}