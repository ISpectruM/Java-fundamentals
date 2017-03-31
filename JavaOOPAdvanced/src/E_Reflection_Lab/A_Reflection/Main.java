package E_Reflection_Lab.A_Reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class reflectionClass = Reflection.class;
        System.out.println(reflectionClass);
        Class parentClass = reflectionClass.getSuperclass();
        System.out.println(parentClass);
        Class[] reflectionClassInterfaces = reflectionClass.getInterfaces();

        for (Class reflectionClassInterface : reflectionClassInterfaces) {
            System.out.println(reflectionClassInterface);
        }

        Reflection reflection = (Reflection) reflectionClass.newInstance();
        System.out.println(reflection);
    }
}
