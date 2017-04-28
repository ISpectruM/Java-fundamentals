package A_JavaSyntax;

import java.util.Scanner;

public class E_DecimalToSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = scanner.nextInt();

        System.out.print(Integer.toString(decimal,7));
    }
}
