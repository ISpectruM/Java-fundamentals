package B_Encapsulation.F_FootballTeamGenerator;


public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;
    private double skillLevel;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setStat("Endurance",endurance);
        this.setStat("Sprint",sprint);
        this.setStat("Dribble",dribble);
        this.setStat("Passing",passing);
        this.setStat("Shooting",shooting);
        this.skillLevel = setSkillLevel();
    }

    private void setStat(String stat,int value) {
        if (value < 0 || value > 100){
            throw new IllegalArgumentException(stat+" should be between 0 and 100.");
        }
        switch (stat){
            case "Endurance":
                this.endurance = value;
                break;
            case "Sprint":
                this.sprint = value;
                break;
            case "Dribble":
                this.dribble = value;
                break;
            case "Passing":
                this.passing = value;
                break;
            case "Shooting":
                this.shooting = value;
                break;
                default:
                    break;
        }
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private double setSkillLevel() {
        return this.skillLevel = (endurance +
                            sprint +
                            dribble +
                            passing +
                            shooting)/5.0;
    }

    public double getSkillLevel() {
        return this.skillLevel;
    }
}
