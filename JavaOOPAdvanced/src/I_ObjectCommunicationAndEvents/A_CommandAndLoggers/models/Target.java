package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models;

public interface Target {
    void receiveDamage(int dmg);
    boolean isDead();
}