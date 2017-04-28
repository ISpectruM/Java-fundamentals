package A_JavaSyntax;

import java.util.Scanner;

public class A_RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        double area = length*width;

        System.out.printf("%.2f", area);
    }
}
