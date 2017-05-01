package Exam_Retake_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C_NMS {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> message = new ArrayList<>();

        StringBuilder rawMessage = new StringBuilder();
        String input;

        while (!"---C_NMS SEND---".equals(input=reader.readLine())){
            rawMessage.append(input);
        }

        StringBuilder word = new StringBuilder();

        char[] charsForCompare = rawMessage.toString().toLowerCase().toCharArray();
        char[] originalChars = rawMessage.toString().toCharArray();
        word.append(originalChars[0]);

        for (int i = 0; i < charsForCompare.length-1; i++) {
            char currChar = charsForCompare[i];
            char nextChar = charsForCompare[i+1];

            if (nextChar>=currChar){
                word.append(originalChars[i+1]);
            } else {
                message.add(word.toString());
                word = new StringBuilder();
                word.append(originalChars[i+1]);
            }
            if (i == charsForCompare.length-2){
                message.add(word.toString());
            }
        }

        String delimiter = reader.readLine();

        System.out.println(String.join(delimiter,message));
    }
}

