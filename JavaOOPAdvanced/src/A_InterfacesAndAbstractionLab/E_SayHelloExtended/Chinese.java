package A_InterfacesAndAbstractionLab.E_SayHelloExtended;

public class Chinese extends BasePerson implements Person{

    protected Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
