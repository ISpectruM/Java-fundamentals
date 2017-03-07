package D_Polymorphism.B_VehiclesExtension;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.interfaces.DSAPublicKey;
import java.text.DecimalFormat;
import java.time.temporal.ValueRange;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");
        String[] busTokens = reader.readLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]),Double.parseDouble(carTokens[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));
        Bus bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));

        int actions = Integer.parseInt(reader.readLine());
        for (int i = 0; i < actions; i++) {
            String[] vehTokens = reader.readLine().split("\\s+");
            String command = vehTokens[0];
            String vehicle = vehTokens[1];
            double distance;
            try {
                switch (command) {
                    case "Drive":
                        distance = Double.parseDouble(vehTokens[2]);
                        if (vehicle.equals("Car")) {
                            car.drive(distance);
                        } else if (vehicle.equals("Truck")) {
                            truck.drive(distance);
                        } else {
                            bus.drive(distance);
                        }
                        break;
                    case "Refuel":
                        double liters = Double.parseDouble(vehTokens[2]);
                        if (vehicle.equals("Car")) {
                            car.refuel(liters);
                        } else if (vehicle.equals("Truck")) {
                            truck.refuel(liters);
                        } else {
                            bus.refuel(liters);
                        }
                        break;
                    case "DriveEmpty":
                        distance = Double.parseDouble(vehTokens[2]);
                        bus.driveEmpty(distance);
                }
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
