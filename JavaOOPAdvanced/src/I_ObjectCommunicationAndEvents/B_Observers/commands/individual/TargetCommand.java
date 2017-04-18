package I_ObjectCommunicationAndEvents.B_Observers.commands.individual;

import I_ObjectCommunicationAndEvents.B_Observers.commands.Command;
import I_ObjectCommunicationAndEvents.B_Observers.models.Attacker;
import I_ObjectCommunicationAndEvents.B_Observers.observer.ObservableTarget;

public class TargetCommand implements Command {

    private ObservableTarget target;
    private Attacker attacker;

    public TargetCommand(Attacker attacker,ObservableTarget target) {
        this.target = target;
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        this.attacker.setTarget(this.target);
    }
}
