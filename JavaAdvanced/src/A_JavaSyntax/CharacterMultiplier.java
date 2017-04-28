package A_JavaSyntax;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.next();
        String secondStr = scanner.next();

        int result = getCharCodesSum(firstStr,secondStr);
        System.out.println(result);
    }

    private static int getCharCodesSum(String firstStr, String secondStr) {
        int result = 0;

        int fStrLength = firstStr.length();
        int secStrLength = secondStr.length();
        int minLength = Math.min(fStrLength,secStrLength);

        for (int i = 0; i <minLength ; i++) {
            int fStrCharValue = firstStr.charAt(i);
            int secStrCharValue = secondStr.charAt(i);

            result += fStrCharValue*secStrCharValue;
        }

        if (fStrLength>secStrLength){
            for (int i = minLength; i <fStrLength ; i++) {
                result+=firstStr.charAt(i);
            }
        }
        else {
            for (int i = minLength; i <secStrLength ; i++) {
                result+=secondStr.charAt(i);
            }
        }
        return result;
    }
}
