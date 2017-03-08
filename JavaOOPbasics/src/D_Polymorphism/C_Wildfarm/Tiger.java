package D_Polymorphism.C_Wildfarm;

import java.text.DecimalFormat;

public class Tiger extends Felime{
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    protected void eat(Food food) {
        if (food.getClass().equals(Meat.class)){
            super.setFoodEaten(food.getQuantity());
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0");
        df.setMaximumFractionDigits(340);

        return String.format("%1$s[%2$s, %3$s, %4$s, %5$d]",
                super.getAnimalType(),
                super.getAnimalName(),
                df.format(super.getAnimalWeight()),
                super.getLivingRegion(),
                super.getFoodEaten()
        );

    }
}
