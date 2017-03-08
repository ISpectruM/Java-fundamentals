package C_Inheritance.F_Animals;

public class Kitten extends Cat{
    private static final String GENDER="Female";
    private String gender;

    public Kitten(String name, int age) {
        super(name, age);
        this.gender = GENDER;
    }



    @Override
    protected void produceSound() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return String.format("%s %d %s",
                super.getName(),
                super.getAge(),
                this.gender
        );
    }
}
