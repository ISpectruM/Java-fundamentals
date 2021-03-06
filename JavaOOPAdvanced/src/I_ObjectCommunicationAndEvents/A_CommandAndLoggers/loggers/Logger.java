package I_ObjectCommunicationAndEvents.A_CommandAndLoggers.loggers;

public abstract class Logger implements Handler {

    private Handler successor;

    public void setSuccessor(Handler logger) {
        this.successor = logger;
    }

    public Handler getSuccessor() {
        return this.successor;
    }
}