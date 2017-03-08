package C_Inheritance.F_Animals;

public class Frog extends Animal{
    public Frog(String name, int age, String gender) {
        super(name, age);
        super.setGender(gender);
    }

    @Override
    protected void produceSound() {
        System.out.println("Frogggg");
    }
}
