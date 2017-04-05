package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts;


public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
