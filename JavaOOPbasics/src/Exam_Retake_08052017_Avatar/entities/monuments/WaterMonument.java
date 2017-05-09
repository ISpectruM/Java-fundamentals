package Exam_Retake_08052017_Avatar.entities.monuments;

public class WaterMonument extends BaseMonument {
    private int waterAffinity;

    public WaterMonument(String name,int waterAffinity) {
        super(name);
        this.setWaterAffinity(waterAffinity);
    }

    public int getBonus() {
        return this.waterAffinity;
    }

    private void setWaterAffinity(int waterAffinity) {
        this.waterAffinity = waterAffinity;
    }
}
