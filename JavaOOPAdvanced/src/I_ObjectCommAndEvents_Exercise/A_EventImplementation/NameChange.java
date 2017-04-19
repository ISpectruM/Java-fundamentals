package I_ObjectCommAndEvents_Exercise.A_EventImplementation;


public class NameChange extends java.util.EventObject{
    private String changedName;

    public NameChange(Object source, String changedName) {
        super(source);
        this.changedName = changedName;
    }

    public String getChangedName() {
        return this.changedName;
    }
}
