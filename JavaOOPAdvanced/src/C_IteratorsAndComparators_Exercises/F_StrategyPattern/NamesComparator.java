package C_IteratorsAndComparators_Exercises.F_StrategyPattern;

import java.util.Comparator;

public class NamesComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        if (firstPerson.getName().length() == secondPerson.getName().length()){
            return firstPerson.getName().compareToIgnoreCase(secondPerson.getName());
        }
        return firstPerson.getName().length() - secondPerson.getName().length();
    }
}
