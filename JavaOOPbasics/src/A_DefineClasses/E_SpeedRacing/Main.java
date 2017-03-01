package A_DefineClasses.E_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

        int carsCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < carsCount; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String model = tokens[0];
            int fuel = Integer.parseInt(tokens[1]);
            double cost = Double.parseDouble(tokens[2]);

            if (!cars.containsKey(model)) {
                Car car = new Car(model, fuel, cost);
                cars.put(model, car);
            }
        }

        String input;
        while (!"End".equals(input=reader.readLine())){
            String[] splitInput = input.split("\\s+");
            String model = splitInput[1];
            int distance = Integer.parseInt(splitInput[2]);

            if (cars.containsKey(model)){
                Car currCar = cars.get(model);
                if (currCar.hasFuelToMove(distance)){
                    currCar.moveTheCar(distance);
                    cars.put(model,currCar);
                }else {
                    System.out.println("Insufficient fuel for the drive");
                }
            }
        }
        cars.values().stream()
                .forEach(c -> System.out.printf("%1$s %2$.2f %3$d%n",c.getModel(),c.getFuelAmount(),c.getDistanceTraveled()));
    }
}
