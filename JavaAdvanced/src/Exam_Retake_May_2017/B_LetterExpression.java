package Exam_Retake_May_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_LetterExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> digits = new ArrayDeque<>();
        ArrayDeque<String> letters = new ArrayDeque<>();
        int sum = 0;

        String input = reader.readLine();

        Pattern digitPattern = Pattern.compile("([\\d]+)");
        Matcher digitMatcher = digitPattern.matcher(input);
        while (digitMatcher.find()){
            digits.offer(Integer.parseInt(digitMatcher.group()));
        }

        Pattern letterPattern = Pattern.compile("([^\\d]+)");
        Matcher letterMatcher = letterPattern.matcher(input);
        while (letterMatcher.find()){
            letters.offer(letterMatcher.group());
        }

        if (digits.size()>1 && letters.size()>0){
            sum += digits.pollFirst();
            String currString;

            try{
                int num =Integer.parseInt(input.substring(0,1));
                currString = letters.peekFirst();

            }catch (NumberFormatException e){
                currString = letters.pollFirst();
            }

            while (!digits.isEmpty()){
                currString = letters.pollFirst();
                if (currString.length()%2 == 0){
                    sum += digits.pollFirst();
                }else {
                    sum -= digits.pollFirst();
                }

            }
        }
        System.out.println(sum);
    }
}
