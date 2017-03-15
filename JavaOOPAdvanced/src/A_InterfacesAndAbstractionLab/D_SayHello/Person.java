package A_InterfacesAndAbstractionLab.D_SayHello;

public interface Person {

    String getName();

    default String sayHello(){
        return "Hello";
    }
}
