package A_InterfacesAndAbstraction_Exercises.J_Mood3;

public class Archangel extends Player<String, Integer>{

    public Archangel(String username, int level, int mana) {
        super(username, level, mana);
        this.generatePassword();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ this.getPointsResult();
    }


    protected void generatePassword() {
        int hashedName = (super.getUsername().length()*21);
        StringBuilder sb = new StringBuilder(super.getUsername());
        String reversed = sb.reverse().toString();
        super.setHashedPassword(reversed + String.valueOf(hashedName));
    }

    public Integer getPointsResult(){
        return super.getSpecialPoints()*super.getLevel();
    }

}
