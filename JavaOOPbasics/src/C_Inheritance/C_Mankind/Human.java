package C_Inheritance.C_Mankind;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    protected String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        if (firstName==null ||
                firstName.length()<4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        if (firstName.charAt(0)<65 || firstName.charAt(0)>90){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        this.firstName = firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        if (lastName==null || lastName.length()<3){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName ");
        }
        if (lastName.charAt(0)<65 || lastName.charAt(0)>90){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }

        this.lastName = lastName;
    }
}
