package A_InterfacesAndAbstraction_Exercises.F_BirthdayCelebrations;


public class Citizen implements Identifiable, Birthable{
    private String name;
    private Integer age;
    private String id;
    private String birthDate;

    public Citizen(String name, Integer age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
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
}
