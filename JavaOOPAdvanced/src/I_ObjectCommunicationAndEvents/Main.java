import I_ObjectCommunicationAndEvents.commands.Command;
import I_ObjectCommunicationAndEvents.commands.CommandExecutor;
import I_ObjectCommunicationAndEvents.commands.Executor;
import I_ObjectCommunicationAndEvents.commands.group.GroupTargetCommand;
import I_ObjectCommunicationAndEvents.loggers.*;
import I_ObjectCommunicationAndEvents.mediator.AttackGroup;
import I_ObjectCommunicationAndEvents.mediator.Group;
import I_ObjectCommunicationAndEvents.models.Attacker;
import I_ObjectCommunicationAndEvents.models.Dragon;
import I_ObjectCommunicationAndEvents.models.Target;
import I_ObjectCommunicationAndEvents.models.Warrior;

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
