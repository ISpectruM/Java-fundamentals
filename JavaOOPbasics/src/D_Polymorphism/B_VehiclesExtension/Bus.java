package D_Polymorphism.B_VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle{

    public Bus(double fuelQuantity, double consumption,double tankCapacity) {
        super(fuelQuantity, consumption, tankCapacity);
    }

    @Override
    protected void setConsumption(double consumption) {
        super.setConsumption(consumption);
    }

    @Override
    protected void drive(double distance) {
        if (super.isAbleToDrive(distance)) {
            double fuelNeeded = distance * (super.getConsumption() + 1.4);
            super.setFuelQuantity(getFuelQuantity() - fuelNeeded);

            DecimalFormat df = new DecimalFormat("0");
            df.setMaximumFractionDigits(340);
            System.out.printf("Bus travelled %s km%n", df.format(distance));
        }else {
            throw new IllegalArgumentException("Bus needs refueling");
        }
    }

    public void driveEmpty (double distance){
        if (super.isAbleToDrive(distance)) {
            super.drive(distance);

            DecimalFormat df = new DecimalFormat("0");
            df.setMaximumFractionDigits(340);
            System.out.printf("Bus travelled %s km%n", df.format(distance));
        }else {
            throw new IllegalArgumentException("Bus needs refueling");
        }

    }

    @Override
    protected void refuel(double liters) {
        if ((super.getFuelQuantity()+liters)> super.getTankCapacity() ){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.refuel(liters);
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f", super.getFuelQuantity());
    }
}
