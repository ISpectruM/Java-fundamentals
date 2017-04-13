package H_IntefaceSegregation_DependencyInvertion_Lab.p02_services;

import java.util.List;

public class CompositeNotificator implements NotificationService{
    private boolean isActive;
    private List<NotificationService> notifications;

    public CompositeNotificator(boolean isActive,List<NotificationService>notifications) {
        this.notifications = notifications;
        this.isActive = isActive;
    }

    @Override
    public void sendNotification() {
        for (NotificationService notification : notifications) {
            if (notification.isActive()){
                notification.sendNotification();
            }
        }
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
