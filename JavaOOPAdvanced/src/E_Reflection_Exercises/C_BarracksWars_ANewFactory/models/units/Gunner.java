package E_Reflection_Exercises.C_BarracksWars_ANewFactory.models.units;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_ATTACK = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_ATTACK);
    }
}
