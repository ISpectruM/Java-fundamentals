package H_IntefaceSegregation_DependencyInvertion_Lab.p05_security_system;

import java.io.IOException;
import java.util.Scanner;

public class SecurityManager {

    private SecurityCheck[] securityCheck;

    public SecurityManager(SecurityCheck... securityCheck) {
        this.securityCheck = securityCheck;
    }

    public void check() {
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());
        for (SecurityCheck check : securityCheck) {
            if (check.getId() == option){
                System.out.println(check.validateUser());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ScannerUI scannerUI = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUI);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUI);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.check();
    }
}
