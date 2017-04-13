package H_IntefaceSegregation_DependencyInvertion_Lab.p01_system_resources;

public class Main {
    public static void main(String[] args) {
        TimeProvider timeProvider = new TimeProviderImpl();
        Writer writer = new WriterImpl();
        GreetingClock clock  = new GreetingClock(timeProvider,writer);
        clock.greeting();
    }
}
