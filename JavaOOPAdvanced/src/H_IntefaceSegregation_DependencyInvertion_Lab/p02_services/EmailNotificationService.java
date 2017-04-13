package H_IntefaceSegregation_DependencyInvertion_Lab.p02_services;

public class EmailNotificationService implements NotificationService{

    private boolean isActive;

    public EmailNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    public void sendNotification() {
        System.out.println("Sending mail...");
    }

    public boolean isActive() {
        return this.isActive;
    }
}
