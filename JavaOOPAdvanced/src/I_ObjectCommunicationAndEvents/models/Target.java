package I_ObjectCommunicationAndEvents.models;

public interface Target {
    void receiveDamage(int dmg);
    boolean isDead();
}