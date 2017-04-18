package I_ObjectCommunicationAndEvents.B_Observers.models;

public interface Target {
    void receiveDamage(int dmg);
    boolean isDead();
}