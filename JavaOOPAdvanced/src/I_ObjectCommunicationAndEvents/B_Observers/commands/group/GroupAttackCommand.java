package I_ObjectCommunicationAndEvents.B_Observers.commands.group;

import I_ObjectCommunicationAndEvents.B_Observers.commands.Command;
import I_ObjectCommunicationAndEvents.B_Observers.mediator.AttackGroup;

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
