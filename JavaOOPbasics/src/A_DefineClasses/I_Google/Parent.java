package A_DefineClasses.I_Google;

public class Parent {
    private String parentName;
    private String birthDay;


    public Parent(String parentName, String birthDay) {
        this.parentName = parentName;
        this.birthDay = birthDay;
    }

    public String getParentName() {
        return parentName;
    }

    public String getBirthDay() {
        return birthDay;
    }
}
