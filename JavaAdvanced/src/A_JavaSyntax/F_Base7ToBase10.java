package A_JavaSyntax;

import java.util.Scanner;

public class F_Base7ToBase10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();

        String baseTenNum = Integer.toString(Integer.parseInt(num,7),10);

        System.out.println(baseTenNum);
    }
}
