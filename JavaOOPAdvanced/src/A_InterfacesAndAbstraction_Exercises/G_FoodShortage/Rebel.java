package A_InterfacesAndAbstraction_Exercises.G_FoodShortage;

public class Rebel implements Buyer{
    private String name;
    private int age;
    private  String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = FOOD;
    }


    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
