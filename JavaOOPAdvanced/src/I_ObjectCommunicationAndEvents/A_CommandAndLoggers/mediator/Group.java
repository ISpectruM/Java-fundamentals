package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.mediator;

import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Attacker;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Target;

import java.util.ArrayList;
import java.util.List;

public class Group implements AttackGroup{

    private List<Attacker> attackers;
    private Target target;

    public Group() {
        this.attackers = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        this.attackers.add(attacker);
    }

    @Override
    public void groupTarget(Target target) {
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
