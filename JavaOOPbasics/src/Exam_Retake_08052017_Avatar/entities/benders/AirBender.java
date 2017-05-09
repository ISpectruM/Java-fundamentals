package Exam_Retake_08052017_Avatar.entities.benders;

import java.math.BigDecimal;

public class AirBender extends BaseBender{
    private double aerialIntegrity;

    public AirBender(String name, int power, double aerialIntegrity) {
        super(name, power);
        this.setAerialIntegrity(aerialIntegrity);
        this.modifyStats();
    }

    @Override
    public String toString() {
        return String.format("Air Bender: %s, Power: %d, Aerial Integrity: %.2f",
                super.getName(), super.getPower(), this.getAerialIntegrity());
    }

    private void modifyStats(){
            super.setTotalPower(
                    new BigDecimal(this.getPower() * this.getAerialIntegrity())
            );
    }

    public double getAerialIntegrity() {
        return this.aerialIntegrity;
    }

    private void setAerialIntegrity(double aerialIntegrity) {
        this.aerialIntegrity = aerialIntegrity;
    }
}
