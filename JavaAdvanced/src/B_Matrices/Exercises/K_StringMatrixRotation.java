package B_Matrices.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class K_StringMatrixRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String[]> matrix = new ArrayList<>();
        String[] command = scanner.nextLine().split("[()]");
        int degrees = Integer.parseInt(command[1])/90 % 4;

        String input;
        int maxLength = 0;
        while (!"END".equals(input = scanner.nextLine())){
            String[] strings = input.split("");
            matrix.add(strings);
            if (strings.length > maxLength){
                maxLength = strings.length;
            }
        }

        switch (degrees){
            case 1:
                rotateOnce(matrix,maxLength);
                break;
            case 2:
                rotateTwice(matrix,maxLength);
                break;
            case 3:
                rotateThree(matrix,maxLength);
                break;
            default:
                printMatrix(matrix);
                break;
        }
    }

    private static void rotateThree(List<String[]> matrix, int maxLength) {
        for (int col = maxLength-1; col >=0 ; col--) {
                for (int row = 0; row < matrix.size() ; row++) {
                    try{
                        System.out.print(matrix.get(row)[col]);
                    } catch (IndexOutOfBoundsException e){
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }

    private static void rotateTwice(List<String[]> matrix, int maxLength) {
        try {
            for (int row = matrix.size()-1; row >= 0; row--) {
                for (int col = maxLength-1; col >= 0 ; col--) {
                    try {
                        System.out.print(matrix.get(row)[col]);
                    } catch (IndexOutOfBoundsException e){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (IndexOutOfBoundsException e){
            System.out.print(" ");
        }
    }

    private static void rotateOnce(List<String[]> matrix, int maxLength) {
            for (int col = 0; col < maxLength; col++) {
                for (int row = matrix.size() - 1; row >= 0; row--) {
                    try{
                        System.out.print(matrix.get(row)[col]);
                    } catch (IndexOutOfBoundsException e){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }

    private static void printMatrix(List<String[]> matrix) {
        for (int i = 0; i <matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).length; j++) {
                System.out.print(matrix.get(i)[j]);
            }
            System.out.println();
        }
    }
}
