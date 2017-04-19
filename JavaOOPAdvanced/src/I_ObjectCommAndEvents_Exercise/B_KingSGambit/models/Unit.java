package I_ObjectCommAndEvents_Exercise.B_KingSGambit.models;

public abstract class Unit {
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
