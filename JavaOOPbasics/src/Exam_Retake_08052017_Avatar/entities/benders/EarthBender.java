package Exam_Retake_08052017_Avatar.entities.benders;

import java.math.BigDecimal;

public class EarthBender extends BaseBender{
    private double groundSaturation;

    public EarthBender(String name, int power,double groundSaturation) {
        super(name, power);
        this.setGroundSaturation(groundSaturation);
        this.modifyStats();
    }

    @Override
    public String toString() {
        return String.format("Earth Bender: %s, Power: %d, Ground Saturation: %.2f",
                super.getName(), super.getPower(), this.getGroundSaturation());
    }

    private void modifyStats(){
            super.setTotalPower(
                    new BigDecimal(this.getPower() * this.getGroundSaturation())
            );
    }

    public double getGroundSaturation() {
        return groundSaturation;
    }

    private void setGroundSaturation(double groundSaturation) {
        this.groundSaturation = groundSaturation;
    }
}
