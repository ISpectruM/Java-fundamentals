package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.individual;

import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands.Command;
import I_ObjectCommunicationAndEvents.A_CommandAndLoggers.models.Attacker;

public class AttackCommand implements Command {

    private Attacker warrior;

    public AttackCommand(Attacker warrior) {
        this.warrior = warrior;
    }

    @Override
    public void execute() {
        this.warrior.attack();
    }
}
