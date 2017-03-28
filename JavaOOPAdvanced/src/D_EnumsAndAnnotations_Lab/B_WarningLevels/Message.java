package D_EnumsAndAnnotations_Lab.B_WarningLevels;

public class Message {
    private String message;
    private Importance importance;

    public Message(String importance, String message) {
        this.importance = Importance.valueOf(importance);
        this.message = message;
    }

    public Importance getImportance(){
        return this.importance;
    }

    @Override
    public String toString() {
        return this.getImportance()+": "+ this.message;
    }
}
