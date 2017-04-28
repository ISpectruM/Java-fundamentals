package B_Matrices.Exercises;

import java.util.Scanner;

public class B_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = Character.toString((char)(row+97))+
                        Character.toString((char)(row+col+97))+
                        Character.toString((char)(row+97));

                matrix[row][col]=palindrome;
            }
        }

        for (String[] strings : matrix) {
            for (String palindrome : strings) {
                System.out.print(palindrome+" ");
            }
            System.out.println();
        }
    }
}
