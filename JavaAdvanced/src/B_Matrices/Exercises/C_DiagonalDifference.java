package B_Matrices.Exercises;

import java.util.Scanner;

public class C_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix= fillTheMatrix(scanner, matrixSize);;

        int firstDiagSum = getFirstDiagSum(matrix, matrixSize);
        int secDiagSum = getSecDiagSum(matrix, matrixSize);

        int difference = Math.abs(firstDiagSum-secDiagSum);

        System.out.println(difference);
    }

    private static int[][] fillTheMatrix(Scanner scanner, int matrixSize) {
        int[][] matrix=new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            String[] numbers = scanner.nextLine().split(" ");

            for (int col = 0; col <matrixSize ; col++) {
                matrix[row][col]= Integer.parseInt(numbers[col]);
            }
        }
        return matrix;
    }

    private static int getSecDiagSum(int[][] matrix, int matrixSize) {
        int sum = 0;
        for (int row = 0; row < matrixSize; row++) {
            sum += matrix[row][matrixSize-1-row];
        }
        return sum;
    }

    private static int getFirstDiagSum(int[][] matrix, int matrixSize) {
        int sum = 0;

        for (int index = 0; index < matrixSize; index++) {
            sum += matrix[index][index];
        }
        return sum;
    }
}
