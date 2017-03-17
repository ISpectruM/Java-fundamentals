package A_InterfacesAndAbstraction_Exercises.E_BorderControl;

public class Robot implements Identity{
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
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
