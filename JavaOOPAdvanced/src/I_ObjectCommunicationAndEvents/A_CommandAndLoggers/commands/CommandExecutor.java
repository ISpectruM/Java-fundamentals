package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.commands;

public class CommandExecutor implements Executor {

    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
