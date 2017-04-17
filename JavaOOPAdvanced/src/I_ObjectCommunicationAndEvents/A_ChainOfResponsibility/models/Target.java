package I_ObjectCommunicationAndEvents.A_ChainOfResponsibility.models;

public interface Target {
    void receiveDamage(int dmg);
    boolean isDead();
}