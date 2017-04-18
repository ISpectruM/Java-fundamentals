package I_ObjectCommunicationAndEvents.B_Observers.models;

import I_ObjectCommunicationAndEvents.B_Observers.loggers.Handler;
import I_ObjectCommunicationAndEvents.B_Observers.loggers.LogType;
import I_ObjectCommunicationAndEvents.B_Observers.observer.ObservableTarget;
import I_ObjectCommunicationAndEvents.B_Observers.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements ObservableTarget {

    private static final String THIS_DIED_EVENT = "%s dies";

    private List<Observer> observers;
    private String id;
    private int hp;
    private int reward;
    private boolean eventTriggered;
    private Handler logger;

    public Dragon(String id, int hp, int reward, Handler logger) {
        this.id = id;
        this.hp = hp;
        this.reward = reward;
        this.logger = logger;
        this.observers = new ArrayList<>();
    }

    @Override
    public void receiveDamage(int dmg) {
        if (!this.isDead()) {
            this.hp -= dmg;
        }

        if (this.isDead() && !eventTriggered) {
            this.logger.handle(LogType.EVENT,String.format(THIS_DIED_EVENT, this));
            this.notifyObservers();
            this.eventTriggered = true;
        }
    }

    @Override
    public boolean isDead() {
        return this.hp <= 0;
    }

    @Override
    public String toString() {
        return this.id;
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.reward);
        }
    }
}
