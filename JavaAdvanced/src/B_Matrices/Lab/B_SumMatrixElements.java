package B_Matrices.Lab;

import java.util.Scanner;

public class B_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] numbers=scanner.nextLine().split("[, ]+");

            for (int col = 0; col <matrix[row].length ; col++) {
                matrix[row][col]=Integer.parseInt(numbers[col]);
            }
        }

        int sum = 0;
        for (int[] nums : matrix) {
            for (int num : nums) {
                sum+=num;
            }
        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }
}
