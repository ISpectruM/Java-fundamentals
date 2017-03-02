package B_Encapsulation.D_ShoppingSpree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<String> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new LinkedList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().length()==0){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(Double money) {
        if (money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<String> getProducts() {
        return Collections.unmodifiableList(this.products);
    }

    public boolean isProductAffordable(Product product){
        if (this.money >= product.getCost()){
            return true;
        }
        return false;
    }

    public void buyProduct(Product product){
        this.products.add(product.getName());
        this.money -= product.getCost();
    }
}
