package I_ObjectCommunicationAndEvents.commands.group;

import I_ObjectCommunicationAndEvents.commands.Command;
import I_ObjectCommunicationAndEvents.mediator.AttackGroup;

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
