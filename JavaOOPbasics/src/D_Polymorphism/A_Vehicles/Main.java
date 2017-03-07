package D_Polymorphism.A_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.interfaces.DSAPublicKey;
import java.text.DecimalFormat;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]),carTokens[0]);
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), truckTokens[0]);

        int actions = Integer.parseInt(reader.readLine());
        for (int i = 0; i < actions; i++) {
            String[] vehTokens = reader.readLine().split("\\s+");
            String command = vehTokens[0];
            String vehicle = vehTokens[1];

            switch (command){
                case "Drive":
                    double distance = Double.parseDouble(vehTokens[2]);
                    if (vehicle.equals("Car")){
                        car.drive(distance);
                    } else {
                        truck.drive(distance);
                    }
                    break;
                case "Refuel":
                    double liters = Double.parseDouble(vehTokens[2]);
                    if (vehicle.equals("Car")){
                        car.refuel(liters);
                    } else {
                        truck.refuel(liters);
                    }
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}
