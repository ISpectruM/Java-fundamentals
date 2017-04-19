package I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts;

public interface Attackable extends Subject {

    void killGuard(String name);

    void alarmForAttack();
}
