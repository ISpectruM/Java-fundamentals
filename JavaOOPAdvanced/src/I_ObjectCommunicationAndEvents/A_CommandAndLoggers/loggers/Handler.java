package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.loggers;

public interface Handler {

    void handle(LogType logType, String message);

    void setSuccessor(Handler logger);
}
