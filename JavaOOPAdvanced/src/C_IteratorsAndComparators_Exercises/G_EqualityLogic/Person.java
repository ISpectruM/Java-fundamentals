package C_IteratorsAndComparators_Exercises.G_EqualityLogic;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public int compareTo(Person o) {
        if (this.getName().compareTo(o.getName()) == 0){
            return (this.getAge()-(o.getAge()));
        }
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Person)){
            return false;
        }

        Person other = (Person) obj;

        return this.getName()==null ? other.getName()==null : this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return this.getAge()*
                this.getName().hashCode();
    }
}
