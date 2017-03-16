package B_Encapsulation.A_ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble  (reader.readLine());
        Box box = new Box(length,width,height);

        System.out.printf("Surface Area - %.2f%n", box.getSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n", box.getLateralArea());
        System.out.printf("Volume - %.2f%n", box.getVolume());
    }
}