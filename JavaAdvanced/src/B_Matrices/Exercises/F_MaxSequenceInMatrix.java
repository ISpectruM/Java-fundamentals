package B_Matrices.Exercises;

import java.util.Scanner;

public class F_MaxSequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);


        String[][] matrix = fillTheMatrix(scanner,dimensions);

        int maxSequence = 0;
        String string = "";

        for (int row = 0; row < matrix.length; row++) {
            int currSequence = 1;

            for (int col = 1; col < matrix[row].length; col++) {

                if (!matrix[row][col-1].equals(matrix[row][col])){
                    currSequence=1;
                    continue;
                }

                currSequence ++;

                if(currSequence>=maxSequence){
                    maxSequence=currSequence;
                    string = matrix[row][col];
                }
            }
        }

        for (int col = 0; col < cols; col++) {
            int currSequence = 1;

            for (int row = 1; row < rows; row++) {
                if (!matrix[row][col].equals(matrix[row-1][col])){
                    currSequence=1;
                    continue;
                }

                currSequence ++;

                if(currSequence >= maxSequence){
                    maxSequence=currSequence;
                    string = matrix[row][col];
                }
            }
        }

        int minLength = Math.min(rows,cols);
        int currSequence = 1;

        for (int row = 1; row < minLength; row++) {
            if (!matrix[row][row].equals(matrix[row-1][row-1])){
                currSequence = 1;
                continue;
            }

            currSequence ++;

            if(currSequence >= maxSequence){
                maxSequence=currSequence;
                string = matrix[row][row];
            }
        }

            for (int i = 0; i<maxSequence; i ++) {
                System.out.print(string +", ");
            }
    }

    private static String[][] fillTheMatrix(Scanner scanner, String[] dimensions) {
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col]= numbers[col];
            }
        }

        return matrix;
    }
}

