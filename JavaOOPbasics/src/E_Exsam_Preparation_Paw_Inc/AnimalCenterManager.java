package E_Exsam_Preparation_Paw_Inc;

import E_Exsam_Preparation_Paw_Inc.animals.Animal;
import E_Exsam_Preparation_Paw_Inc.animals.Cat;
import E_Exsam_Preparation_Paw_Inc.animals.Dog;
import E_Exsam_Preparation_Paw_Inc.centers.AdoptionCenter;
import E_Exsam_Preparation_Paw_Inc.centers.CleansingCenter;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class AnimalCenterManager {
    private TreeMap<String, AdoptionCenter> adoptionCenters;
    private TreeMap<String, CleansingCenter> cleansingCenters;
    private TreeSet<String> adoptedAnimals;
    private TreeSet<String> cleanedAnimals;

    public AnimalCenterManager() {
        this.adoptionCenters = new TreeMap<>();
        this.cleansingCenters = new TreeMap<>();
        this.adoptedAnimals = new TreeSet<>();
        this.cleanedAnimals = new TreeSet<>();
    }

    private void setCleanedAnimals(String cleanedAnimal) {
        this.cleanedAnimals.add(cleanedAnimal);
    }

    private void setAdoptedAnimals(HashSet<Animal> adoptedAnimals) {
        for (Animal adoptedAnimal : adoptedAnimals) {
            this.adoptedAnimals.add(adoptedAnimal.getName());
        }
    }

    public void registerCleansingCenter(String name){
        CleansingCenter cleanCenter = new CleansingCenter(name);
        this.cleansingCenters.put(name,cleanCenter);
    }

    public void registerAdoptionCenter(String name){
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        this.adoptionCenters.put(name,adoptionCenter);
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName){
        Animal dog = new Dog(name,age,learnedCommands,adoptionCenterName);
        AdoptionCenter currCenter = adoptionCenters.get(adoptionCenterName);
        currCenter.addAnimal(dog);
        adoptionCenters.put(adoptionCenterName,currCenter);
    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName){
        Animal cat = new Cat(name,age,intelligenceCoefficient, adoptionCenterName);
        adoptionCenters.get(adoptionCenterName).addAnimal(cat);
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName){
        HashSet<Animal> uncleanedAnimals = new HashSet<>();
        uncleanedAnimals.addAll(this.adoptionCenters.get(adoptionCenterName).getAnimalsForCleaning());
        this.adoptionCenters.get(adoptionCenterName).sendAnimals();
        this.cleansingCenters.get(cleansingCenterName).setAnimals(uncleanedAnimals);
    }

    public void cleanse(String cleansingCenterName){
        HashSet<Animal> uncleanedAnimals = this.cleansingCenters.get(cleansingCenterName).getAnimalsForCleaning();
        for (Animal uncleanedAnimal : uncleanedAnimals) {
            this.adoptionCenters.get(uncleanedAnimal.getAdoptionCenter())
                    .receiveAnimalForAdoption(uncleanedAnimal);
            this.setCleanedAnimals(uncleanedAnimal.getName());
        }
        this.cleansingCenters.get(cleansingCenterName).getAnimalsForCleaning().clear();
    }

    public void adopt(String adoptionCenterName){
        HashSet<Animal> forAdoption = adoptionCenters.get(adoptionCenterName).getAwaitingAdoption();
        adoptionCenters.get(adoptionCenterName).setAnimals(forAdoption);
        this.setAdoptedAnimals(forAdoption);
        adoptionCenters.get(adoptionCenterName).getAwaitingAdoption().clear();
    }

    public void printStatistics(){
        System.out.printf("Paw Incorporative Regular Statistics%n" +
                        "Adoption Centers: %1$d%n" +
                        "Cleansing Centers: %2$d%n" +
                        "Adopted Animals: %3$s%n" +
                        "Cleansed Animals: %4$s%n" +
                        "Animals Awaiting Adoption: %5$d%n" +
                        "Animals Awaiting Cleansing: %6$d%n",
                this.adoptionCenters.size(),
                this.cleansingCenters.size(),
                this.adoptedAnimals.size() > 0 ? String.join(", ",this.adoptedAnimals): "None",
                this.cleanedAnimals.size() > 0 ? String.join(", ",this.cleanedAnimals): "None",
                this.getWaitingForAdoptionCount(),
                this.getWaitingForCleaningCount()
                );

    }

    private int getWaitingForAdoptionCount(){
        return this.adoptionCenters.values().stream()
                .mapToInt(AdoptionCenter::getAwaitingAdoptionCount)
                .sum();
    }

    private int getWaitingForCleaningCount(){
        return this.cleansingCenters.values().stream()
                .mapToInt(CleansingCenter::getWaitingForCleaningCount)
                .sum();
    }


}
