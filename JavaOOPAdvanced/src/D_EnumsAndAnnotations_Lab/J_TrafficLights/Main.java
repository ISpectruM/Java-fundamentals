package D_EnumsAndAnnotations_Lab.J_TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Light> lights = new ArrayList<>();

        String[] initialLights = reader.readLine().split(" ");

        for (String initialLight : initialLights) {
            Light light = new Light(initialLight);
            lights.add(light);
        }

        int changeCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < changeCount; i++) {
            for (Light light : lights) {
                light.changeLight();
                System.out.printf("%s ",light);
            }
            System.out.println();
        }
    }
}
