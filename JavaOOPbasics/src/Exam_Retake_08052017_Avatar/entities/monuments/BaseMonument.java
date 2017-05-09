package Exam_Retake_08052017_Avatar.entities.monuments;

public abstract class BaseMonument {
    private String name;

    public BaseMonument(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public abstract int getBonus();

    @Override
    public String toString() {
        String type = this.getClass().getSimpleName().replace("Monument","");
        return String.format("%s Monument: %s, %s Affinity: %d",
                type, this.getName(),type,this.getBonus());
    }
}
