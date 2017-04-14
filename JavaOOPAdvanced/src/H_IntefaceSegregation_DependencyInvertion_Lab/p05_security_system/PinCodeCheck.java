package H_IntefaceSegregation_DependencyInvertion_Lab.p05_security_system;

public class PinCodeCheck extends SecurityCheck {
    private static final int ID = 2;

    private PinCodeUI pinCodeUI;

    public PinCodeCheck(PinCodeUI pinCodeUI) {
        this.pinCodeUI = pinCodeUI;
        super.setId(ID);
    }

    @Override
    public boolean validateUser() {
        int pin = pinCodeUI.requestPinCode();
        if (isValid(pin)) {
            return true;
        }

        return false;
    }

    private boolean isValid(int pin) {
        return true;
    }
}
