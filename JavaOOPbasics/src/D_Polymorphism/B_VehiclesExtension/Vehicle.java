package D_Polymorphism.B_VehiclesExtension;

public class Vehicle {
    private double fuelQuantity;
    private double consumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double consumption, double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.setFuelQuantity(fuelQuantity);
        this.setConsumption(consumption);
   }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity >= 0 || fuelQuantity <= this.tankCapacity) {
            this.fuelQuantity = fuelQuantity;
        } else {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
    }

    protected double getConsumption() {
        return consumption;
    }

    protected void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    protected double getTankCapacity() {
        return tankCapacity;
    }


    protected boolean isAbleToDrive(double distance){
        double fuelNeeded = distance*this.getConsumption();
        if (fuelNeeded > getFuelQuantity() ) {
            return false;
        }
        return true;
    }

    protected void drive(double distance){
            double fuelNeeded = distance * this.getConsumption();
            this.setFuelQuantity(getFuelQuantity() - fuelNeeded);
    }

    protected void refuel(double liters){
        this.setFuelQuantity(getFuelQuantity()+liters);
    }

}
