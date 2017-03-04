package C_Inheritance.D_MordorsCrueltyPlan;

abstract class Happiness {
    private int happinessPoints;


    public int getHappinessPoints() {
        return this.happinessPoints;
    }

    public void eatFood(String food) {
        switch (food){
            case "cram":
                this.happinessPoints += 2;
                break;
            case "lembas":
                this.happinessPoints += 3;
                break;
            case "apple":
                this.happinessPoints += 1;
                break;
            case "melon":
                this.happinessPoints += 1;
                break;
            case "honeycake":
                this.happinessPoints +=5;
                break;
            case "mushrooms":
                this.happinessPoints += -10;
                break;
               default:
                   this.happinessPoints += -1;
                   break;
        }
    }
}
