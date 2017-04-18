package I_ObjectCommunicationAndEvents.B_Observers;

import I_ObjectCommunicationAndEvents.B_Observers.commands.Command;
import I_ObjectCommunicationAndEvents.B_Observers.commands.CommandExecutor;
import I_ObjectCommunicationAndEvents.B_Observers.commands.Executor;
import I_ObjectCommunicationAndEvents.B_Observers.commands.group.GroupAttackCommand;
import I_ObjectCommunicationAndEvents.B_Observers.commands.group.GroupTargetCommand;
import I_ObjectCommunicationAndEvents.B_Observers.loggers.*;
import I_ObjectCommunicationAndEvents.B_Observers.mediator.AttackGroup;
import I_ObjectCommunicationAndEvents.B_Observers.mediator.Group;
import I_ObjectCommunicationAndEvents.B_Observers.models.Attacker;
import I_ObjectCommunicationAndEvents.B_Observers.models.Dragon;
import I_ObjectCommunicationAndEvents.B_Observers.models.Warrior;
import I_ObjectCommunicationAndEvents.B_Observers.observer.ObservableTarget;

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
        ObservableTarget dragon = new Dragon("Drago", 5,100, combatLogger);
        AttackGroup group = new Group();
        group.addMember(hero);
        group.addMember(new Warrior("Boho",20,combatLogger));

        Executor commandExecutor = new CommandExecutor();

        Command groupTarget = new GroupTargetCommand(group,dragon);
        Command groupAttack = new GroupAttackCommand(group);
        commandExecutor.executeCommand(groupTarget);
        commandExecutor.executeCommand(groupAttack);
    }
}
