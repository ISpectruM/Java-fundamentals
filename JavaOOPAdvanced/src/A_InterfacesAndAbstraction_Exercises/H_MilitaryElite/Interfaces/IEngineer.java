package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers.Repair;

import java.util.List;

public interface IEngineer extends ISpecialisedSoldier, ISoldier{
    List<Repair> getRepairs();
    void addRepair(Repair repair);
}
