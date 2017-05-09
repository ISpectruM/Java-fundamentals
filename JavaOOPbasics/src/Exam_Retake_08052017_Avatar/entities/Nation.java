package Exam_Retake_08052017_Avatar.entities;

import Exam_Retake_08052017_Avatar.entities.benders.BaseBender;
import Exam_Retake_08052017_Avatar.entities.monuments.BaseMonument;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Nation {
    private List<BaseBender> benders;
    private List<BaseMonument> monuments;

    public Nation() {
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Benders:");
        if (this.getBenders().isEmpty()){
            result.append(" None").append(System.lineSeparator());
        } else {
            result.append(System.lineSeparator());
            for (BaseBender bender : this.benders) {
                result.append("###")
                        .append(bender.toString())
                .append(System.lineSeparator())
                ;
            }
        }

        result.append("Monuments:");
        if (this.getMonuments().isEmpty()){
            result.append(" None").append(System.lineSeparator());
        }else {
            result.append(System.lineSeparator());
            for (BaseMonument monument : this.monuments) {
                result.append("###")
                        .append(monument.toString())
                            .append(System.lineSeparator());
            }
        }
        return result.toString();
    }

    public List<BaseBender> getBenders() {
        return this.benders;
    }

    public List<BaseMonument> getMonuments() {
        return this.monuments;
    }

    public void addBender(BaseBender bender) {
        this.benders.add(bender);
    }

    public void addMonument(BaseMonument monument){
        this.monuments.add(monument);
    }

    public BigDecimal getTotalPower(){
        BigDecimal totalPower = new BigDecimal(0);

        for (BaseBender bender : this.benders) {
            totalPower = totalPower.add(bender.getTotalPower());
        }
        return totalPower;
    }

    public int getMonumentBonus(){
        return this.getMonuments()
                .stream()
                .mapToInt(BaseMonument::getBonus)
                .sum();
    }

}
