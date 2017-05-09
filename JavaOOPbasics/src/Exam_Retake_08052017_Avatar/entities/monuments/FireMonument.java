package Exam_Retake_08052017_Avatar.entities.monuments;

public class FireMonument extends BaseMonument{
    private int fireAffinity;

    public FireMonument(String name, int fireAffinity) {
        super(name);
        this.setFireAffinity(fireAffinity);
    }

    public int getBonus() {
        return this.fireAffinity;
    }

    private void setFireAffinity(int fireAffinity) {
        this.fireAffinity = fireAffinity;
    }
}
