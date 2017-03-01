package A_DefineClasses.F_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

        int carCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < carCount; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String model = tokens[0];

            gatTheCars(cars, tokens, model);
        }

        String command = reader.readLine();
        switch (command){
            case "fragile":
                cars.values().stream()
                        .filter(e -> e.getCargo().getType().equals(command))
                        .filter(e -> e.getTires().stream().anyMatch(tire -> tire.getPressure()<1))
                        .forEach(e -> System.out.println(e.getModel()));
                break;
            case "flamable":
                cars.values().stream()
                        .filter(e -> e.getCargo().getType().equals(command))
                        .filter(e -> e.getEngine().getPower() > 250)
                        .forEach(e -> System.out.println(e.getModel()));
                break;
        }
    }

    private static void gatTheCars(LinkedHashMap<String, Car> cars, String[] tokens, String model) {
        if (!cars.containsKey(model)){
            int speed = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(speed,power);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight,cargoType);

            Car car = new Car(model,engine,cargo);

            for (int j = 0; j < 8; j+=2) {
                double pressure =Double.parseDouble(tokens[j+5]);
                int age = Integer.parseInt(tokens[j+6]);
                Tire tire = new Tire(pressure,age);
                car.putTire(tire);
            }

            cars.put(model,car);

        }
    }
}
