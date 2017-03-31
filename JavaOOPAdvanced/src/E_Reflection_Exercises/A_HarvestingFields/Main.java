package E_Reflection_Exercises.A_HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Class richSoilLand = RichSoilLand.class;

		Field[] fields = richSoilLand.getDeclaredFields();
		String input;
		while (!"HARVEST".equals(input = reader.readLine())){

			switch (input){
				case "protected":
					for (Field field : fields) {
						if (Modifier.isProtected(field.getModifiers())){
							System.out.printf("%s %s %s%n",
									Modifier.toString(field.getModifiers()),
									field.getType().getSimpleName(),
									field.getName());
						}
					}
					break;
				case "private":
					for (Field field : fields) {
						if (Modifier.isPrivate(field.getModifiers())){
							System.out.printf("%s %s %s%n",
									Modifier.toString(field.getModifiers()),
									field.getType().getSimpleName(),
									field.getName());
						}
					}
					break;
				case "public":
					Arrays.stream(fields)
							.filter(field -> Modifier.isPublic(field.getModifiers()))
							.forEach(field -> System.out.printf("%s %s %s%n",
                                    Modifier.toString(field.getModifiers()),
                                    field.getType().getSimpleName(),
                                    field.getName()));
					break;
				case "all":
					for (Field field : fields) {
						System.out.printf("%s %s %s%n",
								Modifier.toString(field.getModifiers()),
								field.getType().getSimpleName(),
								field.getName());
					}
					break;
			}
		}
	}
}
