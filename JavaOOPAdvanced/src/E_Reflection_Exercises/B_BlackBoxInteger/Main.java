package E_Reflection_Exercises.B_BlackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Class blackBox = BlackBoxInt.class;

		HashMap<String,Method> methodsByName = new HashMap<>();

		Method[] methods = blackBox.getDeclaredMethods();
		for (Method method : methods) {
			methodsByName.put(method.getName(),method);
		}

		Constructor[] constructors = blackBox.getDeclaredConstructors();
		Constructor constructor = null;
		for (Constructor con : constructors) {
			if (con.getParameterCount() == 1){
				con.setAccessible(true);
				constructor = con;
			}
		}
		Object instance = constructor.newInstance(0);

		Field[] fields = instance.getClass().getDeclaredFields();
		Field theField = fields[1];
		theField.setAccessible(true);

		String input;
		while (!"END".equals(input = reader.readLine())){
			String[] commands = input.split("_");

			Method method = methodsByName.get(commands[0]);
			method.setAccessible(true);
			method.invoke(instance, Integer.parseInt(commands[1]));
			System.out.println(theField.get(instance));
		}
	}
}
