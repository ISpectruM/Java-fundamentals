package I_ObjectCommAndEvents_Exercise.A_EventImplementation;

public class Handler implements NameChangeListener{

    @Override
    public void handleChangedName(NameChange event) {
        System.out.printf("Dispatcher's name changed to %s.%n",event.getChangedName());
    }
}
