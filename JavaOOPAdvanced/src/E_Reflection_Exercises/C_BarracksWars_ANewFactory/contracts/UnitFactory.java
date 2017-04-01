package E_Reflection_Exercises.C_BarracksWars_ANewFactory.contracts;

import java.lang.reflect.InvocationTargetException;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException;
}