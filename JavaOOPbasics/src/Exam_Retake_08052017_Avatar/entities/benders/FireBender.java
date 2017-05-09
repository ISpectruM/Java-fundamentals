package Exam_Retake_08052017_Avatar.entities.benders;

import java.math.BigDecimal;

public class FireBender extends BaseBender{
    private double heatAggression;

    public FireBender(String name, int power,double heatAggression) {
        super(name, power);
        this.setHeatAggression(heatAggression);
        this.modifyStats();
    }

    @Override
    public String toString() {
        return String.format("Fire Bender: %s, Power: %d, Heat Aggression: %.2f",
                super.getName(), super.getPower(), this.getHeatAggression());
    }


    private void modifyStats(){
            super.setTotalPower(
                    new BigDecimal(this.getPower() * this.getHeatAggression())
            );
    }

    public double getHeatAggression() {
        return heatAggression;
    }

    private void setHeatAggression(double heatAggression) {
        this.heatAggression = heatAggression;
    }
}
