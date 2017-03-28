package D_EnumsAndAnnotations_Lab.B_WarningLevels;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<Message> messages;
    private Importance importance;

    public Logger(String importance) {
        this.importance = Importance.valueOf(importance);
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message){
        if (message.getImportance().compareTo(this.importance) >= 0){
            messages.add(message);
        }
    }

    public Iterable<Message> getMessages(){
        return this.messages;
    }
}
