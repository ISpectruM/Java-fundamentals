package I_ObjectCommunicationAndEvents.B_Observers.loggers;

public class TargetLogger extends Logger {

    @Override
    public void handle(LogType logType, String message) {
        if (logType == LogType.TARGET) {
            System.out.println(logType.name() + ": " + message);
        } else {
            if (super.getSuccessor() != null) {
                super.getSuccessor().handle(logType, message);
            }
        }
    }
}

