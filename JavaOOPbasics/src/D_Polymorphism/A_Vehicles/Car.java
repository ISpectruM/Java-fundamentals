package D_Polymorphism.A_Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle{

    public Car(double fuelQuantity, double consumption, String type) {
        super(fuelQuantity, consumption, type);
    }

    @Override
    protected void setConsumption(double consumption) {
        super.setConsumption(consumption+0.9);
    }

    @Override
    protected void drive(double distance) {
        if (super.isAbleToDrive(distance)){
            super.drive(distance);
            DecimalFormat df = new DecimalFormat("0");
            df.setMaximumFractionDigits(340);
            System.out.printf("Car travelled %s km%n", df.format(distance));
        }else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }
}
