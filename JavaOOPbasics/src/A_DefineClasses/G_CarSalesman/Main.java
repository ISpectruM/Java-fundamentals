package A_DefineClasses.G_CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Engine> engines = new HashMap<>();
        int enginesCount = Integer.parseInt(reader.readLine());
        getEngines(reader, enginesCount,engines);

        LinkedList<Car> cars = new LinkedList<>();
        int carsCount = Integer.parseInt(reader.readLine());
        getCars(reader, engines, cars, carsCount);

        printTheCars(cars);
    }

    private static void printTheCars(LinkedList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getModel()+":");
            System.out.println(car.getEngine().getModel()+":");
            System.out.printf("Power: %d%n",car.getEngine().getPower());

            if (car.getEngine().getDisplacement()==0){
                System.out.println("Displacement: n/a");
            } else {
                System.out.printf("Displacement: %d%n",car.getEngine().getDisplacement());
            }
            System.out.printf("Efficiency: %s%n", car.getEngine().getEfficiency());
            if (car.getWeight()!=0){
                System.out.printf("Weight: %d%n", car.getWeight());
            }else {
                System.out.println("Weight: n/a");
            }
            System.out.printf("Color: %s%n", car.getColor());
        }
    }

    private static void getCars(BufferedReader reader, HashMap<String, Engine> engines, LinkedList<Car> cars, int carsCount) throws IOException {
        for (int i = 0; i <carsCount ; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String model = tokens[0];
            String engine = tokens[1];

            Engine currEngine = engines.get(engine);
            Car car = new Car(model,currEngine);

            if (tokens.length == 3){
                if (isNumber(tokens[2])){
                    int weight = Integer.parseInt(tokens[2]);
                    car.setWeight(weight);
                } else {
                    String color = tokens[2];
                    car.setColor(color);
                }
            } else if(tokens.length == 4){
                int weight = Integer.parseInt(tokens[2]);
                String color = tokens[3];
                car = new Car(model,currEngine,weight,color);
            }
            cars.add(car);
        }
    }

    private static void getEngines(BufferedReader reader, int enginesCount, HashMap<String, Engine> engines) throws IOException {
        for (int i = 0; i < enginesCount; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Engine engine = new Engine(model,power);

            if (tokens.length == 3){

                if (isNumber(tokens[2])){
                    int displacement = Integer.parseInt(tokens[2]);
                    engine.setDisplacement(displacement);
                } else {
                    String efficiency = tokens[2];
                    engine.setEfficiency(efficiency);
                }
            } else if(tokens.length == 4){
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];

                engine = new Engine(model,power,displacement,efficiency);
            }
            engines.putIfAbsent(model,engine);
        }
    }

    private static boolean isNumber(String token) {
        try {
            int digit = Integer.parseInt(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
