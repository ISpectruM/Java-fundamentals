package I_ObjectCommunicationAndEvents.B_Observers.mediator;

import I_ObjectCommunicationAndEvents.B_Observers.models.Attacker;
import I_ObjectCommunicationAndEvents.B_Observers.observer.ObservableTarget;

import java.util.ArrayList;
import java.util.List;

public class Group implements AttackGroup{

    private List<Attacker> attackers;
    private ObservableTarget target;

    public Group() {
        this.attackers = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        this.attackers.add(attacker);
    }

    @Override
    public void groupTarget(ObservableTarget target) {
        for (Attacker attacker : attackers) {
            attacker.setTarget(target);
        }
    }

    @Override
    public void groupAttack() {
        for (Attacker attacker : attackers) {
            attacker.attack();
        }
    }
}
