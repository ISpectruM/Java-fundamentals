package B_Matrices.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class A_ReadSortPrintArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numElements = Integer.parseInt(scanner.nextLine());

        String[] strings = new String[numElements];
        for (int i = 0; i <numElements ; i++) {
            strings[i]=scanner.nextLine();
        }

        Arrays.sort(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
