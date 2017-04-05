package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.factories;

import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Unit;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.UnitFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		try{
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME+unitType);
			return (Unit) unitClass.newInstance();
		}catch (ClassNotFoundException cnf){
			throw new NotImplementedException();
		}
//		try {
//			ClassLoader classLoader = UnitFactoryImpl.class.getClassLoader();
//			Class aClass = classLoader.loadClass(UNITS_PACKAGE_NAME + unitType);
//
//			Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
//			Constructor constructor = declaredConstructors[0];
//			Unit instance = (Unit) constructor.newInstance();
//			return instance;
//		}catch (ClassNotFoundException iae){
//			throw new NotImplementedException();
//		}
	}


}
