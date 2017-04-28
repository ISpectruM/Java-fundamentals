package B_Matrices.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E_GroupNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> firstRow = new ArrayList<>();
        ArrayList<Integer> secondRow = new ArrayList<>();
        ArrayList<Integer> thirdRow = new ArrayList<>();

        for (int i = 0; i <inputNumbers.length ; i++) {
            int currentNumber = Math.abs(inputNumbers[i]);
            if (currentNumber%3==0){
                firstRow.add(inputNumbers[i]);
            }
            else if(currentNumber%3==1){
                secondRow.add(inputNumbers[i]);
            }
            else{
                thirdRow.add(inputNumbers[i]);
            }
        }

        ArrayList<ArrayList<Integer>> jaggedMatrix= new ArrayList<>();
        jaggedMatrix.add(firstRow);
        jaggedMatrix.add(secondRow);
        jaggedMatrix.add(thirdRow);

        for (ArrayList<Integer> integers : jaggedMatrix) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
            System.out.print("\n");
        }
    }
}
