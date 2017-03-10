package E_Exsam_Preparation_Paw_Inc.centers;

import E_Exsam_Preparation_Paw_Inc.animals.Animal;

import java.util.HashSet;

public class AdoptionCenter extends Center{
    private HashSet<Animal> adoptedAnimals;
    private HashSet<Animal> awaitingAdoption;

    public AdoptionCenter(String name) {
        super(name);
        this.adoptedAnimals = new HashSet<>();
        this.awaitingAdoption = new HashSet<>();
    }

    public int getAwaitingAdoptionCount(){
        return this.awaitingAdoption.size();
    }

    @Override
    public void setAnimals(HashSet<Animal> animals) {
        this.adoptedAnimals.addAll(animals);
    }

    public void receiveAnimalForAdoption(Animal animal) {
        this.awaitingAdoption.add(animal);
    }

    public HashSet<Animal> getAwaitingAdoption() {
        return this.awaitingAdoption;
    }

    public HashSet<Animal> getAdoptedAnimals() {
        return this.adoptedAnimals;
    }

}
