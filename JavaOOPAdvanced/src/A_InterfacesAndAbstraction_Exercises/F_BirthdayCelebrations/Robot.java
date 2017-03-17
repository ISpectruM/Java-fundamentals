package A_InterfacesAndAbstraction_Exercises.F_BirthdayCelebrations;

public class Robot implements Identifiable {
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
        if (this.getId().endsWith(fakeId)){
            return "fake";
        }
        return "true";
    }
}
