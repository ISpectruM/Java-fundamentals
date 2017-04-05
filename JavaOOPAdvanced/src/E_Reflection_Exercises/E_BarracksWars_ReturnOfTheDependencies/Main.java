package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies;

import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Repository;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Runnable;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.UnitFactory;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.Engine;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.core.factories.UnitFactoryImpl;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
