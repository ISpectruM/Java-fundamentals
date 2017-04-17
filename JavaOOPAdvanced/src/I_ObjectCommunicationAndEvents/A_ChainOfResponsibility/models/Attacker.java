package I_ObjectCommunicationAndEvents.A_ChainOfResponsibility.models;

public interface Attacker {
    void attack();
    void setTarget(Target target);
}
