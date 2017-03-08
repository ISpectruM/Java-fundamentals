package C_Inheritance.F_Animals;

public class Cat extends Animal{
    private String gender;

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    protected String getGender() {
        return this.gender;
    }

    @Override
    protected void setGender(String gender) {
        if (gender==null || gender.isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    @Override
    protected void produceSound() {
        System.out.println("MiauMiau");
    }

    @Override
    public String toString() {
        return String.format("%s %d %s",
                super.getName(),
                super.getAge(),
                this.getGender()
        );
    }
}
