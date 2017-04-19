package I_ObjectCommAndEvents_Exercise.B_KingSGambit.models;

import I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts.Attackable;
import I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts.Defender;

import java.util.LinkedHashMap;
import java.util.Map;

public class King extends Unit implements Attackable{

    private Map<String, Defender> guards;

    public King(String name) {
        super(name);
        this.guards = new LinkedHashMap<>();
    }

    @Override
    public void killGuard(String name) {
        this.guards.remove(name);
    }

    @Override
    public void alarmForAttack() {
        System.out.printf("King %s is under attack!%n", super.getName());
        this.notifyObservers();
    }

    @Override
    public void register(Defender observer) {
        this.guards.put(observer.getName(),observer);
    }

    @Override
    public void unregister(Defender observer) {

    }

    @Override
    public void notifyObservers() {
        for (String s : this.guards.keySet()) {
            this.guards.get(s).update();
        }
    }
}
