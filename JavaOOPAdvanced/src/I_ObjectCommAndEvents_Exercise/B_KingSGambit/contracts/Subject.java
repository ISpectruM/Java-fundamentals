package I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts;

public interface Subject {

    void register(Defender observer);

    void unregister(Defender observer);

    void notifyObservers();

}
