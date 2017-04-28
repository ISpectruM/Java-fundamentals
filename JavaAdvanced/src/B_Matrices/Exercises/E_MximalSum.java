package B_Matrices.Exercises;

import java.util.Scanner;

public class E_MximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");

        int[][] matrix = fillTheMatrix(scanner,dimensions);

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;

        for (int row = 0; row < matrix.length-2; row++) {
            for (int col = 0; col < matrix[row].length-2; col++) {

                int sum = 0;

                for (int i = row; i < row+3; i++) {
                    for (int j = col; j < col+3 ; j++) {
                        sum += matrix[i][j];
                    }
                }
//                int sum = (matrix[row][col] +
//                        matrix[row][col+1] +
//                        matrix[row][col+2] +
//                        matrix[row+1][col] +
//                        matrix[row+1][col+1] +
//                        matrix[row+1][col+2] +
//                        matrix[row+2][col] +
//                        matrix[row+2][col+1] +
//                        matrix[row+2][col+2]);
                if (sum>maxSum){
                    maxSum=sum;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }

        System.out.println("Sum = "+ maxSum);
        for (int row = rowIndex; row < rowIndex+3; row++) {
            for (int col = colIndex; col < colIndex+3; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] fillTheMatrix(Scanner scanner, String[] dimensions) {
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col]= Integer.parseInt(numbers[col]);
            }
        }

        return matrix;
    }
}
