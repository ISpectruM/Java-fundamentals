package H_IntefaceSegregation_DependencyInvertion_Lab.p05_security_system;

public abstract class SecurityCheck {

    private int id;

    protected  void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public abstract boolean validateUser();
}
