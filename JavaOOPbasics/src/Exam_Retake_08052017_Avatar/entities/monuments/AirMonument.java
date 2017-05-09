package Exam_Retake_08052017_Avatar.entities.monuments;

public class AirMonument extends BaseMonument{
    private int airAffinity;

    public AirMonument(String name,int airAffinity) {
        super(name);
        this.setAirAffinity(airAffinity);
    }

    public int getBonus() {
        return this.airAffinity;
    }

    private void setAirAffinity(int airAffinity) {
        this.airAffinity = airAffinity;
    }
}
