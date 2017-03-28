package D_EnumsAndAnnotations_Lab.B_WarningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String importanceLevel = reader.readLine();
        Logger logger = new Logger(importanceLevel);

        String input;
        while (!"END".equals(input = reader.readLine())){
            int endIndex = input.indexOf(":");
            String level = input.substring(0,endIndex);
            String content = input.substring(endIndex+2);

            Message message = new Message(level,content);
            logger.addMessage(message);
        }
        logger.getMessages().forEach(System.out::println);
    }
}
