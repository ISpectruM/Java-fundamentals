package B_Matrices.Exercises;

import java.util.Scanner;

public class H_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[col];
            }
        }

        String[]commandLine = scanner.nextLine().split(" ");

        while (!commandLine[0].equals("END")){
            if (!commandLine[0].equals("swap")|| commandLine.length>5 || commandLine.length<5){
                if (commandLine[0].equals("END")) break;
                System.out.println("Invalid input!");
                commandLine = scanner.nextLine().split(" ");
                continue;
            }

            String temp = "";
            int firstRow = Integer.parseInt(commandLine[1]);
            int firstCol = Integer.parseInt(commandLine[2]);
            int secRow = Integer.parseInt(commandLine[3]);
            int secCol = Integer.parseInt(commandLine[4]);

            try {
                temp = matrix[firstRow][firstCol];
                matrix[firstRow][firstCol] = matrix[secRow][secCol];
                matrix[secRow][secCol] = temp;

                for (String[] strings : matrix) {
                    for (String string : strings) {
                        System.out.print(string+" ");
                    }
                    System.out.println();
                }
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Invalid input!");
                commandLine = scanner.nextLine().split(" ");
                continue;
            }

            commandLine = scanner.nextLine().split(" ");
        }
    }
}
