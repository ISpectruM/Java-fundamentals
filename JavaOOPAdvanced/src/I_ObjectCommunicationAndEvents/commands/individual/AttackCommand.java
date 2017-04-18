package I_ObjectCommunicationAndEvents.commands.individual;

import I_ObjectCommunicationAndEvents.commands.Command;
import I_ObjectCommunicationAndEvents.models.Attacker;

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
