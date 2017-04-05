package E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.data;

import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Repository;
import E_Reflection_Exercises.E_BarracksWars_ReturnOfTheDependencies.contracts.Unit;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;
import java.util.TreeMap;

public class UnitRepository implements Repository {

	private Map<String, Integer> amountOfUnits;

	public UnitRepository() {
		this.amountOfUnits = new TreeMap<>();
	}

	public Map<String, Integer> getAmountOfUnits() {
		return this.amountOfUnits;
	}

	public void addUnit(Unit unit) {
		String unitType = unit.getClass().getSimpleName();
		if (!this.amountOfUnits.containsKey(unitType)) {
			this.amountOfUnits.put(unitType, 0);
		}

		int newAmount = this.amountOfUnits.get(unitType) + 1;
		this.amountOfUnits.put(unitType, newAmount);
	}

	public String getStatistics() {
		StringBuilder statBuilder = new StringBuilder();
		for (Map.Entry<String, Integer> entry : amountOfUnits.entrySet()) {
			String formatedEntry =
					String.format("%s -> %d%n", entry.getKey(), entry.getValue());
			statBuilder.append(formatedEntry);
		}
		statBuilder.setLength(
				statBuilder.length() - System.lineSeparator().length());

		return statBuilder.toString();
	}

	public void removeUnit(String unitType) {
		// TODO: implement for problem 4
		if(this.getAmountOfUnits().containsKey(unitType) && this.getAmountOfUnits().get(unitType)>0){
			int newAmount = this.amountOfUnits.get(unitType) - 1;
			this.amountOfUnits.put(unitType, newAmount);
		}else {
			throw new NotImplementedException();
		}
	}
}
