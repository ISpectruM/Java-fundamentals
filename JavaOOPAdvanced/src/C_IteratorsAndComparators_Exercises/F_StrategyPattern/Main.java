package C_IteratorsAndComparators_Exercises.F_StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person> personsByNames = new TreeSet<>(new NamesComparator());
        TreeSet<Person> personsByAge = new TreeSet<>(new AgeComparator());

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String[] tokens = reader.readLine().split(" ");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));

            personsByNames.add(person);
            personsByAge.add(person);
        }

        personsByNames.forEach(person -> System.out.printf("%s %d\n",
                person.getName(),
                person.getAge()));
        personsByAge.forEach(person -> System.out.printf("%s %d\n",
                person.getName(),
                person.getAge()));
    }
}
