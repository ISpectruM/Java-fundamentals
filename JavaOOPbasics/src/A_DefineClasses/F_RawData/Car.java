package A_DefineClasses.F_RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;
    private int speed;
    private int power;

    public Car(String model, Engine engine, Cargo cargo){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = new ArrayList<>(4);
    }
    public List<Tire> getTires(){
        return this.tires;
    }

    public void putTire(Tire tire){

        tires.add(tire);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
