package A_DefineClasses.A_DefineClassPerson;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Person someone = new Person("Pesho");
        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
    }
}

