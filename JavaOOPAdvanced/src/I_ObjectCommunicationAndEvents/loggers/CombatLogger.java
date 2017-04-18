package I_ObjectCommunicationAndEvents.loggers;

public class CombatLogger extends Logger{

    @Override
    public void handle(LogType logType, String message) {
        if (logType == LogType.ATTACK || logType == LogType.MAGIC){
            System.out.println(logType.name() + ": " + message);
        } else {
            if (super.getSuccessor()!= null){

                this.getSuccessor().handle(logType, message);
            }
        }
    }
}
