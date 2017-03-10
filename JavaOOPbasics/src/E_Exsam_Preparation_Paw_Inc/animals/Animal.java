package E_Exsam_Preparation_Paw_Inc.animals;

public abstract class Animal {
    private String name;
    private int age;
    private String adoptionCenter;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }


    protected void setAdoptionCenter(String adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }

    public String getAdoptionCenter() {
        return this.adoptionCenter;
    }

    protected int getAge() {
        return this.age;
    }

}
