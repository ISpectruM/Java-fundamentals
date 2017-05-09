package Exam_Retake_08052017_Avatar.entities.benders;

import java.math.BigDecimal;

public abstract class BaseBender {
    private String name;
    private int power;
    private BigDecimal totalPower;

    public BaseBender(String name, int power) {
        this.setName(name);
        this.setPower(power);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return this.power;
    }

    private void setPower(int power) {
        this.power = power;
    }

    public BigDecimal getTotalPower() {
        return this.totalPower;
    }

    protected void setTotalPower(BigDecimal totalPower) {
        this.totalPower = totalPower;
    }
}
