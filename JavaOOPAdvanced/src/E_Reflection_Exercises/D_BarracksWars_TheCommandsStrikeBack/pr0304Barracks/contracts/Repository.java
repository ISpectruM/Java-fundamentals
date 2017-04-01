package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts;


public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
