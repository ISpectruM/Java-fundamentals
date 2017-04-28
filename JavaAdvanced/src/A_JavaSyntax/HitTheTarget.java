package A_JavaSyntax;

import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <=20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                int sum = i+j;

                if (sum==num){
                    System.out.println(i+" + "+j+" = "+sum);
                }
            }
        }

        for (int i = 1; i <=20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                int diff = i-j;

                if (diff==num){
                    System.out.println(i+" - "+j+" = "+diff);
                }
            }
        }
    }
}
