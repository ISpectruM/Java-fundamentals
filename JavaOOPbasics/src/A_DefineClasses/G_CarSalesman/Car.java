package A_DefineClasses.G_CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model,Engine engine){
        this(model,engine,0,"n/a");
    }
    public Car(String model,Engine engine,int weight,String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
