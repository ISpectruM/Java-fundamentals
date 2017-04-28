package B_Matrices.Exercises;

import java.util.Scanner;

public class D_SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");

        char[][] matrix = fillTheMatrix(dimensions, scanner);

        int equalsCount = 0;
        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                if (matrix[row][col] == matrix[row][col+1] &&
                        matrix[row][col] == matrix[row+1][col] &&
                        matrix[row][col] == matrix[row+1][col+1]){
                    equalsCount++;
                }
            }
        }

        System.out.println(equalsCount);
    }

    private static char[][] fillTheMatrix(String[] dimensions, Scanner scanner) {
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] input = scanner.nextLine().split(" ");
            String charString = String.join("",input);
            char[] chars = charString.toCharArray();

            for (int col = 0; col < cols; col++) {
                matrix[row][col]=chars[col];
            }

        }
        return matrix;

    }
}
