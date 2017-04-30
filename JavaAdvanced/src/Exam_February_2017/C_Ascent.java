package Exam_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> encodedStrings =  new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("((,|_)([a-zA-Z]+)(\\d))");

        String input;
        while (!(input=reader.readLine()).equals("Ascend")){

            for (String s : encodedStrings.keySet()) {
                    input = input.replaceAll(s,encodedStrings.get(s));
            }

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                String fullString = matcher.group(1);
                String operation = matcher.group(2);
                String stringToDecode = matcher.group(3);
                int operand = Integer.parseInt(matcher.group(4));

                if (!stringToDecode.isEmpty()){

                    String decodedString = getEncodedString(stringToDecode,operand,operation);
                    encodedStrings.putIfAbsent(fullString,decodedString);
                    input = input.replaceAll(fullString,decodedString);
                }
            }

            System.out.println(input);
        }
    }

    private static String getEncodedString(String string, int operand, String operation) {
        StringBuilder temp = new StringBuilder();
        char[] tempString = string.toCharArray();
        for (int i = 0; i < tempString.length; i++) {
            if (operation.equals(",")){
                tempString[i]+=operand;
            }else {
                tempString[i]-=operand;
            }
            temp.append(tempString[i]);
        }
        return temp.toString();
    }
}
