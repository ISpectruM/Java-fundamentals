package B_Matrices.Exercises;

import java.util.Scanner;

public class A_FillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int dimension = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[dimension][dimension];

        if (pattern.equals("A")){
            matrix = fillPatternA(matrix, dimension);
        }
        else if (pattern.equals("B")){
            matrix = fillPatternB(matrix, dimension);
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }

    private static int[][] fillPatternB(int[][] matrix, int dimension) {
        int number = 1;
        int currentRow = 0;
        for (int col = 0; col < dimension; col++) {
            if (currentRow==0){
                for (int row = currentRow; row <dimension ; row++) {
                    matrix[row][col] = number;
                    currentRow=row;
                    number++;
                }
            }
            else{
                for (int row = currentRow; row >=0 ; row--) {
                    matrix[row][col] = number;
                    currentRow=row;
                    number++;
                }
            }
        }

        return matrix;
    }

    private static int[][] fillPatternA(int[][] matrix, int dimension) {
        int number = 1;

        for (int col = 0; col < dimension; col++) {
            for (int row = 0; row < dimension; row++) {
                matrix[row][col]=number;
                number++;
            }
        }

        return matrix;
    }
}
