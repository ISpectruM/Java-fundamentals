package H_IntefaceSegregation_DependencyInvertion_Lab.p02_services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailNotificationService(false);
        NotificationService sms = new SmsNotificationService(true);
        List<NotificationService> services = new ArrayList<>();
        Collections.addAll(services,email, sms);
        NotificationService service = new CompositeNotificator(
                true, services);

        OnlineStoreOrder storeOrder = new OnlineStoreOrder(service);
        storeOrder.process();
    }
}
