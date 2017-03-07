package D_Polymorphism.A_Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle{

    public Truck(double fuelQuantity, double consumption, String type) {
        super(fuelQuantity, consumption, type);
    }

    @Override
    protected void setConsumption(double consumption) {
        super.setConsumption(consumption+1.6);
    }

    @Override
    protected void drive(double distance) {
        if (isAbleToDrive(distance)){
            super.drive(distance);

            DecimalFormat df = new DecimalFormat("0");
            df.setMaximumFractionDigits(340);

            System.out.printf("Truck travelled %s km%n", df.format(distance));
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    protected void refuel(double liters) {
        super.refuel(liters*0.95);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
    }
}
