package B_Matrices.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L_ToTheStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,double[]> galaxies = new LinkedHashMap<>();

        for (int i = 0; i < 3; i++) {
            String[] input = scanner.nextLine().split(" ");
            String galaxyName = input[0];
            double[] points = new double[]{Double.valueOf(input[1]),Double.valueOf(input[2])};
            galaxies.putIfAbsent(galaxyName,points);
        }

        String[] normandyPosition = scanner.nextLine().split(" ");
        double xPosition = Double.parseDouble(normandyPosition[0]);
        double yPosition = Double.parseDouble(normandyPosition[1]);
        int moves = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= moves; i++) {
            boolean isInSpace = true;

            for (String galaxy : galaxies.keySet()) {
                double x = galaxies.get(galaxy)[0];
                double y = galaxies.get(galaxy)[1];
                double leftEdge = x-1;
                double rightEdge = x+1;
                double upEdge = y+1;
                double lowerEdge = y-1;

                if (xPosition >= leftEdge && xPosition <= rightEdge &&
                        yPosition >= lowerEdge && yPosition<=upEdge) {
                    System.out.println(galaxy.toLowerCase());
                    isInSpace = false;
                    break;
                }
            }

            if (isInSpace){
                System.out.println("space");
            }
            yPosition++;
        }
    }
}
