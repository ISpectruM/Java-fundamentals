package B_Encapsulation.D_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,Person> persons = new LinkedHashMap<>();
        LinkedHashMap<String, Product> products = new LinkedHashMap<>();
        try {
            String[] personTokens = reader.readLine().split(";");
            getPersons(persons, personTokens);

            String[] productTokens = reader.readLine().split(";");
            getProducts(products, productTokens);

            String input;
            while (!"END".equals(input = reader.readLine())) {
                String[] order = input.split("\\s+");
                String buyer = order[0].trim();
                String product = order[1].trim();

                Person currBuyer = persons.get(buyer);
                Product currProduct = products.get(product);

                if (currBuyer.isProductAffordable(currProduct)) {
                    currBuyer.buyProduct(currProduct);
                    persons.put(buyer, currBuyer);
                    System.out.printf("%s bought %s%n", buyer, product);
                } else {
                    System.out.printf("%s can't afford %s%n", buyer, product);
                }
            }
            for (Map.Entry<String, Person> personEntry : persons.entrySet()) {
                System.out.printf("%s - ", personEntry.getKey());
                if (personEntry.getValue().getProducts().size() == 0) {
                    System.out.println("Nothing bought");
                } else {
                    List<String> purchases = personEntry.getValue().getProducts();
                    System.out.println(String.join(", ", purchases));
                }
            }
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void getProducts(LinkedHashMap<String, Product> products, String[] productTokens) {
        for (int i = 0; i < productTokens.length; i++) {
            String[] splittedProducts = productTokens[i].trim().split("=");
            String productName = splittedProducts[0];
            double productPrice = Double.parseDouble(splittedProducts[1]);
            Product product = new Product(productName,productPrice);
            products.put(productName,product);
        }
    }

    private static void getPersons(LinkedHashMap<String, Person> persons, String[] personTokens) {
        for (int i = 0; i < personTokens.length; i++) {
            String[] splittedPerson = personTokens[i].trim().split("=");
            String personName = splittedPerson[0];
            double money = Double.parseDouble(splittedPerson[1]);
            Person person = new Person(personName,money);
            if (!persons.containsKey(personName)){
                persons.put(personName,person);
            }
        }
    }
}
