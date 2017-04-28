package A_JavaSyntax;

import java.util.Scanner;

public class M_BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long blurAmount = Long.parseLong (scanner.nextLine());

        String[] matrixDimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixDimensions[0]);
        int cols = Integer.parseInt(matrixDimensions[1]);

        long[][] matrix = new long[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");

            for (int col = 0; col <cols ; col++) {
                matrix[row][col] = Integer.parseInt(numbers[col]);
            }
        }

        String[] pixel = scanner.nextLine().split(" ");
        int pixelRow = Integer.parseInt(pixel[0]);
        int pixelCol = Integer.parseInt(pixel[1]);

        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col < 3; col++) {
                try {
                    matrix[pixelRow-1+row][pixelCol-1+col] += blurAmount;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    continue;
                }
            }
        }

        for (long[] numbers : matrix) {
            for (long num : numbers) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
