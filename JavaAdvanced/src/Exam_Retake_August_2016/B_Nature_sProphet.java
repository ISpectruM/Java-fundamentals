package Exam_Retake_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Nature_sProphet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] dimensions = reader.readLine().split(" ");
        int high = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);

        int[][] field = new int[high][width];
        int[][] tempField = new int[high][width];

        String input;
        while (!"Bloom Bloom Plow".equals(input = reader.readLine())){
            String[] coordinates = input.split(" ");
            int row = Integer.parseInt(coordinates[0]);
            int col = Integer.parseInt(coordinates[1]);
            tempField[row][col] += 1;
        }

        for (int row = 0; row < tempField.length; row++) {
            for (int col = 0; col < tempField[row].length; col++) {

                if (tempField[row][col] == 1){
                    for (int cols = 0; cols < field[row].length; cols++) {
                        field[row][cols] += 1;
                    }

                    for (int rows = 0; rows < field.length; rows++) {
                        field[rows][col] += 1;
                    }

                    field[row][col] -= 1;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                result.append(field[row][col]).append(" ");
            }
            result.append(System.lineSeparator());
        }

        System.out.println(result);
    }
}
