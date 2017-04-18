package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.group;

import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.Command;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.mediator.AttackGroup;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Target;

public class GroupTargetCommand implements Command{

    private AttackGroup group;
    private Target target;

    public GroupTargetCommand(AttackGroup group, Target target) {
        this.group = group;
        this.target = target;
    }

    @Override
    public void execute() {
        this.group.groupTarget(this.target);
    }
}
