package D_EnumsAndAnnotations_Lab.C_CoffeeMachine;

public class Coffee {
    private CoffeeSize coffeeSize;
    private CoffeeType coffeeType;
    private int coffeePrice;

    public Coffee(CoffeeSize coffeeSize, CoffeeType coffeeType) {
        this.coffeeSize = coffeeSize;
        this.coffeeType = coffeeType;
        this.setCoffeePrice(coffeeSize);
    }

    private void setCoffeePrice(CoffeeSize coffeeSize) {
         this.coffeePrice=coffeeSize.getPrice();
    }

    public CoffeeSize getCoffeeSize() {
        return this.coffeeSize;
    }

    public CoffeeType getCoffeeType() {
        return this.coffeeType;
    }

    public int getCoffeePrice() {
        return this.coffeePrice;
    }

    @Override
    public String toString() {
        return String.format("\"%s %s\"",
                this.getCoffeeSize(),
                this.getCoffeeType()
                );
    }
}
