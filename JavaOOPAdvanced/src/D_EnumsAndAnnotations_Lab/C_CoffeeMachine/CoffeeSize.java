package D_EnumsAndAnnotations_Lab.C_CoffeeMachine;

public enum CoffeeSize {
    SMALL(50,50),NORMAL(100,75),DOUBLE(200,100);

    private int dosage;
    private int price;


    CoffeeSize(int dosage,int price) {
        this.dosage=dosage;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDosage() {
        return this.dosage;
    }

    @Override
    public String toString() {
        String coffeeSize = this.name();

        return coffeeSize.replace(coffeeSize.substring(1),
                coffeeSize.substring(1).toLowerCase());
    }
}
