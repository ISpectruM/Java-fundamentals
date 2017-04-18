package I_ObjectCommunicationAndEvents.mediator;

import I_ObjectCommunicationAndEvents.models.Attacker;
import I_ObjectCommunicationAndEvents.models.Target;

public interface AttackGroup {

    void addMember(Attacker attacker);

    void groupTarget(Target target);

    void groupAttack();
}
