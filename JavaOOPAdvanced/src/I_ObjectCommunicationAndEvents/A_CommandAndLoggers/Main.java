package I_ObjectCommunicationAndEvents.A_CommandAndLoggers;


import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.Command;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.CommandExecutor;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.Executor;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.group.GroupTargetCommand;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.loggers.*;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.mediator.AttackGroup;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.mediator.Group;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Attacker;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Dragon;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Target;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Warrior;

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
        AttackGroup group = new Group();
        group.addMember(hero);
        group.addMember(new Warrior("Boho",20,combatLogger));

        Executor commandExecutor = new CommandExecutor();

        Command groupTarget = new GroupTargetCommand(group,dragon);
        commandExecutor.executeCommand(groupTarget);
    }
}
