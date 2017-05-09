package Exam_Retake_08052017_Avatar.entities.benders;

import java.math.BigDecimal;

public class WaterBender extends BaseBender{
    private double waterClarity;

    public WaterBender(String name, int power,double waterClarity) {
        super(name, power);
        this.setWaterClarity(waterClarity);
        this.modifyStats();
    }

    @Override
    public String toString() {
        return String.format("Water Bender: %s, Power: %d, Water Clarity: %.2f",
                super.getName(),super.getPower(),this.getWaterClarity());
    }

    private void modifyStats(){
            super.setTotalPower(
                    new BigDecimal(this.getPower() * this.getWaterClarity())
            );
    }

    public double getWaterClarity() {
        return waterClarity;
    }

    private void setWaterClarity(double waterClarity) {
        this.waterClarity = waterClarity;
    }
}
