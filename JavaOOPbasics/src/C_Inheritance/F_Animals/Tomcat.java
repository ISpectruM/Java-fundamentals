package C_Inheritance.F_Animals;

public class Tomcat extends Cat {
    private static final String GENDER = "Male";
    private String gender;

    public Tomcat(String name, int age) {
        super(name, age);
        this.gender = GENDER;
    }

    @Override
    protected void produceSound() {
        System.out.println("Give me one million b***h");
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
