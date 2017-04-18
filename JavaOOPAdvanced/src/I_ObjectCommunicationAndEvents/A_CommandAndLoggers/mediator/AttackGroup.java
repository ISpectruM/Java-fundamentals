package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.mediator;

import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Attacker;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Target;

public interface AttackGroup {

    void addMember(Attacker attacker);

    void groupTarget(Target target);

    void groupAttack();
}
