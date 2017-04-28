package B_Matrices.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class I_TerroristsWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] chars = text.toCharArray();

        int bombStart = 0;
        int bombEnd = 0;
        int power = 0;

        ArrayList<Integer> indexes = getBombIndexes(chars);

        if (indexes.size()>1){
            for (int i = 0; i < indexes.size(); i+=2) {
                    bombStart = indexes.get(i);
                    bombEnd = indexes.get(i+1);

                    int charSum = getCharsSum(chars,bombStart,bombEnd);

                    power = charSum%10;
                    int frontPower = getFrontPower(power,bombStart);
                    int endPower = getEndPower(power,bombEnd,chars);

                    for (int j = 0; j <= frontPower; j++) {
                        chars[bombStart-j] = '.';
                    }
                    for (int j = 0; j <= endPower; j++) {
                        chars[bombEnd+j] = '.';
                    }
            }
        }

        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    private static int getEndPower(int power, int bombEnd, char[] chars) {
        int endPower = 0;
        if((bombEnd+1+power > chars.length-1)){
            endPower = ((chars.length-1)-bombEnd);
        }
        else endPower = power;
        return endPower;
    }

    private static int getFrontPower(int power, int bombStart) {
        int frontPower = 0;
        if ((bombStart-power) < 0){
            frontPower = bombStart;
        }
        else frontPower = power;
        return frontPower;
    }

    private static int getCharsSum(char[] chars, int bombStart, int bombEnd) {
        int charSum=0;
        for (int j = bombStart+1; j <bombEnd ; j++) {
            charSum += chars[j];
            chars[j]='.';
        }
        return charSum;
    }

    private static ArrayList<Integer> getBombIndexes(char[] chars) {
        ArrayList<Integer> indexes =new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '|'){
                indexes.add(i);
            }
        }
        return indexes;
    }
}
