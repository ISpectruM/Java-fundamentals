package B_Matrices.Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class M_ActivityTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer,Map<String,Double>> logger = new TreeMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            int month = Integer.parseInt(tokens[0].split("[/]")[1]);
            String user = tokens[1];
            double distance =Double.parseDouble(tokens[2]);

            if (!logger.containsKey(month)){
                logger.put(month,new TreeMap<>());
                logger.get(month).put(user,distance);
            }else {
                if (!logger.get(month).containsKey(user)){
                    logger.get(month).put(user,distance);
                } else {
                    double value = logger.get(month).get(user)+distance;
                    logger.get(month).put(user,value);
                }
            }
        }

        for (Integer integer : logger.keySet()) {
            StringBuilder result = new StringBuilder();
            System.out.printf("%d: ", integer);

            Map<String,Double> data = logger.get(integer);
            for (String s : data.keySet()) {
                result.append(String.format("%s(%.0f), ", s, data.get(s)));
            }
            System.out.println(result.substring(0,result.length()-2));
        }
    }
}
