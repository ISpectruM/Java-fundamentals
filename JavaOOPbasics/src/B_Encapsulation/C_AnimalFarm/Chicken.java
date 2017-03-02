package B_Encapsulation.C_AnimalFarm;

public class Chicken{
    private String name;
    private int age;
    private double productsPerDay;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setProductsPerDay();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {

        if (name.length()<1 || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if (age < 0 || 15 < age){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double setProductsPerDay() {
        return this.productsPerDay = this.calculateProductPerDay();
    }

    public double getProductsPerDay() {
        return this.productsPerDay;
    }

    private double calculateProductPerDay(){
        if (this.age >= 0 && this.age < 6){
            return 2;
        } else if (this.age >= 6 && this.age < 12){
            return 1;
        }else {
            return 0.75;
        }
    }
}
