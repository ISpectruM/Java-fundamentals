package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.individual;

import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.Command;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Attacker;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Target;

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
