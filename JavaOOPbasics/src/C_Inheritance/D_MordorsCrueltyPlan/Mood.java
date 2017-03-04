package C_Inheritance.D_MordorsCrueltyPlan;

public class Mood extends Happiness{
    private String mood;

    protected String getMood(){
        if (this.getHappinessPoints() < -5){
            this.mood = "Angry";
        } else if( getHappinessPoints() >= -5 && getHappinessPoints() < 0){
            this.mood = "Sad";
        }else if(getHappinessPoints() >= 0 && getHappinessPoints() <= 15){
            this.mood = "Happy";
        } else if (getHappinessPoints() > 15){
            this.mood = "JavaScript";
        }
        return this.mood;
    }
}
