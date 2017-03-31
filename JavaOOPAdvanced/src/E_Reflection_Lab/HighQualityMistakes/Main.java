package E_Reflection_Lab.HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class reflectionClass = Reflection.class;
        Field[] fields = reflectionClass.getDeclaredFields();



        Method[] declaredMethods = reflectionClass.getDeclaredMethods();

        Method[] allGetters = Arrays.stream(declaredMethods)
                .filter(m -> m.getName().startsWith("get"))
                .toArray(Method[]::new);
        Method[] allSetters = Arrays.stream(declaredMethods)
                .filter(m -> m.getName().startsWith("set"))
                .toArray(Method[]::new);

        Arrays.sort(fields, Comparator.comparing(Field::getName));

        for (Field field : fields) {
            if (!Modifier.isPrivate(field.getModifiers())){
                System.out.printf("%s must be private!%n", field.getName());
            }
        }

        Arrays.sort(allGetters, Comparator.comparing(Method::getName));

        for (Method getter : allGetters) {
            if (!Modifier.isPublic(getter.getModifiers())){
                System.out.printf("%s have to be public!%n", getter.getName());
            }
        }

        Arrays.sort(allSetters,Comparator.comparing(Method::getName));

        for (Method setter : allSetters) {
            if (!Modifier.isPrivate(setter.getModifiers())){

                System.out.printf("%s have to be private!%n", setter.getName());
            }
        }

    }
}
