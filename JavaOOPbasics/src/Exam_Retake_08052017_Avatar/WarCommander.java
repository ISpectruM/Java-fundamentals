package Exam_Retake_08052017_Avatar;

import Exam_Retake_08052017_Avatar.entities.Nation;
import Exam_Retake_08052017_Avatar.entities.benders.*;
import Exam_Retake_08052017_Avatar.entities.monuments.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;

public class WarCommander {
    private Map<String, Nation> nations;
    private Map<Integer, String> wars;

    public WarCommander() {
        this.nations = new LinkedHashMap<String, Nation>(4){
            {
            put("Air",new Nation());
            put("Water", new Nation());
            put("Fire", new Nation());
            put("Earth", new Nation());
            }
        };
        this.wars = new LinkedHashMap<>();
    }

    public void createBender(String type, String name, int power, double secondaryParameter) {
        BaseBender currBender = null;
        switch (type) {
            case "Air":
                currBender = new AirBender(name, power, secondaryParameter);
                break;
            case "Water":
                currBender = new WaterBender(name, power, secondaryParameter);
                break;
            case "Fire":
                currBender = new FireBender(name, power, secondaryParameter);
                break;
            case "Earth":
                currBender = new EarthBender(name, power, secondaryParameter);
                break;
        }
        this.nations.get(type).addBender(currBender);
    }

    public void createMonument(String type,String name , int affinity){
        BaseMonument currMonument = null;
        switch (type) {
        case "Air":
            currMonument = new AirMonument(name, affinity);
            break;
        case "Water":
            currMonument = new WaterMonument(name, affinity);
            break;
        case "Fire":
            currMonument = new FireMonument(name, affinity);
            break;
        case "Earth":
            currMonument = new EarthMonument(name, affinity);
            break;
        }
        this.nations.get(type).addMonument(currMonument);
    }

    public String getStatus(String type){
        return String.format("%s Nation\n%s",type,this.getNations().get(type).toString());
    }

    public void startWar(String type, int count){

        this.wars.put(count,type);
        BigDecimal result = BigDecimal.ZERO;
        String winner = " ";

        for (String nationType : this.nations.keySet()) {
            BigDecimal nationPower = this.nations.get(nationType).getTotalPower();
            BigDecimal nationBonus = new BigDecimal(this.nations.get(nationType).getMonumentBonus());
            BigDecimal totalPower = nationPower;
            if (!nationBonus.equals(BigDecimal.ZERO)){
                 totalPower = nationPower.add(
                        nationPower.divide(new BigDecimal(100),6,RoundingMode.HALF_UP))
                        .multiply(nationBonus);
            }

            if (totalPower.compareTo(result) > 0){
                result = totalPower;
                winner = nationType;
            }
        }

        for (String nation : this.nations.keySet()) {
            if (!nation.equals(winner)){
                this.nations.get(nation).getBenders().clear();
                this.nations.get(nation).getMonuments().clear();
            }
        }
    }

    public String quit(){
        StringBuilder sb = new StringBuilder();
        for (Integer count : wars.keySet()) {
            sb.append("War ").append(count)
                    .append(" issued by ")
                    .append(this.wars.get(count))
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }


    public Map<String, Nation> getNations() {
        return this.nations;
    }
}
