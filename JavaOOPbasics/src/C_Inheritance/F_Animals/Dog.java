package C_Inheritance.F_Animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age);
        super.setGender(gender);
    }

    @Override
    protected void produceSound() {
        System.out.println("BauBau");
    }
}
