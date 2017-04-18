package I_ObjectCommunicationAndEvents.loggers;

public class EventLogger extends Logger{

    @Override
    public void handle(LogType logType, String message) {
        if (logType == LogType.EVENT){
            System.out.println(logType.name() + ": " + message);
        } else {
            if (super.getSuccessor() != null){

                this.getSuccessor().handle(logType,message);
            }
        }
    }
}
