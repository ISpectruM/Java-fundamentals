package B_Matrices.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J_PlusRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String[]> matrix = new ArrayList<>();
        List<boolean[]> mirrorMtrx = new ArrayList<>();

        String input;
        while (!"END".equals(input = scanner.nextLine())){
            String[] strings = input.trim().split("");
            matrix.add(strings);
            mirrorMtrx.add(new boolean[strings.length]);
        }

        for (int i = 1; i < matrix.size()-1; i++) {
            for (int j = 1; j < matrix.get(i).length-1; j++) {
                try {
                    String center = matrix.get(i)[j].toLowerCase();
                    String left = matrix.get(i)[j-1].toLowerCase();
                    String right = matrix.get(i)[j+1].toLowerCase();
                    String up = matrix.get(i-1)[j].toLowerCase();
                    String down = matrix.get(i+1)[j].toLowerCase();

                    if (center.equals(left) &&
                            left.equals(right) &&
                            right.equals(up) &&
                            up.equals(down)){
                        mirrorMtrx.get(i)[j] = true;
                        mirrorMtrx.get(i)[j-1] = true;
                        mirrorMtrx.get(i-1)[j] = true;
                        mirrorMtrx.get(i)[j+1] = true;
                        mirrorMtrx.get(i+1)[j] = true;
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    break;
                }
            }
        }

        for (int i = 0; i <matrix.size(); i++) {
            for (int j = 0; j <matrix.get(i).length; j++) {
                boolean isTrue = mirrorMtrx.get(i)[j];
                if (!isTrue){
                    System.out.print(matrix.get(i)[j]);
                }
            }
            System.out.println();
        }
    }
}
