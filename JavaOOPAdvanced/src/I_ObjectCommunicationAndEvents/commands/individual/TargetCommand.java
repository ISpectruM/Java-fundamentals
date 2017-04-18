package I_ObjectCommunicationAndEvents.commands.individual;

import I_ObjectCommunicationAndEvents.commands.Command;
import I_ObjectCommunicationAndEvents.models.Attacker;
import I_ObjectCommunicationAndEvents.models.Target;

public class TargetCommand implements Command {

    private Target target;
    private Attacker attacker;

    public TargetCommand(Attacker attacker,Target target) {
        this.target = target;
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        this.attacker.setTarget(this.target);
    }
}
