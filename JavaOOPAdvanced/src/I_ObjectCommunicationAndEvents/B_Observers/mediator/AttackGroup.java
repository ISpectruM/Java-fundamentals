package I_ObjectCommunicationAndEvents.B_Observers.mediator;

import I_ObjectCommunicationAndEvents.B_Observers.models.Attacker;
import I_ObjectCommunicationAndEvents.B_Observers.observer.ObservableTarget;

public interface AttackGroup {

    void addMember(Attacker attacker);

    void groupTarget(ObservableTarget target);

    void groupAttack();
}
