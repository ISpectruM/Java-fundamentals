package I_ObjectCommAndEvents_Exercise.A_EventImplementation;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.listeners = new ArrayList<>();
    }

    public void changeName(String name){
        this.name = name;
        this.fireNameChangeEvent();
    }

    public void addNameChangeListener(NameChangeListener listener){
        this.listeners.add(listener);
    }

    public void removeNameChangeListener(NameChangeListener listener) {
        this.listeners.remove(listener);
    }

    public void fireNameChangeEvent(){
        NameChange change = new NameChange(this,this.name);
        for (NameChangeListener listener : listeners) {
            listener.handleChangedName(change);
        }
    }
}
