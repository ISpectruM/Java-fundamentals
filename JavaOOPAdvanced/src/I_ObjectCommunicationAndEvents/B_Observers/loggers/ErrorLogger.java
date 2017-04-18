package I_ObjectCommunicationAndEvents.B_Observers.loggers;

public class ErrorLogger extends Logger{

    @Override
    public void handle(LogType logType, String message) {
        if (logType == LogType.ERROR){
            System.out.println(logType.name() + ": " + message);
        } else {
            super.getSuccessor().handle(logType, message);
        }
    }
}
