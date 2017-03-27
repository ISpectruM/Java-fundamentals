package C_IteratorsAndComparators_Exercises.E_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> persons = new ArrayList<>();

        String input;
        while (!"END".equals(input = reader.readLine())){
            String[] tokens = input.split(" ");
            Person person = new PersonImpl(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            persons.add(person);
        }
        try {
            int compareIndex = Integer.parseInt(reader.readLine());
            if (compareIndex > persons.size()-1){
                throw new IndexOutOfBoundsException("No matches");
            }

            Person personToCompare = persons.get(compareIndex);
            int equal = 0;
            for (Person person : persons) {
                if (person.compareTo(personToCompare) == 0) {
                    equal++;
                }
            }

            if (equal == 0) {
                throw new IndexOutOfBoundsException("No matches");
            }
            System.out.printf("%d %d %d", equal, persons.size() - equal, persons.size());

        } catch (IndexOutOfBoundsException iabe){
            System.out.println(iabe.getMessage());
        }
    }
}
