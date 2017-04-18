package I_ObjectCommunicationAndEvents.B_Observers.commands.group;

import I_ObjectCommunicationAndEvents.B_Observers.commands.Command;
import I_ObjectCommunicationAndEvents.B_Observers.mediator.AttackGroup;
import I_ObjectCommunicationAndEvents.B_Observers.observer.ObservableTarget;

public class GroupTargetCommand implements Command{

    private AttackGroup group;
    private ObservableTarget target;

    public GroupTargetCommand(AttackGroup group, ObservableTarget target) {
        this.group = group;
        this.target = target;
    }

    @Override
    public void execute() {
        this.group.groupTarget(this.target);
    }
}
