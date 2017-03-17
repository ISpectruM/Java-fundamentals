package A_InterfacesAndAbstraction_Exercises.G_FoodShortage;


public class Citizen implements Identifiable, Birthable,Buyer{
    private String name;
    private Integer age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, Integer age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = FOOD;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String check(String fakeId) {
        if (this.getId().substring(this.getId().length()-fakeId.length()).equals(fakeId)){
            return "fake";
        }
        return "true";
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public boolean isYearMaching(String year) {
        return this.getBirthDate().endsWith(year);
    }

    @Override
    public void buyFood() {
        this.food += 10;
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
