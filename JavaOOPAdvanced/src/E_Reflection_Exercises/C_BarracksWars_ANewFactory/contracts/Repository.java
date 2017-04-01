package E_Reflection_Exercises.C_BarracksWars_ANewFactory.contracts;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
