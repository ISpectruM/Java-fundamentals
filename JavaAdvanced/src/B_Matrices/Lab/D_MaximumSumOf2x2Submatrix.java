package B_Matrices.Lab;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class D_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] inputStrings = scanner.nextLine().split("[, ]+");
            matrix[row]= Arrays.stream(inputStrings).mapToInt(Integer::parseInt).toArray();
        }

        int biggestSum = 0;
        int sum = 0;
        int[] index = new int[2];

        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[row].length-1; col++) {
                sum = matrix[row][col]+matrix[row][col+1]+matrix[row+1][col]+matrix[row+1][col+1];

                if (biggestSum<sum){
                    biggestSum = sum;
                    index[0] = row;
                    index[1]=col;
                }
            }
        }

        System.out.println(matrix[index[0]][index[1]]+" "+matrix[index[0]][index[1]+1]);
        System.out.println(matrix[index[0]+1][index[1]]+" "+matrix[index[0]+1][index[1]+1]);
        System.out.println(biggestSum);
    }
}
