package E_Exsam_Preparation_Paw_Inc.centers;

public class CleansingCenter extends Center{

    public CleansingCenter(String name) {
        super(name);
    }

    public int getWaitingForCleaningCount(){
        return super.getAnimalsForCleaning().size();
    }

}
