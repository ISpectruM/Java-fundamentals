package E_Reflection_Lab.B_GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class reflectionClass = Reflection.class;
        Method[] declaredMethods = reflectionClass.getDeclaredMethods();

        Method[] allGetters = Arrays.stream(declaredMethods)
                .filter(m -> m.getName().startsWith("get"))
                .toArray(Method[]::new);
        Method[] allSetters = Arrays.stream(declaredMethods)
                .filter(m -> m.getName().startsWith("set"))
                .toArray(Method[]::new);

        Arrays.sort(allGetters, Comparator.comparing(Method::getName));

        for (Method getter : allGetters) {
            System.out.printf("%s will return %s%n", getter.getName(),getter.getReturnType());
        }

        Arrays.sort(allSetters,Comparator.comparing(Method::getName));

        for (Method setter : allSetters) {
            System.out.printf("%s and will set field of %s%n", setter.getName(),setter.getParameterTypes()[0]);
        }

    }
}
