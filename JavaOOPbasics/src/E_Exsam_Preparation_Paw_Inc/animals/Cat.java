package E_Exsam_Preparation_Paw_Inc.animals;

public class Cat extends Animal{
    private static final String DEFAULT_CLEAN_STATUS = "UNCLEANSED";
    private int intelligence;
    private String cleanStatus;

    public Cat(String name, int age, int intelligence){
        super(name,age);
        this.intelligence = intelligence;
    }

    public Cat(String name, int age, int intelligence, String adoptionCenter) {
        this(name,age, intelligence);
        super.setAdoptionCenter(adoptionCenter);
        this.cleanStatus = DEFAULT_CLEAN_STATUS;
    }

    protected void setCleanStatus() {
        this.cleanStatus = "CLEANED";
    }

}
