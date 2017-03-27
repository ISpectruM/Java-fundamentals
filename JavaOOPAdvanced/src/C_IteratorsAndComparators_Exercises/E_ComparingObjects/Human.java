package C_IteratorsAndComparators_Exercises.E_ComparingObjects;

public abstract class Human implements Person {
    private String name;
    private int age;
    private String town;

    public Human(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getTown() {
        return this.town;
    }
}
