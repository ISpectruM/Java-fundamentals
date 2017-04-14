package H_IntefaceSegregation_DependencyInvertion_Lab.p05_security_system;

public class KeyCardCheck extends SecurityCheck{
    private static final int ID = 1;

    private KeyCardUI keyCardUI;

    public KeyCardCheck(KeyCardUI keyCardUI) {
        super.setId(ID);
        this.keyCardUI = keyCardUI;
    }

    @Override
    public boolean validateUser() {
        String code = keyCardUI.requestKeyCard();
        if (isValid(code)) {
            return true;
        }

        return false;
    }

    private boolean isValid(String code) {
        return true;
    }
}
