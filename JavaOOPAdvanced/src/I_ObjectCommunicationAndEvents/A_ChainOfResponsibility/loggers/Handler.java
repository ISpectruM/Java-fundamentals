package I_ObjectCommunicationAndEvents.A_ChainOfResponsibility.loggers;

public interface Handler {

    void handle(LogType logType, String message);

    void setSuccessor(Handler logger);
}
