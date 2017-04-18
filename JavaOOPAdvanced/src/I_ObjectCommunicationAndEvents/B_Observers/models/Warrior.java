package I_ObjectCommunicationAndEvents.B_Observers.models;

import I_ObjectCommunicationAndEvents.B_Observers.loggers.Handler;
import I_ObjectCommunicationAndEvents.B_Observers.loggers.LogType;

public class Warrior extends AbstractHero {

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";

    public Warrior(String id, int dmg, Handler logger) {
        super(id, dmg, logger);
    }

    @Override
    protected void executeClassSpecificAttack(Target target, int dmg, Handler logger) {
        logger.handle(LogType.ATTACK, String.format(ATTACK_MESSAGE, this, target, dmg));
        target.receiveDamage(dmg);
    }

}
