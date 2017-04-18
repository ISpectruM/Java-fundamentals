package I_ObjectCommunicationAndEvents.B_Observers.commands;

public class CommandExecutor implements Executor{

    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
