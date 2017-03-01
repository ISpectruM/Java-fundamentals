package A_DefineClasses.E_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distanceTraveled;

    public Car(String model,double fuelAmount,double fuelCost){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0;
    }


    public String getModel() {
        return model;
    }

    public double getFuelAmount(){
        return this.fuelAmount;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public boolean hasFuelToMove(Integer distance){
        double distanceCapacity = fuelAmount/fuelCost;
        return distance <= distanceCapacity;
    }

    public void moveTheCar(Integer distance){
        this.distanceTraveled +=distance;
        this.fuelAmount -= distance*fuelCost;
    }
}
