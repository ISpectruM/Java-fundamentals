package A_InterfacesAndAbstraction_Exercises.E_BorderControl;

public class Citizen implements Identity{
    private String name;
    private Integer age;
    private String id;

    public Citizen(String name, Integer age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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
}
