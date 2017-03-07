package D_Polymorphism.A_Vehicles;

public class Vehicle {
    private double fuelQuantity;
    private double consumption;

    public Vehicle(double fuelQuantity, double consumption, String type) {
        this.setFuelQuantity(fuelQuantity);
        this.setConsumption(consumption);
   }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    private void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    private double getConsumption() {
        return consumption;
    }

    protected void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    protected boolean isAbleToDrive(double distance){
        double fuelNeeded = distance*this.getConsumption();
        if (fuelNeeded > getFuelQuantity() ) {
            return false;
        }
        return true;
    }

    protected void drive(double distance){
        if (isAbleToDrive(distance)) {
            double fuelNeeded = distance * this.getConsumption();
            this.setFuelQuantity(getFuelQuantity() - fuelNeeded);
        }
    }

    protected void refuel(double liters){
        this.setFuelQuantity(getFuelQuantity()+liters);
    }

}
