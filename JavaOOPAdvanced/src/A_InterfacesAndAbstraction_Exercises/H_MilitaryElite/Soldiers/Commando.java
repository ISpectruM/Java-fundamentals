package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.ICommando;

import java.util.ArrayList;
import java.util.List;

public class Commando extends SpecialisedSoldier implements ICommando {
    private List<Mission> missions;

    public Commando(int id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public List<Mission> getMissions() {
        return this.missions;
    }

    public void addMission(Mission mission) {
        if (mission != null){
            this.missions.add(mission);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString())
                .append("Missions:");
        for (Mission mission : missions) {
            result.append(System.lineSeparator())
                    .append("  ")
                    .append(mission.toString());
        }
        return result.toString();
    }
}
