package A_InterfacesAndAbstractionLab.E_SayHelloExtended;

public interface Person {

    String getName();

    default String sayHello(){
        return "Hello";
    }
}
