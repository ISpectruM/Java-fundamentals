package E_Exsam_Preparation_Paw_Inc.animals;

public class Dog extends Animal{
    private static final String DEFAULT_CLEAN_STATUS = "UNCLEANSED";
    private int commandsLeaned;
    private String cleanStatus;

    public Dog(String name, int age, int commandsLeaned){
        super(name,age);
        this.commandsLeaned = commandsLeaned;
    }

    public Dog(String name, int age, int commandsLeaned, String adoptionCenter) {
        this(name,age,commandsLeaned);
        super.setAdoptionCenter(adoptionCenter);
        this.cleanStatus = DEFAULT_CLEAN_STATUS;
    }

    protected void setCleanStatus() {
        this.cleanStatus = "CLEANED";
    }

}
