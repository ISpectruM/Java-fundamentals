package I_ObjectCommunicationAndEvents.models;

import I_ObjectCommunicationAndEvents.loggers.Handler;
import I_ObjectCommunicationAndEvents.loggers.LogType;

public class Dragon implements Target {

    private static final String THIS_DIED_EVENT = "%s dies";


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
    }

    @Override
    public void receiveDamage(int dmg) {
        if (!this.isDead()) {
            this.hp -= dmg;
        }

        if (this.isDead() && !eventTriggered) {
            this.logger.handle(LogType.EVENT,String.format(THIS_DIED_EVENT, this));
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
}
