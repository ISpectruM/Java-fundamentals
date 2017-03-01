package A_DefineClasses.C_OpinionPoll;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        TreeMap<String, Person> names = new TreeMap<>();
        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = reader.readLine().split(" ");
            String name = input[0];
            int years = Integer.parseInt(input[1]);

            Person person = new Person(name,years);

            names.put(name,person);
        }
        names.entrySet().stream().filter(p -> p.getValue().getAge()>30).forEach(entry -> {
            System.out.printf("%1s - %2d%n", entry.getValue().getName(),entry.getValue().getAge());
        });
    }
}

