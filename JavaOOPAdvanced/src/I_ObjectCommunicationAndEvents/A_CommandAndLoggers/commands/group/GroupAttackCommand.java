package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.group;

import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.Command;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.mediator.AttackGroup;

public class GroupAttackCommand implements Command{

    private AttackGroup attackGroup;

    public GroupAttackCommand(AttackGroup attackGroup) {
        this.attackGroup = attackGroup;
    }

    @Override
    public void execute() {
        this.attackGroup.groupAttack();
    }
}
