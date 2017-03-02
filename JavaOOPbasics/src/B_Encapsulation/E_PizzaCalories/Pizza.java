package B_Encapsulation.E_PizzaCalories;

import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private String name;
    private List<Topping> toppings;
    private Dough dough;

    public Pizza(String name) {
        this.name = name;
        this.toppings = new LinkedList<>();
    }

    private void setName(String name){
        if (name == null || name.trim().length() == 0){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppingsCount(int toppingsCount){
        if (toppingsCount < 0 || toppingsCount > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public double getCalories(){
        double toppingCalories=0.0;
        for (Topping topping : this.toppings) {
            toppingCalories += topping.getTotalCalories();
        }
        return toppingCalories + this.dough.getCalories();
    }
}
