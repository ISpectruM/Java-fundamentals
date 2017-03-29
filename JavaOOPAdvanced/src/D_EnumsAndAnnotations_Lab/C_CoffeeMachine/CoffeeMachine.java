package D_EnumsAndAnnotations_Lab.C_CoffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffeesSold;
    private List<Coin> coins;

    public CoffeeMachine() {
        this.coffeesSold = new ArrayList<>();
        this.coins = new ArrayList<>();
    }

    public void buyCoffee(String size, String type){
        CoffeeSize coffeeSize = CoffeeSize.valueOf(size.toUpperCase());
        CoffeeType coffeeType = CoffeeType.valueOf(type.toUpperCase());
        Coffee coffee = new Coffee(coffeeSize,coffeeType);
        int coffeePrice = coffee.getCoffeePrice();
        int coinsAvailable = this.coins.stream().mapToInt(Coin::getCoin).sum();
        if (coinsAvailable>coffeePrice){
            this.coffeesSold.add(coffee);
            this.coins.clear();
        }
    }

	public void insertCoin(String coin){
        Coin coin1 = Coin.valueOf(coin.toUpperCase());
        this.coins.add(coin1);
    }

	public Iterable<Coffee> coffeesSold(){
	    return this.coffeesSold;
    }
}
