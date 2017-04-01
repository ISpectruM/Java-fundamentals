package E_Reflection_Exercises.C_BarracksWars_ANewFactory;

import E_Reflection_Exercises.C_BarracksWars_ANewFactory.contracts.Repository;
import E_Reflection_Exercises.C_BarracksWars_ANewFactory.contracts.Runnable;
import E_Reflection_Exercises.C_BarracksWars_ANewFactory.contracts.UnitFactory;
import E_Reflection_Exercises.C_BarracksWars_ANewFactory.core.Engine;
import E_Reflection_Exercises.C_BarracksWars_ANewFactory.core.factories.UnitFactoryImpl;
import E_Reflection_Exercises.C_BarracksWars_ANewFactory.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
