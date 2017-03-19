package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces;

import java.util.List;

public interface ILeutenantGeneral extends ISoldier{

    List<ISoldier> getPrivates();
    void addPrivate(ISoldier soldier);
}
