package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.models.units;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_ATTACK = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_ATTACK);
    }
}
