package E_Exsam_Preparation_Paw_Inc.centers;

import E_Exsam_Preparation_Paw_Inc.animals.Animal;

import java.util.HashSet;

public abstract class Center {
    private String name;
    private HashSet<Animal> animalsForCleaning;

    protected Center(String name) {
        this.name = name;
        this.animalsForCleaning = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public HashSet<Animal> getAnimalsForCleaning() {
        return this.animalsForCleaning;
    }

    public void setAnimals(HashSet<Animal> animals) {
        this.animalsForCleaning.addAll(animals);
    }

    public void addAnimal(Animal animal){
        this.animalsForCleaning.add(animal);
    }

    public void sendAnimals(){
        this.getAnimalsForCleaning().clear();
    }

}
