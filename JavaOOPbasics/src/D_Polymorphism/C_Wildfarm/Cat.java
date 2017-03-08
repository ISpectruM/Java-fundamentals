package D_Polymorphism.C_Wildfarm;

import com.sun.corba.se.impl.oa.toa.TOA;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    protected void eat(Food food) {
            super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0");
        df.setMaximumFractionDigits(340);

        return String.format("%1$s[%2$s, %3$s, %4$s, %5$s, %6$d]",
                super.getAnimalType(),
                super.getAnimalName(),
                this.getBreed(),
                df.format(super.getAnimalWeight()),
                super.getLivingRegion(),
                super.getFoodEaten()
        );
    }
}
