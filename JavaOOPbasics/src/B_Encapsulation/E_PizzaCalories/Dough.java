package B_Encapsulation.E_PizzaCalories;

public class Dough {
    private static final int DEFAULT_CALORIES = 2;
    private String flourType;
    private String bakingType;
    private double weight;

    public Dough(String flourType, String bakingType, double weight) {
        this.setFlourType(flourType);
        this.setBakingType(bakingType);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        String toLowerCase = flourType.toLowerCase();
        if (!"white".equals(toLowerCase) && !"wholegrain".equals(toLowerCase)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingType(String bakingType) {
        String toLowerCase = bakingType.toLowerCase();
        if (!"crispy".equals(toLowerCase) &&
                !"chewy".equals(toLowerCase) &&
                !"homemade".equals(toLowerCase)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingType = bakingType;
    }

    private void setWeight(double weight) {
        if (weight <1 || weight > 200 ){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private double getFlourModifier(){
        double modifier = 0d;
        String toLowerCase= this.flourType.toLowerCase();
        switch (toLowerCase){
            case "white":
                modifier = 1.5;
                break;
            case "wholegrain":
                modifier = 1.0;
                break;
            default:
                    break;
        }
        return modifier;
    }

    private double getBakeModifier() {
        double modifier = 0d;
        String toLowerCase = this.bakingType.toLowerCase();
        switch (toLowerCase){
            case "crispy":
                modifier = 0.9;
                break;
            case "chewy":
                modifier = 1.1;
                break;
            case "homemade":
                modifier = 1.0;
            default:
                break;
        }
        return modifier;
    }


    public double getCalories(){
        double totalCalories = weight*DEFAULT_CALORIES*getFlourModifier()*getBakeModifier();
        return totalCalories;
    }

}
