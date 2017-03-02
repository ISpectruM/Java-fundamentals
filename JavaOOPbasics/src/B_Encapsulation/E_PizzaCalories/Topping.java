package B_Encapsulation.E_PizzaCalories;

public class Topping {
    private static final int DEFAULT_CALORIES = 2;
    private String type;
    private double weight;

    public Topping(String type, double weight) {
        this.setType(type);
        this.setWeight(weight);
    }

    private void setType(String type) {
        String toLowerCase = type.toLowerCase();
        if (!"meat".equals(toLowerCase) &&
                !"veggies".equals(toLowerCase) &&
                !"cheese".equals(toLowerCase) &&
                !"sauce".equals(toLowerCase)){
            throw new IllegalArgumentException("Cannot place " +type+ " on top of your pizza.");
        }
        this.type = type;
    }

    private void setWeight(double weight) {
        if (weight <1 || weight > 50){
            throw new IllegalArgumentException(this.type+" weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    private double getTypeModifier(){
        double modifier=0.0;
        String toLowerCase = this.type.toLowerCase();
        switch (toLowerCase){
            case "meat":
                modifier = 1.2;
                break;
            case "veggies":
                modifier = 0.8;
                break;
            case "cheese":
                modifier = 1.1;
                break;
            case "sauce":
                modifier = 0.9;
                break;
                default:
                    break;
        }
        return modifier;
    }

    public double getTotalCalories(){
        return this.weight*DEFAULT_CALORIES*getTypeModifier();
    }
}
