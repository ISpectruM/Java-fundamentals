package H_IntefaceSegregation_DependencyInvertion_Lab.p01_system_resources;

public class WriterImpl implements Writer{

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
