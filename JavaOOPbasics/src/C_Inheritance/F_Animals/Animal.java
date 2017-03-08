package C_Inheritance.F_Animals;

public class Animal extends SoundProducible {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    protected String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name==null || name.isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    protected int getAge() {
        return this.age;
    }

    protected void setGender(String gender) {
        if (gender == null || gender.isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    protected String getGender() {
        return this.gender;
    }

    @Override
    protected void produceSound() {
        System.out.println("Not implemented!");
    }

    @Override
    public String toString() {
        return String.format("%s %d %s",
                this.getName(),
                this.getAge(),
                this.getGender()
        );
    }
}
