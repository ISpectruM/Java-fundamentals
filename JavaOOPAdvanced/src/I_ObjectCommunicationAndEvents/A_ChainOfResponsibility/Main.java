package I_ObjectCommunicationAndEvents.A_ChainOfResponsibility;

import loggers.*;
import models.Attacker;
import models.Dragon;
import models.Target;
import models.Warrior;

public class Main {
    public static void main(String[] args) {
        Handler combatLogger = new CombatLogger();
        Handler eventLogger = new EventLogger();
        combatLogger.setSuccessor(eventLogger);
        Handler targetLogger = new TargetLogger();
        eventLogger.setSuccessor(targetLogger);
        Handler errorLogger = new ErrorLogger();
        targetLogger.setSuccessor(errorLogger);

        Attacker hero  = new Warrior("Pesho",10,combatLogger);
        Target dragon = new Dragon("Drago", 5,100, combatLogger);
        hero.attack();

        hero.setTarget(dragon);
        hero.attack();

        hero.attack();
    }
}
