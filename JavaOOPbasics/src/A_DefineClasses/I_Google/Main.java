package A_DefineClasses.I_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,Person> persons = new LinkedHashMap<>();
        String input = reader.readLine();
        while (!"End".equals(input)){
            String[] splitedInput = input.split("\\s+");
            String personName = splitedInput[0];
            String personInfo = splitedInput[1];
            Person person = new Person(personName);

            if (!persons.containsKey(personName)){
                persons.put(personName,person);
            }
            Person currPerson = persons.get(personName);

            getPersonInfo(persons, splitedInput, personName, personInfo, currPerson);
            input = reader.readLine();
        }

        printPersonInformation(reader, persons);
    }

    private static void printPersonInformation(BufferedReader reader, LinkedHashMap<String, Person> persons) throws IOException {
        String inputPerson = reader.readLine();
        Person personToPrint = persons.get(inputPerson);
        System.out.println(personToPrint.getName());
        System.out.println("Company:");
        if (personToPrint.getCompany()!=null){
            System.out.printf("%1$s %2$s %3$.2f%n",
                    personToPrint.getCompany().getName(),
                    personToPrint.getCompany().getDepartment(),
                    personToPrint.getCompany().getSalary());
        }

        System.out.println("Car:");
        if (personToPrint.getCar()!= null){
            System.out.printf("%s %d%n",
                    personToPrint.getCar().getModel(),
                    personToPrint.getCar().getSpeed());
        }

        System.out.println("Pokemon:");
        if (personToPrint.getPokemons()!=null){
            personToPrint.getPokemons().forEach(pokemon -> {
                System.out.printf("%s %s%n", pokemon.getName(), pokemon.getType());
            });
        }

        System.out.println("Parents:");
        if (personToPrint.getParents()!=null){
            personToPrint.getParents().forEach(parent -> {
                System.out.printf("%s %s%n", parent.getParentName(), parent.getBirthDay());
            });
        }

        System.out.println("Children:");
        if (personToPrint.getChildren()!=null){
            personToPrint.getChildren().forEach(children -> {
                System.out.printf("%s %s%n", children.getChildName(),children.getChildBirthday());
            });
        }
    }

    private static void getPersonInfo(LinkedHashMap<String, Person> persons, String[] splitedInput, String personName, String personInfo, Person currPerson) {
        switch (personInfo){
            case "company":
                String companyName = splitedInput[2];
                String department = splitedInput[3];
                double salary =Double.parseDouble(splitedInput[4]);
                Company company = new Company(companyName,department,salary);
                currPerson.setCompany(company);
                persons.put(personName,currPerson);
                break;
            case "pokemon":
                String pokemonName = splitedInput[2];
                String pokemonType = splitedInput[3];
                Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                currPerson.addPokemnon(pokemon);
                persons.put(personName,currPerson);
                break;
            case "parents":
                String parentName = splitedInput[2];
                String parentBirthday = splitedInput[3];
                Parent parent = new Parent(parentName,parentBirthday);
                currPerson.addParent(parent);
                persons.put(personName,currPerson);
                break;
            case "children":
                String childName = splitedInput[2];
                String childBirthday = splitedInput[3];
                Children children = new Children(childName,childBirthday);
                currPerson.addChild(children);
                persons.put(personName,currPerson);
                break;
            case "car":
                String carModel = splitedInput[2];
                int carSpeed = Integer.parseInt(splitedInput[3]);
                Car car = new Car(carModel,carSpeed);
                currPerson.setCar(car);
                persons.put(personName,currPerson);
                break;
        }
    }
}
