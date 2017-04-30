package Exam_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_ShockWave {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] dimensions = reader.readLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        Integer[][] room = new Integer[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                room[row][col] = 0;
            }
        }

        String input;
        while (!(input = reader.readLine()).equals("Here We Go")){
            String[] shockwaves = input.split(" ");
            int x1 = Integer.parseInt(shockwaves[0]);
            int y1 = Integer.parseInt(shockwaves[1]);
            int x2 = Integer.parseInt(shockwaves[2]);
            int y2 = Integer.parseInt(shockwaves[3]);

            for (int row = x1; row <=x2 ; row++) {
                for (int col = y1; col <=y2; col++) {
                    room[row][col] +=1;
                }
            }
        }

        for (Integer[] integers : room) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
            System.out.println( );
        }
    }
}
