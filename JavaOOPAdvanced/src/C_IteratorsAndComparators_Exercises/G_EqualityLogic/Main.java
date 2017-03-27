package C_IteratorsAndComparators_Exercises.G_EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person> personsByNames = new TreeSet<>();
        HashSet<Person> personsByAge = new HashSet<>();

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String[] tokens = reader.readLine().split(" ");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            personsByNames.add(person);
            personsByAge.add(person);
        }

        System.out.println(personsByNames.size());
        System.out.println(personsByAge.size());
    }
}
