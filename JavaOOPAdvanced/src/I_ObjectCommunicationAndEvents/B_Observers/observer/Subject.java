package I_ObjectCommunicationAndEvents.B_Observers.observer;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}
