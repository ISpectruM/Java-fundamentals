package B_Matrices.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class F_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            pascalTriangle.add(i, new ArrayList<>());
        }


        for (int row = 0; row < n; row++) {
            pascalTriangle.get(row).add((long) 1);

            for (int col = 1; col <row ; col++) {
                long upperSum = pascalTriangle.get(row-1).get(col-1)+pascalTriangle.get(row-1).get(col);
                pascalTriangle.get(row).add(col,upperSum);
            }
            if (row>0){
                pascalTriangle.get(row).add((long) 1);
            }
        }

        for (ArrayList<Long> integers : pascalTriangle) {
            for (Long num : integers) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
