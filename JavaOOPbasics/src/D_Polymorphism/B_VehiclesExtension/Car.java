package D_Polymorphism.B_VehiclesExtension;

import java.text.DecimalFormat;

public class Car extends Vehicle{

    public Car(double fuelQuantity, double consumption, double tankCapacity) {
        super(fuelQuantity, consumption, tankCapacity);
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
            throw new IllegalArgumentException("Car needs refueling");
        }
    }

    @Override
    protected void refuel(double liters) {
        if (super.getFuelQuantity()+liters > super.getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.refuel(liters);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }
}
