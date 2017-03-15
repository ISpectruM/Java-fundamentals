package A_InterfacesAndAbstractionLab.E_SayHelloExtended;

public class Bulgarian extends BasePerson implements Person{

    protected Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
