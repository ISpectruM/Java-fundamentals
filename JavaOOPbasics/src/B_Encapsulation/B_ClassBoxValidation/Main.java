package B_Encapsulation.B_ClassBoxValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Box box = null;
        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble  (reader.readLine());

        try {
            box = new Box(length,width,height);
            System.out.printf("Surface Area - %.2f%n", box.getSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n", box.getLateralArea());
            System.out.printf("Volume - %.2f%n", box.getVolume());

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
