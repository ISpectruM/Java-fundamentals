package D_EnumsAndAnnotations_Lab.C_CoffeeMachine;

public enum CoffeeType {
    ESPRESSO, LATTE, IRISH;

    @Override
    public String toString() {
        String coffeeType = this.name();

        return coffeeType.replace(coffeeType.substring(1),
                coffeeType.substring(1).toLowerCase());
    }
}
