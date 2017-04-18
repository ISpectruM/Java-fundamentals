package I_ObjectCommunicationAndEvents.B_Observers.loggers;

public interface Handler {

    void handle(LogType logType, String message);

    void setSuccessor(Handler logger);
}
