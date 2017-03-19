package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers.Mission;

import java.util.List;


public interface ICommando extends ISpecialisedSoldier, ISoldier{
    List<Mission> getMissions();
    void addMission(Mission mission);
}
