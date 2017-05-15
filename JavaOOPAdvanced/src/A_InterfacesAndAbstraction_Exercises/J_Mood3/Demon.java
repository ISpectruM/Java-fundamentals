package A_InterfacesAndAbstraction_Exercises.J_Mood3;

public class Demon extends Player<Integer, Double>{

    public Demon(String username, int level, double energy) {
        super(username, level, energy);
        this.generatePassword();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ this.getPointsResult();
    }

    public void generatePassword() {
        int hashed = (super.getUsername().length()*217);
        super.setHashedPassword(hashed);
    }

    public Double getPointsResult(){
        return super.getSpecialPoints()*super.getLevel();
    }

}
