package C_IteratorsAndComparators_Exercises.E_ComparingObjects;

public class PersonImpl extends Human implements Person{

    public PersonImpl(String name, int age, String town) {
        super(name, age, town);
    }

    @Override
    public int compareTo(Person o) {
        return super.getName().compareTo(o.getName()) +
                (super.getAge() - o.getAge()) +
                super.getTown().compareTo(o.getTown());
    }
}
