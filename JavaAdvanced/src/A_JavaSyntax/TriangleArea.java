package A_JavaSyntax;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        BigDecimal point1 = BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y1-y2));
        BigDecimal point2 = BigDecimal.valueOf(x1).multiply(BigDecimal.valueOf(y2-y));
        BigDecimal point3 = BigDecimal.valueOf(x2).multiply(BigDecimal.valueOf(y-y1));

        BigDecimal area = (point1.add(point2).add(point3).divide(BigDecimal.valueOf(2)));
        area = area.setScale(0, RoundingMode.HALF_DOWN).abs();
        if (x==x1&&y==y1 || x1==x2&&y1==y2 || x==x2&&y==y2){
            System.out.print(0);
        }
        else{
            System.out.print(area.abs());
        }
    }
}
