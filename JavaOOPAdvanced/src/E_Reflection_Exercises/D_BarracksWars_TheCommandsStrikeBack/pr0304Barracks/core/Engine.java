package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core;

import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.*;
import E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.contracts.Runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Engine implements Runnable {
	private static final String COMMANDS_PACKAGE_NAME =
			"E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.core.commands.";

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpredCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpredCommand(String[] data, String commandName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		try {
			String parsedCommand = commandName.substring(0, 1).toUpperCase() + commandName.substring(1).toLowerCase();
			Class commandClass = Class.forName(COMMANDS_PACKAGE_NAME + parsedCommand + "Command");

			Constructor[] constructors = commandClass.getDeclaredConstructors();
			Object instance = constructors[0]
					.newInstance(data, this.unitFactory, this.repository);

			Method[] methods = commandClass.getDeclaredMethods();
			Method method = null;
			for (Method m : methods) {
				if (m.getName().equals("execute")) {
					method = m;
				}
			}

			return (String) method.invoke(instance);
		}catch (ClassNotFoundException cnfe){
			throw new RuntimeException("Invalid command!");
		}
	}
}
