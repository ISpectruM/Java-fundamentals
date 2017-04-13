package H_IntefaceSegregation_DependencyInvertion_Lab.p02_services;

public class SmsNotificationService implements NotificationService{
    private boolean isActive;

    public SmsNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    public void sendNotification() {
        System.out.println("Sending sms...");
    }

    public boolean isActive() {
        return this.isActive;
    }
}
