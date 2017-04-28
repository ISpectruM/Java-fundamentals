package A_JavaSyntax;

import java.util.Scanner;

public class OddEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numLine = scanner.nextLine();

        String numbers[] = numLine.split(" ");
        int arrLength = numbers.length;

        if (arrLength%2!=0){
            System.out.println("invalid length");
        }
        else {
            for (int i = 0; i < arrLength; i+=2) {
                int num1=Integer.parseInt(numbers[i]);
                int num2=Integer.parseInt(numbers[i+1]);

                if (num1%2==0 && num2%2==0){
                    System.out.println(num1+", "+num2+" -> both are even");
                }
                else if(num1%2!=0 && num2%2!=0){
                    System.out.println(num1+", "+num2+" -> both are odd");
                }
                else{
                    System.out.println(num1+", "+num2+" -> different");
                }
            }
        }
    }
}
