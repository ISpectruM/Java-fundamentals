package A_JavaSyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J_FirstEvenOddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] collection = scanner.nextLine().split(" ").clone();
        String [] command = scanner.nextLine().split(" ").clone();

        List<Integer> result = getFirstEvenOddElements(collection,command);
        for (int num:result) {
            System.out.print(num+" ");
        }
    }

    private static List<Integer> getFirstEvenOddElements(String[] collection, String[] command) {
        int numCount = Integer.parseInt(command[1]);
        String type = command[2];

        int counter = 0;
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i <collection.length ; i++) {
            int currNum = Integer.parseInt(collection[i]);

            if (type.equals("odd")){
                if (currNum%2!=0){
                    result.add(currNum);
                    counter++;

                    if (counter==numCount){
                        break;
                    }
                }
            }

            else{
                if (currNum%2==0){
                    result.add(currNum);
                    counter++;

                    if (counter==numCount){
                        break;
                    }
                }
            }

        }
        return result;
    }
}
