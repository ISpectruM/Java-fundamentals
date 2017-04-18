package I_ObjectCommunicationAndEvents.B_Observers.commands.individual;

import I_ObjectCommunicationAndEvents.B_Observers.commands.Command;
import I_ObjectCommunicationAndEvents.B_Observers.models.Attacker;

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
