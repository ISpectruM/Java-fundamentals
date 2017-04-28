package A_JavaSyntax;

import java.util.Scanner;

public class C_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        String fNumHex = String.format("%X", firstNum);
        String fNumBinary = Integer.toBinaryString(firstNum);
        String formattedFirstNum = ("0000000000"+fNumBinary).substring(fNumBinary.length());

        String secNumFormated = String.format("%.2f", secondNum);

        String thNumFormated = String.format("%.3f",thirdNum);

        int fNumLength = String.valueOf(fNumHex).length();
        int secNumLength = secNumFormated.length();
        int thNumLength = thNumFormated.length();

        System.out.print("|");
        System.out.printf(fNumHex);
        for (int i = 0; i <10-fNumLength ; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.print(formattedFirstNum);
        System.out.print("|");
        for (int i = 0; i <10-secNumLength ; i++) {
            System.out.print(" ");
        }
        System.out.print(secNumFormated);
        System.out.print("|");
        System.out.printf(thNumFormated);
        for (int i = 0; i <10-thNumLength ; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
