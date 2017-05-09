package Exam_Retake_08052017_Avatar.entities.monuments;

public class EarthMonument extends BaseMonument {
    private int earthAffinity;

    public EarthMonument(String name,int earthAffinity) {
        super(name);
        this.setEarthAffinity(earthAffinity);
    }

    public int getBonus() {
        return this.earthAffinity;
    }

    private void setEarthAffinity(int earthAffinity) {
        this.earthAffinity = earthAffinity;
    }
}
