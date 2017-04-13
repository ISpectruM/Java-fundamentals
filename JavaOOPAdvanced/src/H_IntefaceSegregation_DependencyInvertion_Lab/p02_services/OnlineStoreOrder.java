package H_IntefaceSegregation_DependencyInvertion_Lab.p02_services;

public class OnlineStoreOrder {
    NotificationService notificationService;

    public OnlineStoreOrder(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void process() {
        if (this.notificationService.isActive()){
            this.notificationService.sendNotification();
        }
    }
}
