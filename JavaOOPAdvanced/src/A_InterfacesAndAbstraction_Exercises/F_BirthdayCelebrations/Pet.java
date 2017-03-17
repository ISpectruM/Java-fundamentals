package A_InterfacesAndAbstraction_Exercises.F_BirthdayCelebrations;

public class Pet implements Birthable{
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
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
