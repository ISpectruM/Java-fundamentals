package I_ObjectCommunicationAndEvents.B_Observers.models;

import I_ObjectCommunicationAndEvents.B_Observers.observer.ObservableTarget;

public interface Attacker {
    void attack();
    void setTarget(ObservableTarget target);
}
